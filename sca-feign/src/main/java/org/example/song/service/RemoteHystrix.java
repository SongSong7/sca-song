package org.example.song.service;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteService {
    @Override
    public String hello() {
        return "access timeout ...";
    }
}
