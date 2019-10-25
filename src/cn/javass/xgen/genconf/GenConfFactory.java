package cn.javass.xgen.genconf;

import cn.javass.xgen.genconf.implementors.GenConfImplementor;

/**
 * @author gewei
 * @date 2019/10/25
 */
public class GenConfFactory {
    private GenConfFactory() {

    }

    public static GenConfEbi createGenConfEbi(GenConfImplementor provider) {
        return GenConfEbo.getInstance(provider);
    }
}
