package com.xmg.pss.mapper;

import java.util.List;

import javax.management.Query;


import com.xmg.pss.domain.Employee;
import com.xmg.pss.query.QueryObject;

public interface EmployeeMapper extends BasicMapper<Employee>{

	//将对应的所在部门的员工的部门编号设置值为null
	void updateByDeptId(Long deptId);
	
	
}
