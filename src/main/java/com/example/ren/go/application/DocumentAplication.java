package com.example.ren.go.application;

import com.example.ren.go.domain.entites.Documet;
import com.example.ren.go.domain.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DocumentAplication {
    private final DocumentService documentService;

    public void saveDocument(Documet documet){

        documentService.saveDocument(documet);
    }



}
