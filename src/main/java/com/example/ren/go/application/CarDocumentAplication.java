package com.example.ren.go.application;

import com.example.ren.go.domain.entites.CarDocument;
import com.example.ren.go.domain.service.CarDocumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarDocumentAplication {
    private final CarDocumentService carDocumentService;
    public void saveCarDocument (CarDocument carDocument){
        carDocumentService.saveCarDocument(carDocument);
    }
    public void deleteCarDocumentByCar (String idCar, String idDocument){
        carDocumentService.deleteCarDocumentByCar(idCar,idDocument);
    }
   public List<CarDocument> getCarDocumentsByCar (String id){
        return carDocumentService.getCarDocumentsByCar(id);
    }

}
