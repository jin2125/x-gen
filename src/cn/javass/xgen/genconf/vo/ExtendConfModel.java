package cn.javass.xgen.genconf.vo;

/**
 * @author gewei
 * @date 2019/10/25
 */
public class ExtendConfModel {

    private String id;
    private String value;
    private String[] values;
    private boolean single = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
}
