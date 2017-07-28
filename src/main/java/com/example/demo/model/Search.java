package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "search", schema="orionscion")
@Data
public class Search {
    
    @Id
    @Column(name = "searchid")
    private String searchid;

    @Column(name = "searchagentname", nullable=false)
    private String searchAgentName; 
    
    @Column(name = "query", nullable=false)
    private String query; 

    @Column(name = "type")
    private String type; 
    
    @Column(name = "routingoption")
    private String routingOption;
    
    @Column(name = "brief")
    private String brief;
    
    @OneToMany(mappedBy = "searchid")
    private List<HumanFiltered> humanFiltered;
}
