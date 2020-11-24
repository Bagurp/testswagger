package com.example.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.multipart.CompletedFileUpload;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.validation.constraints.NotNull;

@Validated
@Controller("/file")
@Tag(name = "file")
public class FileUploadController {

    /**
     * Takes in a file, returns it back
     *
     * @param file, the file to upload
     * @return {@link HttpResponse<CompletedFileUpload>} Returns uploaded file
     */
    @Post(consumes = MediaType.MULTIPART_FORM_DATA)
    public HttpResponse<CompletedFileUpload> upload(@Body @NotNull CompletedFileUpload file) {
        return HttpResponse
                .status(HttpStatus.OK)
                .body(file);
    }
}
