package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Wojciech Wasilewski
 * @date Created on 09.07.2019
 */

@RestController
public class FunRestController {

    // inject properties for student.name and team.name
    @Value("${student.name}")
    private String studentName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Student: " + studentName + ", Team: " + teamName;
    }

    // expose "/" with Hello World and time
    @GetMapping("/")
    public String sayHello() {
        return "Hello World, time on the server is: " + LocalDateTime.now();
    }

    // expose "/workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run 5km";
    }

    // expose "hobby"
    @GetMapping("/hobby")
    public String getWork() {
        return "Time to play some tennis";
    }
}
