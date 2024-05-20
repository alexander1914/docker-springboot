package com.springboot.docker.app.Springdocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/docker")
public class DockerController {

    @GetMapping(value = "/healthcheck")
    public HttpStatus healthcheck(){
        return HttpStatus.OK;
    }
}
