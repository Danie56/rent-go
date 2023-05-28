package com.example.ren.go.infrastructure.adapter.car;

import com.example.ren.go.domain.entites.car.DocumentFile;
import com.example.ren.go.domain.service.car.DocumentFileService;
import com.example.ren.go.infrastructure.mapper.car.DocumentFileMapper;
import com.example.ren.go.infrastructure.repository.car.MongoDocumentFileRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
public class DocumentFileAdapter implements DocumentFileService {
    @Autowired
    private  GridFsTemplate gridFsTemplate;
    private final MongoDocumentFileRepository mongoDocumentFileRepository;
    private final DocumentFileMapper documentFileMapper;



    @Override
    public void loardDocument(MultipartFile multipartFile, String idCar)  {
        try {
            ObjectId fileId = gridFsTemplate.store(multipartFile.getInputStream(),idCar+" "+ multipartFile.getOriginalFilename(), multipartFile.getContentType());
            DocumentFile documentFile = new DocumentFile();
            documentFile.setIdCar(idCar);
            documentFile.setIdDocument(fileId.toString());
            mongoDocumentFileRepository.save(documentFileMapper.toDto(documentFile));



        }catch (Exception e){
            System.out.println("Error");

        }




    }
}
