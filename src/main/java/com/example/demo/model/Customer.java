package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer", schema="orionscion")
@Data
public class Customer {
    
    @Id
    @Column(name = "customerid")
    private Integer customerid;

    @Column(name = "category")
    private String category; 
    
    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "defaultdatagroup")
    private Integer defaultDataGroup;

    @Column(name = "noddbid")
    private String nodDbId;

    @Column(name = "apikey")
    private String apikey;

    @Column(name = "workspaceid")
    private Integer workspaceid;
    
    @OneToMany(mappedBy = "customerid")
    private List<HumanFiltered> humanfiltered;

}
