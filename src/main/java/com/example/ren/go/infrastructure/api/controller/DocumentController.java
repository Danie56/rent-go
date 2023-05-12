package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.DocumentAplication;
import com.example.ren.go.domain.entites.Document;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")

public class DocumentController {
    private DocumentAplication documentAplication;

    @PostMapping("/save_document")
    public void saveDocument(@RequestBody Document document){
        documentAplication.saveDocument(document);
    }
    @DeleteMapping("/delete_document/{id}")
    public void deleteDocument(@PathVariable String id){
        documentAplication.deleteDocument(id);
    }
    @GetMapping("/get_document/{id}")
    public ResponseEntity<Document> getDocument(@PathVariable String id){
        return new ResponseEntity<>(documentAplication.getDocument(id), HttpStatus.OK);

    }
    @GetMapping("/get_all_document")
    public ResponseEntity<List<Document>> getDocument(){
        return new ResponseEntity<>(documentAplication.getAllDocument(), HttpStatus.OK);

    }
    @PutMapping("/update_document/{id}")
    public ResponseEntity<Document> updateDocument(@RequestBody Document document, @PathVariable String id){
        return new ResponseEntity<>(documentAplication.updateDocument(document,id),HttpStatus.OK);
    }
    @GetMapping("/get_documents_by_car/{id}")
    public ResponseEntity<List<Document>> getDocumentsByCar(@PathVariable String id){
        return new ResponseEntity<>(documentAplication.getDocumentsByCar(id), HttpStatus.OK);

    }





}
