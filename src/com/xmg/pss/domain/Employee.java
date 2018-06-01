package com.xmg.pss.domain;

import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends BasicDomain{
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String email;
	private Integer age;
	private Boolean admin;
	//多对一的关系
	private Department dept;
	
	private List<Role> roles=new ArrayList<>();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password="
				+ password + ", email=" + email + ", age=" + age + ", admin="
				+ admin + "]";
	}
	
	
	
	
}
