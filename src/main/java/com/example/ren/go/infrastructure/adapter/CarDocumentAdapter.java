package com.example.ren.go.infrastructure.adapter;

import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.service.CarDocumentService;
import com.example.ren.go.infrastructure.mapper.CarDocumentMapper;
import com.example.ren.go.infrastructure.repository.CarDocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarDocumentAdapter implements CarDocumentService {
    private final CarDocumentRepository carDocumentRepository;
    private final CarDocumentMapper carDocumentMapper;
    @Override
    public void saveCarDocument(CarDocument carDocument) {
        carDocumentRepository.save(carDocumentMapper.toCarDocumentDto(carDocument));
    }
}
