package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.CarDocumentAplication;
import com.example.ren.go.domain.entites.CarDocument;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class CarDocumentController {
    private final CarDocumentAplication carDocumentAplication;
    @PostMapping("/save_car_document")
    public void saveDocument(@RequestBody CarDocument carDocument){
        carDocumentAplication.saveCarDocument(carDocument);
    }
}
