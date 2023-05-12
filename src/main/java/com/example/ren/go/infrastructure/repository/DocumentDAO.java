package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.domain.entites.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class DocumentDAO {
    private final String GET_ALL = "SELECT d.*\n" +
            "FROM documentdto d\n" +
            "INNER JOIN car_documentdto cd ON d.id = cd.id_document\n" +
            "WHERE cd.id_car = 'DEF456';";
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Document> getDocumentsByCar() {
        List<Document> documents = namedParameterJdbcTemplate.query(GET_ALL, new
                BeanPropertyRowMapper<>(Document.class));
        return documents;
    }


}
