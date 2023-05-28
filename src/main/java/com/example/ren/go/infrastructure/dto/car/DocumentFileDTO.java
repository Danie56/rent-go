package com.example.ren.go.infrastructure.dto.car;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "document_file")

public class DocumentFileDTO {
    @Id
    private String id;
    private String idDocument;
    private String idCar;




}
