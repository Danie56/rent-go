package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.DocumentAplication;
import com.example.ren.go.domain.entites.Documet;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")

public class DocumentController {
    private DocumentAplication documentAplication;

    @PostMapping("/save_document")
    public void saveDocument(@RequestBody Documet document){
        documentAplication.saveDocument(document);
    }



}
