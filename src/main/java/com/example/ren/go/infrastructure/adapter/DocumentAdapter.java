package com.example.ren.go.infrastructure.adapter;

import com.example.ren.go.domain.entites.Documet;
import com.example.ren.go.domain.service.DocumentService;
import com.example.ren.go.infrastructure.mapper.DocumentMapper;
import com.example.ren.go.infrastructure.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DocumentAdapter implements DocumentService {
    private final DocumentRepository documentRepository;
    private final DocumentMapper documentMapper;
    @Override
    public void saveDocument(Documet documet) {
        documentRepository.save(documentMapper.toCarDto(documet));

    }
}
