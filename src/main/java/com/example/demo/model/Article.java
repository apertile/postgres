package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "article", schema="orionscion")
@Data
public class Article implements Serializable {
 
    private static final long serialVersionUID = -3009157732242241606L;
    
    @Id
    @Column(name = "vtkey")
    private String vtKey;
 
    @Column(name = "author")
    private String author;
 
    @Column(name = "body")
    private String body;
    
//    @Column(name = "collectionSourceTypes")
//    private Integer[] collectionSourceTypes;
    
    @Column(name = "cpremediatype")
    private Integer cpreMediaType;
    
    @Column(name = "founddt", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Date foundDT;
    
    @OneToMany(mappedBy = "vtkey")
    private List<HumanFiltered> humanFiltered;
    
    @Column(name = "isactive")
    private Boolean isActive;
    
    @Column(name = "languagecode")
    private String languageCode;
    
    @Column(name = "mediatype")
    private String mediaType;
    
    @Column(name = "nodcontentid")
    private Integer nodContentId;
    
    @Column(name = "orionsciondt", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Date orionScionDT;
    
    @Column(name = "permalink")
    private String permalink;
    
    @Column(name = "publishedondt", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Date publishedOnDT;
    
    @Column(name = "publicationname")
    private String publicationName;

    @Column(name = "title")
    private String title;
 
}