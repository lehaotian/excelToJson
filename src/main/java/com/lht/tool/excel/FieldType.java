package com.lht.tool.excel;

import java.util.List;
import java.util.Map;

/**
 * 字段类型
 *
 * @author 乐浩天
 * @date 2022/9/15 23:33
 */
public enum FieldType {
    /**
     * 数字
     */
    INT("int", int.class),
    /**
     * 字符串
     */
    STR("str", String.class),
    /**
     * 布尔值
     */
    BOL("bol", boolean.class),
    /**
     * 枚举
     */
    ENUM("enum", int.class),
    /**
     * 数组
     */
    ARR("arr", List.class),
    /**
     * map
     */
    MAP("map", Map.class),
    ;
    private final String name;
    private final Class<?> clazz;

    FieldType(String name, Class<?> clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public static FieldType getType(String name) {
        name = name.trim().toLowerCase();
        for (FieldType value : values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return STR;
//        throw new RuntimeException("没有字段类型" + name);
    }

    public String getName() {
        return name;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}