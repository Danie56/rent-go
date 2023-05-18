package com.example.ren.go.infrastructure.api.controller.car;

import com.example.ren.go.application.CarDocumentAplication;
import com.example.ren.go.domain.entites.car.CarDocument;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")
public class CarDocumentController {
    private final CarDocumentAplication carDocumentAplication;
    @PostMapping("/save_car_document")
    public void saveDocument(@RequestBody CarDocument carDocument){
        carDocumentAplication.saveCarDocument(carDocument);
    }
    @DeleteMapping("/delete_car_document_by_car")
    public void deleteDocument(@Param("idCar") String idCar,@Param("idDocument")String idDocument){
        carDocumentAplication.deleteCarDocumentByCar(idCar, idDocument);
    }
    @GetMapping("/get_car_document_by_car/{id}")
    public ResponseEntity<List<CarDocument>> getCarDocumentsByCar(@PathVariable String id){
        return new ResponseEntity<>(carDocumentAplication.getCarDocumentsByCar(id), HttpStatus.OK);
    }

}
