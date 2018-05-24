package com.xmg.pss.service.impl;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

import lombok.Setter;

import com.xmg.pss.domain.Department;
import com.xmg.pss.mapper.DepartmentMapper;
import com.xmg.pss.mapper.EmployeeMapper;
import com.xmg.pss.service.IDepartmentService;

public class DepartmentServiceImpl implements IDepartmentService {

	@Setter
	private DepartmentMapper deptMapper;
	
	@Setter
	private EmployeeMapper empMapper;
	@Override
	public void save(Department dept) {

		deptMapper.save(dept);
		//System.out.println(1/0);
	}

	@Override
	public void delete(Long id) {
		//在删除对应的部门之前，需要将其关联的数据删除或者是将其外键值设置为null
		empMapper.updateByDeptId(id);
		deptMapper.delete(id);
	}

	@Override
	public void update(Department dept) {
		deptMapper.update(dept);
	}

	@Override
	public Department get(Long id) {
		return deptMapper.get(id);
	}

	@Override
	public List<Department> list() {
		return deptMapper.list();
	}

}
