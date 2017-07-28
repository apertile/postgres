package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "humanfiltered", schema="orionscion")
@Data
public class HumanFiltered {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="auto_inc_sequence")
    @SequenceGenerator(name="auto_inc_sequence", sequenceName="AUTO_INC_SEQUENCE", allocationSize=1)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "vtkey")
    private Article vtkey; 
    
    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customerid; 
    
    @ManyToOne
    @JoinColumn(name = "searchid")
    private Search searchid; 
    
    @ManyToOne
    @JoinColumn(name = "userid")
    private User userid; 
    
    @Column(name = "status")
    private String status;

}
