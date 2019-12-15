/*
 */
package com.example.coveragetest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cjayawickrema
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "age", required = false) String age) {

        String s;

        if (name != null) {
            s = "Hello " + name;
        } else if (age != null) {
            s = "Your age is " + age;
        } else {
            s = "Greetings!";
        }

        return s;
    }

}
