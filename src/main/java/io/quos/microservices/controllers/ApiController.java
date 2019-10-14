package io.quos.microservices.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/")
public class ApiController {

    @Get("/")
    String index(){
        return "Zuuupp";
    }
}
