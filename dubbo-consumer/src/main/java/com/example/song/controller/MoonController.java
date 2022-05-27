package com.example.song.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import com.example.song.MoonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moon")
public class MoonController {
    public static final Logger logger = LoggerFactory.getLogger(MoonController.class);
    @DubboReference
    private MoonService moonService;

    @RequestMapping("/see")
    public String seeMoon(String name) {
        return moonService.seeMoon(name);
    }

}
