package com.example.ren.go.domain.service.car;

import com.example.ren.go.domain.entites.car.CarDocument;

import java.util.List;

public interface CarDocumentService {

    void saveCarDocument(CarDocument carDocument);
    void deleteCarDocumentByCar(String idCar, String idDocument);
    List<CarDocument> getCarDocumentsByCar(String id);

}
