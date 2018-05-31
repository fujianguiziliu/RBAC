package com.xmg.pss.mapper;

import java.util.List;

import javax.management.Query;

import org.apache.ibatis.annotations.Param;


import com.xmg.pss.domain.Employee;
import com.xmg.pss.query.QueryObject;

public interface EmployeeMapper extends BasicMapper<Employee>{

	//将对应的所在部门的员工的部门编号设置值为null
	void updateByDeptId(Long deptId);

	void updateRelation(@Param("eid")Long eid,@Param("rid") Long rid);

	

	void deleteRelation(Long id);
	
	Employee checkLogin(@Param("username")String username, 
			@Param("password")String password);
}
