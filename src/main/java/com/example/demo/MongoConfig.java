package com.example.demo;

import static com.mongodb.MongoCredential.createMongoCRCredential;
import static org.apache.commons.lang3.StringUtils.isBlank;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.repository.mongo")
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    private GlobalProperties globalProperties;

    @Override
    protected String getDatabaseName() {
        return this.globalProperties.getMongoDB();
    }

    @Override
    @Bean
    public Mongo mongo() throws UnknownHostException {
        if (isBlank(this.globalProperties.getMongoUser())) {
            // No credentials provided. Return simple client
            return new MongoClient(mongoHosts());
        }
        // Credentials provided.
        List<MongoCredential> credentials = new ArrayList<>();
        //@formatter:off
        credentials.add(
                createMongoCRCredential(
                        globalProperties.getMongoUser(),
                        globalProperties.getMongoDB(),
                        globalProperties.getMongoPassword().toCharArray()));
        //@formatter:on
        return new MongoClient(mongoHosts(), credentials);
    }

    private List<ServerAddress> mongoHosts() throws UnknownHostException {
        int mongoPort = Integer.parseInt(this.globalProperties.getMongoPort());
        List<ServerAddress> hostArray = new ArrayList<ServerAddress>();
        List<String> hosts = Arrays.asList(this.globalProperties.getMongoHosts());
        for (String host : hosts) {
            hostArray.add(new ServerAddress(host, mongoPort));
        }
        return hostArray;
    }


}
