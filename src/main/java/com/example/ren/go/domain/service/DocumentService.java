package com.example.ren.go.domain.service;

import com.example.ren.go.domain.entites.Document;

import java.util.List;

public interface DocumentService {

    void saveDocument(Document document);
    void deleteDocument(String id);
    Document getDocument(String id);
    List<Document> getAllDocument();
    Document updateDocument(Document document, String id);

    List<Document> getDocumentsByCar(String id);
}
