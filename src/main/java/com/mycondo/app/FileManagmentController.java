package com.mycondo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileManagmentController {

    @GetMapping("/upload")
    public String uploadFile() {
        return "File uploaded successfully";
    }
}
