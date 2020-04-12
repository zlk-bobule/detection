package com.nju.detection.enums;

public enum NodeType {
    INTERNAL("类或包是所分析项目为内部对象", 0),EXTERNAL("类或包是所分析项目为从外部库检索的对象", 1);

    public String value;

    private Integer code;

    NodeType(String value, Integer code){
        this.value=value;
        this.code = code;
    }
}
