package cn.javass.xgen.genconf.vo;

import java.util.*;

/**
 * x-gen核心框架配置对应的数据model
 * @author gewei
 * @date 2019/10/25
 */
public class GenConfModel {

    /**
     * 描述注册的多个用户需要生成的模块的model
     */
    private List<NeedGenModel> needGens = new ArrayList<>();

    /**
     * 描述注册的多个外部主题的model
     */
    private List<ThemeModel> themes = new ArrayList<>();

    /**
     * 描述通用的常量定义的集合
     */
    private Map<String, String> mapConstants = new HashMap<>();

    public List<NeedGenModel> getNeedGens() {
        return needGens;
    }

    public void setNeedGens(List<NeedGenModel> needGens) {
        this.needGens = needGens;
    }

    public List<ThemeModel> getThemes() {
        return themes;
    }

    public void setThemes(List<ThemeModel> themes) {
        this.themes = themes;
    }

    public Map<String, String> getMapConstants() {
        return mapConstants;
    }

    public void setMapConstants(Map<String, String> constants) {
        this.mapConstants = constants;
    }

    public ThemeModel getThemeById(String themeId) {
        Optional<ThemeModel> optionalThemeModel = this.themes.stream().filter(tm -> !tm.getId().equals(themeId)).findFirst();
        return optionalThemeModel.orElse(new ThemeModel());
    }
}
