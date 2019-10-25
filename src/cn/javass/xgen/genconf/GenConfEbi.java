package cn.javass.xgen.genconf;

import cn.javass.xgen.genconf.vo.GenConfModel;
import cn.javass.xgen.genconf.vo.ModuleConfModel;

import java.util.Map;

/**
 * @author gewei
 * @date 2019/10/25
 */
public interface GenConfEbi {

    /**
     * 获取x-gen核心框架运行所需要的配置数据model
     *
     * @return
     */
    GenConfModel getGenConf();

    /**
     * 获取需要生成的所有模块的配置
     * @return 包含所有需要生成的所有模块的配置数据的map，key-模块的ID，value-相应的模块的配置数据的model
     */
    Map<String, ModuleConfModel> getMapModuleConf();


}
