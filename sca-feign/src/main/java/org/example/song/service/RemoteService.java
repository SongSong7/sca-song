package org.example.song.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sca-provider", fallback = RemoteHystrix.class)
public interface RemoteService {
    @GetMapping("/hello")
    String hello();
}
