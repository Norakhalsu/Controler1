package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Controller {

    @GetMapping("/name")
    public String getname(){
        return "My name is ..... ";
    }

    @GetMapping("/age")
    public String getAge() {
        return "My age is .......";
    }
    @GetMapping("/check/status")
    public String getStatus() {
        return " Everything OK ";
    }
    @GetMapping("/health")
    public String getHealth() {
        return " Server health is up and running ";
    }
    @GetMapping("/names")
    public String[] getNames() {
        return new String[] { "Name..A", "Name..B", "Name..C" };
    }
}
