package com.example.ren.go.domain.service.car;

import com.example.ren.go.domain.entites.car.Type;

import java.util.List;

public interface TypeService {
    void saveType(Type type);
    void deleteType(String id);
    Type getType(String id);
    List<Type> getAllType();
    Type updateType(Type type, String id);

}
