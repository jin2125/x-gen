package cn.javass.xgen.genconf.implementors;

import cn.javass.xgen.genconf.vo.ExtendConfModel;
import cn.javass.xgen.genconf.vo.ModuleConfModel;
import cn.javass.xgen.genconf.vo.NeedGenModel;
import cn.javass.xgen.genconf.vo.ThemeModel;

import java.util.List;
import java.util.Map;

/**
 * 获取核心框架
 *
 * @author gewei
 * @date 2019/10/25
 */
public interface ModuleGenConfImplementor {
    /**
     * 根据核心框架里面注册的需要生成模块的配置参数，来获取相应的需要生成模块的配置数据model，数据只有基本部分
     *
     * @param param 在核心框架里面注册的需要生成模块
     * @return
     */
    ModuleConfModel getBaseModuleConfModel(Map<String, String> param);

    Map<String, List<String>> getMapNeedGenTypes(Map<String, String> param);

    Map<String, ExtendConfModel> getMapExtends(Map<String, String> param);
}
