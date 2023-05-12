package com.example.ren.go.infrastructure.repository;

import com.example.ren.go.domain.entites.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class DocumentDAO {
    private final String GET_ALL = "SELECT d.*\n" +
            "FROM documentdto d\n" +
            "INNER JOIN car_documentdto cd ON d.id = cd.id_document\n" +
            "WHERE cd.id_car  = :id;";
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Document> getDocumentsByCar(String id) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("id", id);

        List<Document> documents = namedParameterJdbcTemplate.query(GET_ALL,parameters ,new
                BeanPropertyRowMapper<>(Document.class));
        return documents;
    }


}
