package com.example.demo;

import javax.inject.Named;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;

@Named
@Getter
@Setter
@NoArgsConstructor
public class GlobalProperties {
    
    // Mongo
    @Value("${cision.mongo.hosts:localhost}")
    private String[] mongoHosts;
    @Value("${cision.mongo.user:}")
    private String mongoUser;
    @Value("${cision.mongo.password:}")
    private String mongoPassword;
    @Value("${cision.mongo.port:27017}")
    private String mongoPort;
    @Value("${cision.mongo.db:OrionScion}")
    private String mongoDB;
    
//    //Postgre
//    @Value("${cision.dataSource.url:jdbc:postgresql://localhost:5432/OrionScion}")
//    private String dataSourceUrl;

}
