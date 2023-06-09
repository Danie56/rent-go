package com.example.ren.go.infrastructure.adapter.car;

import com.example.ren.go.domain.entites.car.Document;
import com.example.ren.go.domain.service.car.DocumentService;
import com.example.ren.go.infrastructure.dto.car.DocumentDTO;
import com.example.ren.go.infrastructure.mapper.car.DocumentMapper;
import com.example.ren.go.infrastructure.repository.car.DocumentDAO;
import com.example.ren.go.infrastructure.repository.car.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DocumentAdapter implements DocumentService {
    private final DocumentRepository documentRepository;
    private final DocumentDAO documentDAO;
    private final DocumentMapper documentMapper;
    @Override
    public void saveDocument(Document documet) {
        documentRepository.save(documentMapper.toDocumentDto(documet));

    }

    @Override
    public void deleteDocument(String id) {

        documentRepository.deleteById(id);
    }

    @Override
    public Document getDocument(String id) {
        Optional<DocumentDTO> documentDTOOptional = documentRepository.findById(id);

        return documentMapper.toDocumentEntity(documentDTOOptional.get());

    }

    @Override
    public List<Document> getAllDocument() {
        List<DocumentDTO> documents = documentRepository.findAll();
        return documents.stream().map(documentMapper::toDocumentEntity).toList();
    }

    @Override
    public Document updateDocument(Document documet, String id) {
        Optional<DocumentDTO> documentDTOOptional = documentRepository.findById(id);

        Document d =  documentMapper.toDocumentEntity(documentDTOOptional.get());
        d.setName(documet.getName());
        return documentMapper.toDocumentEntity(documentRepository.save(documentMapper.toDocumentDto(d)));




    }
    @Override
    public List<Document> getDocumentsByCar(String id) {
        List<Document> documents = documentDAO.getDocumentsByCar(id);
        return documents;
    }
}
