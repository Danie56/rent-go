package com.example.ren.go.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.ren.go.infrastructure.repository.car",
                         repositoryImplementationPostfix = "Mongo")
public class MongoConfig {
    // Otras configuraciones relacionadas con MongoDB
}
