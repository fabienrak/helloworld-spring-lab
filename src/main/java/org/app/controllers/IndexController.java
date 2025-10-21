package org.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("hello")
    public String sayHelloString(){
        return "################## hELLo WORLLD #########################";
    }

    @GetMapping("addition/{x}/{y}")
    public Integer addNumber(@PathVariable Integer x, @PathVariable Integer y){

        return x + y;
    }
}
