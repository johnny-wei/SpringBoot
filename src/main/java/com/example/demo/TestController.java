package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vic on 2017/5/13.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHi(){

        return "hello spring boot!";
    }
}
