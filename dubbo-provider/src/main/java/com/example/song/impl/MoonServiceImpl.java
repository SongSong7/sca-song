package com.example.song.impl;

import org.apache.dubbo.config.annotation.DubboService;
import com.example.song.MoonService;

@DubboService
public class MoonServiceImpl implements MoonService {
    @Override
    public String seeMoon(String name) {
        return "the moon is so beautiful,yes?" + name;
    }
}
