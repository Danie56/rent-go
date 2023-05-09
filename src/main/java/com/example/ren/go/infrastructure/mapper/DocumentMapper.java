package com.example.ren.go.infrastructure.mapper;

import com.example.ren.go.domain.entites.Document;
import com.example.ren.go.infrastructure.dto.DocumentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface DocumentMapper {
    Document toDocumentEntity(DocumentDTO documetDTO);

    DocumentDTO toDocumentDto(Document document);


}
