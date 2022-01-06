package edu.zjnu.autumn.factory;

/**
 * @description: PropertyValue
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public class PropertyValue {
    private String name;

    private Object value;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}