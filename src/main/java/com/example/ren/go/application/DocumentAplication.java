package com.example.ren.go.application;

import com.example.ren.go.domain.entites.car.Document;
import com.example.ren.go.domain.service.car.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentAplication {
    private final DocumentService documentService;

    public void saveDocument(Document document){

        documentService.saveDocument(document);
    }
    public void deleteDocument(String id){

        documentService.deleteDocument(id);
    }
    public Document getDocument(String id){

         return documentService.getDocument(id);
    }
    public List<Document> getAllDocument(){

         return documentService.getAllDocument();
    }
    public Document updateDocument(Document document, String id){

        return documentService.updateDocument(document, id);
    }
    public List<Document> getDocumentsByCar(String id){

        return documentService.getDocumentsByCar(id);
    }




}
