package com.example.ren.go.infrastructure.adapter.car;
import com.example.ren.go.domain.entites.car.Car;
import com.example.ren.go.domain.entites.car.StatesCarEnum;
import com.example.ren.go.domain.service.car.CarService;
import com.example.ren.go.infrastructure.dto.car.CarDTO;
import com.example.ren.go.infrastructure.mapper.car.CarMapper;
import com.example.ren.go.infrastructure.repository.car.CarDocumentRepository;
import com.example.ren.go.infrastructure.repository.car.CarRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@AllArgsConstructor
@Service
@Component

public class CarAdapter implements CarService {
    private  final CarRepository carRepository;
    private  final CarDocumentRepository carDocumentRepository;
    private  final CarMapper carMapper;
    private final MongoTemplate mongoTemplate;


    @Override
    public void saveCar(Car car) {
        carRepository.save(carMapper.toCarDto(car));

    }

    @Override
    public Car updateCar(Car car) {
        return carMapper.toCarEntity(carRepository.save(carMapper.toCarDto(car)));
    }
    @Override
    public Car getCar(String id) {

        Optional<CarDTO>carOptional = carRepository.findById(id);
        return carMapper.toCarEntity(carOptional.get());
    }

    @Override
    public List<Car> getAllCar() {
        List<CarDTO> peoples = carRepository.findAll();
        return peoples.stream().map(carMapper::toCarEntity).toList();
    }
    @Override
    @Transactional

    public void deleteCar(String id) {

        carRepository.deleteById(id);
    }

    @Override
    public void setType(String idCar, String idType) {
        Optional<CarDTO>carOptional = carRepository.findById(idCar);
        Car car = carMapper.toCarEntity(carOptional.get());
        car.setType(idType);
        carRepository.save(carMapper.toCarDto(car));


    }
    public void setState(String idCar, String state) {
        Optional<CarDTO>carOptional = carRepository.findById(idCar);
        Car car = carMapper.toCarEntity(carOptional.get());
        car.setStatesCar(StatesCarEnum.valueOf(state));
        carRepository.save(carMapper.toCarDto(car));


    }

    @Override
    public List<Document> getDocumentsByCar(String idCar) {
        //ObjectId objectId = new ObjectId(idCar);
        //Query query = Query.query(where("files_id").in(objectId));
        Criteria criteria = Criteria.where("idCar").in(idCar);
        Query query = new Query(criteria);


        List<Document> documents = mongoTemplate.find(query,Document.class,"document_file");
        documents.forEach(document -> {
            String fieldValue = document.getString("idCar"); // Reemplaza "fieldName" con el nombre del campo que deseas obtener
            System.out.println(fieldValue);
        });

        return documents;

    }
}
