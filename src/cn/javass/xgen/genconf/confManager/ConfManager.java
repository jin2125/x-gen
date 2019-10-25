package cn.javass.xgen.genconf.confManager;

import cn.javass.xgen.genconf.implementors.GenConfImplementor;
import cn.javass.xgen.genconf.implementors.ModuleGenConfImplementor;
import cn.javass.xgen.genconf.vo.GenConfModel;
import cn.javass.xgen.genconf.vo.ModuleConfModel;
import cn.javass.xgen.genconf.vo.NeedGenModel;
import cn.javass.xgen.genconf.vo.ThemeModel;

import java.util.HashMap;
import java.util.Map;

/**
 * 负责真正去获取配置数据，并缓存配置功能
 *
 * @author gewei
 * @date 2019/10/25
 */
public class ConfManager {
    private static ConfManager manager = null;

    private ConfManager(GenConfImplementor provider) {
        readConf(provider);
    }

    public static ConfManager getInstance(GenConfImplementor provider) {
        if (manager == null) {
            manager = new ConfManager(provider);
        }
        return manager;
    }

    /**
     * 定义需要缓存的数据
     */
    private GenConfModel genConf = new GenConfModel();
    private Map<String, ModuleConfModel> mapModuleConf = new HashMap<>();


    private void readConf(GenConfImplementor provider) {
        // 这里去真正的获取的配置数据
        readGenConf(provider);
        for (NeedGenModel ngm : genConf.getNeedGens()) {

        }
    }

    public GenConfModel getGenConf() {
        return this.genConf;
    }

    public Map<String, ModuleConfModel> getMapModuleConf() {
        return this.mapModuleConf;
    }

    private void readGenConf(GenConfImplementor provider) {
        genConf.setNeedGens(provider.getNeedGens());
        genConf.setThemes(provider.getThemes());
        genConf.setMapConstants(provider.getMapConstants());
    }

    private void readOneModuleGenConf(NeedGenModel ngm) {
        ModuleConfModel mcm = new ModuleConfModel();
        String providerClassName = this.genConf.getThemeById(ngm.getTheme()).getMapProviders().get(ngm.getProvider());
        ModuleGenConfImplementor userGenConfImpl = null;

        try {
            userGenConfImpl = (ModuleGenConfImplementor) Class.forName(providerClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mcm = userGenConfImpl.getBaseModuleConfModel(ngm.getMapParams());
        mcm.setUseTheme(ngm.getTheme());
        mcm.setMapNeedGenTypes(userGenConfImpl.getMapNeedGenTypes(ngm.getMapParams()));
        mcm.setMapExtends(userGenConfImpl.getMapExtends(ngm.getMapParams()));
        // 设置到缓存里面
        this.mapModuleConf.put(ngm.getId(), mcm);
    }


}
