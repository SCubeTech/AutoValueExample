package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class DataServiceImpl implements DataService {


    @Override
    public DemoModel insertProperties(DemoModel model) {
        return model;
    }
}
