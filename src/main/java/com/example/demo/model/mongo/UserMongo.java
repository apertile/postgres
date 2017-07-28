package com.example.demo.model.mongo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;


@Document(collection="User") 	
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMongo {
	
	@Id
	@Field("id")
	private String id;
	private Boolean inPostgre;
	@Field("name")
	private String name;
	@Field("username")
	private String username;
	@Field("password")
	private String password;
	private List<String> role;
	@Field("favCustomer")
	private List<Integer> favCustomer;
	
	@Field("lastLoginTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
	private DateTime lastLoginTime;
	
	@Field("workflow")
	private String workflow;
	
	@Field("status")
	private UserStatusEnum status;

}
