package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private DataService dataService;

    @Autowired
    DemoController(DataService dataService){
        this.dataService=dataService;
    }

        @PostMapping("/post/properties")
    public ResponseEntity<DemoModel> setProperties(@RequestBody DemoModel model){
        return ResponseEntity.ok(dataService.insertProperties(model));
    }
}
