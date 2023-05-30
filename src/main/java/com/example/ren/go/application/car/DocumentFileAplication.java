package com.example.ren.go.application.car;

import com.example.ren.go.domain.service.car.DocumentFileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor

public class DocumentFileAplication {

    private final DocumentFileService documentFileService;

    public void loardDocument(MultipartFile multipartFile, String idCar) throws IOException {
        documentFileService.loardDocument(multipartFile,idCar);
    }
    public void loardDocuments(List<MultipartFile> multipartFile, String idCar)  {
        documentFileService.loardDocuments(multipartFile,idCar);
    }
    /*public List<MultipartFile> loardDocumentsByCar(String idCar)  {
        return documentFileService.loardDocumentsByCar(idCar);
    }*/




}
