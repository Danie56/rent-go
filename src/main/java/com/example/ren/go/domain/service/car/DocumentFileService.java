package com.example.ren.go.domain.service.car;

import org.springframework.web.multipart.MultipartFile;

public interface DocumentFileService {
    void loardDocument(MultipartFile multipartFile, String idCar,String idDocument);
}
