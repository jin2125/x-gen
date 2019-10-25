package cn.javass.xgen.genconf.implementors;

import cn.javass.xgen.genconf.vo.NeedGenModel;
import cn.javass.xgen.genconf.vo.ThemeModel;

import java.util.List;
import java.util.Map;

/**
 * 获取核心框架配置数据的接口
 *
 * @author gewei
 * @date 2019/10/25
 */
public interface GenConfImplementor {
    /**
     * 获取核心框架配置中注册的需要生成的模块的配置数据
     * @return
     */
    List<NeedGenModel> getNeedGens();

    /**
     * 外部主题的配置数据
     * @return
     */
    List<ThemeModel> getThemes();

    /**
     * 定义的公共常量
     * @return
     */
    Map<String,String> getMapConstants();

}
