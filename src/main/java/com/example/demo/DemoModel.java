package com.example.demo;

import com.google.auto.value.AutoValue;

import java.util.List;

public  class DemoModel {

    public  String resource_name;

    public  List<PropertiesValue> propertiesValueList;

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }
}
