package com.xmg.pss.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmg.pss.domain.Department;
import com.xmg.pss.domain.Employee;
import com.xmg.pss.page.PageResult;
import com.xmg.pss.query.QueryObject;

public interface IEmployeeService {


	void save(Employee e);
	
	void delete(Long id);
	
	void update(Employee e);
	
	Employee get(Long id);
	
	List<Employee> list();
	
	PageResult pageQuery(QueryObject qo);

	Employee checkLogin(String username, String password);
}
