package com.example.ren.go.infrastructure.repository.car;

import com.example.ren.go.domain.entites.car.CarDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class CarDocumentDAO {
    private final String GET_ALL = "SELECT * FROM car_documentdto WHERE id_car = :id;";
    private final String DELETE = "DELETE FROM car_documentdto WHERE id_car = :idCar AND id_document = :idDocument;";
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<CarDocument> getCarDocumentsByCar(String id) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("id", id);

        List<CarDocument> carDocuments = namedParameterJdbcTemplate.query(GET_ALL,parameters ,new
                BeanPropertyRowMapper<>(CarDocument.class));
        return carDocuments;
    }
    public void deleteCarDocumentsByCar(String idCar, String idDocument) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("idCar", idCar)
                .addValue("idDocument", idDocument);

        namedParameterJdbcTemplate.update(DELETE,parameters );
    }


}
