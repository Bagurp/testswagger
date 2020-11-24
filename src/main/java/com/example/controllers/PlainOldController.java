package com.example.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.annotation.Nullable;

@Controller("/plain")
@Tag(name = "plain old controller")
public class PlainOldController {

    /**
     * Get character array for the name
     *
     * @param {name}, name of the user
     * @return {@link HttpResponse <char[]>} Returns a character array of the user name
     */
    @Get()
    public HttpResponse<char[]> findDocuments(@Nullable String name) {
        return HttpResponse
                .status(HttpStatus.OK)
                .body(name.toCharArray());
    }
}
