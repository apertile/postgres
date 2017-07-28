package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.demo.model.mongo.UserStatusEnum;

import lombok.Data;
//import lombok.Generated;

@Entity
@Table(name = "user", schema="orionscion")
@Data
public class User {

    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="auto_inc_sequence")
    @SequenceGenerator(name="auto_inc_sequence", sequenceName="AUTO_INC_SEQUENCE", allocationSize=1)
    private Integer userid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
//    @Column(name = "roles")
//    private String[] role;
    
    @Column(name = "createddate")
    private Date createddate;
    
    @Column(name = "lastlogintime")
    private Date lastLoginTime;
    
    @Column(name = "workflow")
    private String workflow;
    
    @Column(name = "userstatus")
    @Enumerated(EnumType.STRING)
    private UserStatusEnum status;
}
