package com.nju.detection.enums;

public enum NodeModifier {
    ABSTRACT("指示类是抽象类", 0),INTERFACE("指示类是接口", 1);

    public String value;

    private Integer code;

    NodeModifier(String value, Integer code){
        this.value=value;
        this.code = code;
    }
}
