package com.chaosalt.eCommerce.usercenter.model.domain;

import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "t_user")
public class User {
	private String uid;
	private String userName;
}
