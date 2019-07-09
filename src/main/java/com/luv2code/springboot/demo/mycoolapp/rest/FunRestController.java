package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Wojciech Wasilewski
 * @date Created on 09.07.2019
 */

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World, time on the server is: " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run 5km";
    }

    @GetMapping("/hobby")
    public String getWork() {
        return "Time to play some tennis";
    }
}
