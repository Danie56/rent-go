package com.example.ren.go.infrastructure.api.controller;

import com.example.ren.go.application.TypeAplication;
import com.example.ren.go.application.TypeAplication;
import com.example.ren.go.domain.entites.Type;
import com.example.ren.go.domain.entites.Type;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "http://localhost:4200/")

public class TypeController {
    private TypeAplication typeAplication;

    @PostMapping("/save_type")
    public void saveType(@RequestBody Type type){
        typeAplication.saveType(type);
    }
    @DeleteMapping("/delete_type/{id}")
    public void deleteType(@PathVariable String id){
        typeAplication.deleteType(id);
    }
    @GetMapping("/get_type/{id}")
    public ResponseEntity<Type> getType(@PathVariable String id){
        return new ResponseEntity<>(typeAplication.getType(id), HttpStatus.OK);

    }
    @GetMapping("/get_all_type")
    public ResponseEntity<List<Type>> getType(){
        return new ResponseEntity<>(typeAplication.getAllType(), HttpStatus.OK);

    }
    @PutMapping("/update_type/{id}")
    public ResponseEntity<Type> updateType(@RequestBody Type Type, @PathVariable String id){
        return new ResponseEntity<>(typeAplication.updateType(Type,id),HttpStatus.OK);
    }

}
