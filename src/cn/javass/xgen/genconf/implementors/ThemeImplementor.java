package cn.javass.xgen.genconf.implementors;

import cn.javass.xgen.genconf.vo.ExtendConfModel;
import cn.javass.xgen.genconf.vo.GenTypeModel;
import cn.javass.xgen.genconf.vo.ModuleConfModel;

import java.util.List;
import java.util.Map;

/**
 * 获取核心框架
 *
 * @author gewei
 * @date 2019/10/25
 */
public interface ThemeImplementor {
    Map<String, GenTypeModel> getMapGenTypes(String themeId, Map<String, String> params);

    Map<String, String> getMapGenOutTypes(String themeId, Map<String, String> params);

    Map<String, String> getMapProviders(String themeId, Map<String, String> params);
}
