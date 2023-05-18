package com.example.ren.go.application;

import com.example.ren.go.domain.entites.car.Type;
import com.example.ren.go.domain.service.car.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeAplication {
    private final TypeService typeService;

    public void saveType(Type type){
        typeService.saveType(type);
    }
    public void deleteType(String id){

        typeService.deleteType(id);
    }
    public Type getType(String id){

        return typeService.getType(id);
    }
    public List<Type> getAllType(){

        return typeService.getAllType();
    }
    public Type updateType(Type Type, String id){

        return typeService.updateType(Type, id);
    }
}
