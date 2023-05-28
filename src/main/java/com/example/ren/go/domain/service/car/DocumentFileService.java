package com.example.ren.go.domain.service.car;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DocumentFileService {
    void loardDocument(MultipartFile multipartFile, String idCar) throws IOException;
}
