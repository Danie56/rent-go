package com.example.ren.go.infrastructure.adapter;

import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.service.CarDocumentService;
import com.example.ren.go.infrastructure.mapper.CarDocumentMapper;
import com.example.ren.go.infrastructure.repository.CarDocumentDAO;
import com.example.ren.go.infrastructure.repository.CarDocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CarDocumentAdapter implements CarDocumentService {
    private final CarDocumentRepository carDocumentRepository;
    private final CarDocumentDAO carDocumentDAO;
    private final CarDocumentMapper carDocumentMapper;
    @Override
    public void saveCarDocument(CarDocument carDocument) {
        carDocumentRepository.save(carDocumentMapper.toCarDocumentDto(carDocument));
    }

    @Override
    public void deleteCarDocumentByCar(String idCar, String idDocument) {
        carDocumentDAO.deleteCarDocumentsByCar(idCar,idDocument);

    }


    @Override
    public List<CarDocument> getCarDocumentsByCar(String id) {
        return carDocumentDAO.getCarDocumentsByCar(id);

    }
}
