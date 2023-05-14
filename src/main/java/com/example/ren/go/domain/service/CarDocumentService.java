package com.example.ren.go.domain.service;

import com.example.ren.go.domain.entites.CarDocument;

import java.util.List;

public interface CarDocumentService {

    void saveCarDocument(CarDocument carDocument);
    void deleteCarDocumentByCar(String idCar, String idDocument);
    List<CarDocument> getCarDocumentsByCar(String id);

}
