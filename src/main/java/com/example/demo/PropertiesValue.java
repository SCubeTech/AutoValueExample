package com.example.demo;

import com.google.auto.value.AutoValue;

public class PropertiesValue {

    private String parameter_name;

    public String getParameter_name() {
        return parameter_name;
    }

    public void setParameter_name(String parameter_name) {
        this.parameter_name = parameter_name;
    }

    private String parameter_value;

    public String getParameter_value() {
        return parameter_value;
    }

    public void setParameter_value(String parameter_value) {
        this.parameter_value = parameter_value;
    }
}
