package cn.javass.xgen.genconf;

import cn.javass.xgen.genconf.confManager.ConfManager;
import cn.javass.xgen.genconf.implementors.GenConfImplementor;
import cn.javass.xgen.genconf.vo.GenConfModel;
import cn.javass.xgen.genconf.vo.ModuleConfModel;

import java.util.Map;

/**
 * 负责完成配置管理模块的业务功能
 *
 * @author gewei
 * @date 2019/10/25
 */
public class GenConfEbo implements GenConfEbi {
    private static GenConfEbo ebo = null;

    private GenConfEbo(GenConfImplementor provider) {
        this.provider = provider;
    }

    public static GenConfEbo getInstance(GenConfImplementor provider) {
        if (ebo == null) {
            ebo = new GenConfEbo(provider);
        }
        return ebo;
    }

    /**
     * 持有获取核心框架
     */
    private GenConfImplementor provider = null;
    @Override
    public GenConfModel getGenConf() {
        // 获取相应的配置数据
        return ConfManager.getInstance(provider).getGenConf();
    }

    @Override
    public Map<String, ModuleConfModel> getMapModuleConf() {
        // 获取相应的配置数据
        return ConfManager.getInstance(provider).getMapModuleConf();
    }
}
