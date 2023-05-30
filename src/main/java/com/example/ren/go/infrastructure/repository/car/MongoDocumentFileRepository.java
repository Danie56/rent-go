package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.infrastructure.dto.car.DocumentFileDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Repository
public interface MongoDocumentFileRepository extends MongoRepository<DocumentFileDTO,String> {




}
