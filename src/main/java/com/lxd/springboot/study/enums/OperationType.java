package com.lxd.springboot.study.enums;

public enum OperationType {

    UNKNOWN("unknown"),
    INSERT("insert"),
    DELETE("delete"),
    UPDATE("update"),
    SELECT("select");

    private String value;

    public String getValue() {
        return value;
    }

    OperationType(String value){
        this.value = value;
    }
}
