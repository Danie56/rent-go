package com.example.ren.go.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class CarTypeDAO {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    private final String DELETE = "DELETE FROM car_documentdto WHERE id_car = :idCar AND id_document = :idDocument;";
    public void deleteCarTypeByCar(String idCar, String idType) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("idCar", idCar)
                .addValue("idDocument", idType);

        namedParameterJdbcTemplate.update(DELETE,parameters );
    }

}
