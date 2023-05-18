package com.example.ren.go.infrastructure.adapter.car;

import com.example.ren.go.domain.entites.car.CarType;
import com.example.ren.go.domain.service.car.CarTypeService;
import com.example.ren.go.infrastructure.mapper.car.CarTypeMapper;
import com.example.ren.go.infrastructure.repository.car.CarTypeDAO;
import com.example.ren.go.infrastructure.repository.car.CarTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarTypeAdapter implements CarTypeService {
    private final CarTypeRepository carTypeRepository;
    private final CarTypeMapper carTypeMapper;
    private final CarTypeDAO carTypeDAO ;
    @Override
    public void saveCarType(CarType carType) {
        carTypeRepository.save(carTypeMapper.toCarTypeDto(carType));
    }

    @Override
    public void deleteCarTypeByCar(String idCar, String idType) {
        carTypeDAO.deleteCarTypeByCar(idCar,idType);

    }
}
