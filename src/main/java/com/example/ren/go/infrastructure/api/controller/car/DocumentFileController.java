package com.example.ren.go.infrastructure.api.controller.car;

import com.example.ren.go.application.car.DocumentFileAplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class DocumentFileController {

    private DocumentFileAplication documentFileAplication;
    @PostMapping("/loard_document")
    public void loardDocument(@RequestParam("file") MultipartFile multipartFile, @RequestParam("idCar") String idCar) throws IOException {
        documentFileAplication.loardDocument(multipartFile,idCar);
    }
    @PostMapping("/loard_documents")
    public void loardDocuments(@RequestParam("files") List<MultipartFile> multipartFiles, @RequestParam("idCar") String idCar)  {
        documentFileAplication.loardDocuments(multipartFiles,idCar);
    }


}
