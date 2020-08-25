package com.wonder.controller;

import com.wonder.mapper1.FlowerMapper;
import com.wonder.poro.Flower;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    FlowerMapper flowerMapper;
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public Flower hello(){
        return flowerMapper.findAll(1);
    }
}
