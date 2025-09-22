package com.mycondo.app.controller;

import com.mycondo.app.service.document.DocumentMgt;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/file")
public class DocumentMgtController {

    private  final DocumentMgt documentMgt;

    /**
     *
     * @param objectKey
     * @return
     */
    @GetMapping("/init-upload")
    public URL uploadFile(@RequestBody String objectKey) {
        return this.documentMgt.initiateUpload(objectKey);
    }

    /**
     *
     * @param objectKey
     * @return
     */
    @PostMapping("/confirm/upload")
    public void confirmUpload(@RequestBody String objectKey){
        this.documentMgt.confirmUpload(objectKey);
    }

    @DeleteMapping()
    public void deleteFiles(@RequestBody List<String> objectKeys){

        if(objectKeys.size() == 1){
            this.documentMgt.deleteDocument(objectKeys.getFirst());
        }

    }
}
