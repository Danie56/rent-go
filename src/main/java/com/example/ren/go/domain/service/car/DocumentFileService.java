package com.example.ren.go.domain.service.car;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface DocumentFileService {
    void loardDocument(MultipartFile multipartFile, String idCar) throws IOException;
    void loardDocuments(List<MultipartFile> multipartFiles, String idCar);
}
