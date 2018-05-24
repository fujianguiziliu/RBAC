package com.xmg.pss.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends BaseDomain{
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String email;
	private Integer age;
	private Boolean admin;
	//多对一的关系
	private Department dept;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password="
				+ password + ", email=" + email + ", age=" + age + ", admin="
				+ admin + "]";
	}
	
	
	
	
}
