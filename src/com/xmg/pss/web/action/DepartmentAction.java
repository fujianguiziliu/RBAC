package com.xmg.pss.web.action;

import lombok.Setter;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xmg.pss.domain.Department;
import com.xmg.pss.service.IDepartmentService;

public class DepartmentAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private Department dept = new Department();
	
	@Setter
	private IDepartmentService deptService;
	@Override
	public String execute() throws Exception {
		dept.setName("测试部");
		deptService.save(dept);
		return NONE;
	}
}
