package com.gabensoft.helloworld1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BasicController {
    @GetMapping("/HolaMundo")
    public String hello() {
        log.info("ejecutando el RestController");
        log.debug("y si funciona");
        return "hello";
    }
}
