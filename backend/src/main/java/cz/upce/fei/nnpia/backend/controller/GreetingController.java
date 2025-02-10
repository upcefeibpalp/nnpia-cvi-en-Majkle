package cz.upce.fei.nnpia.backend.controller;

import cz.upce.fei.nnpia.backend.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return greetingService.greet(name);
    }
}
