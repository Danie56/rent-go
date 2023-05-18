package com.example.ren.go.infrastructure.adapter.car;

import com.example.ren.go.domain.entites.car.CarDocument;
import com.example.ren.go.domain.service.car.CarDocumentService;
import com.example.ren.go.infrastructure.mapper.car.CarDocumentMapper;
import com.example.ren.go.infrastructure.repository.car.CarDocumentDAO;
import com.example.ren.go.infrastructure.repository.car.CarDocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
