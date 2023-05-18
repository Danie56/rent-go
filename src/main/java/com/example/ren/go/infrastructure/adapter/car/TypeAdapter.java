package com.example.ren.go.infrastructure.adapter.car;

import com.example.ren.go.domain.entites.car.Type;
import com.example.ren.go.domain.service.car.TypeService;
import com.example.ren.go.infrastructure.dto.car.TypeDTO;
import com.example.ren.go.infrastructure.mapper.car.TypeMapper;
import com.example.ren.go.infrastructure.repository.car.TypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TypeAdapter implements TypeService {
    private final TypeRepository typeRepository;
    private final TypeMapper typeMapper;

    @Override
    public void saveType(Type type) {
        typeRepository.save(typeMapper.toTypeDto(type));

    }

    @Override
    public void deleteType(String id) {

        typeRepository.deleteById(id);
    }

    @Override
    public Type getType(String id) {
        Optional<TypeDTO> typeDTOOptional = typeRepository.findById(id);

        return typeMapper.toTypeEntity(typeDTOOptional.get());

    }

    @Override
    public List<Type> getAllType() {
        List<TypeDTO> types = typeRepository.findAll();
        return types.stream().map(typeMapper::toTypeEntity).toList();
    }

    @Override
    public Type updateType(Type type, String id) {
        Optional<TypeDTO> typeDTO = typeRepository.findById(id);

        Type t =  typeMapper.toTypeEntity(typeDTO.get());
        t.setName(type.getName());
        return typeMapper.toTypeEntity(typeRepository.save(typeMapper.toTypeDto(t)));




    }
    
}
