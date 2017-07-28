package com.example.demo.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMongo {

    @Id
    @Field("_id")
    private String id;

    private String category; 
    
    @Field("companyId")
    private Integer companyId;

    private String companyName;

    private Integer defaultDataGroupId;
    
    private Boolean inPostgre;

    @Field("nodDbId")
    private String nodDbId;

    private String visibleAPIKey;

    private Integer visibleWorkspaceId;

}
