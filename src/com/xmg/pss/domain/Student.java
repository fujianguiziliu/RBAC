package com.xmg.pss.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	private Long id;
	private String name;
	private List<Teacher> teachers=new ArrayList<>();
}
