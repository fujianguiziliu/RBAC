package com.xmg.pss.service.impl;

import java.util.List;

import lombok.Setter;

import com.xmg.pss.domain.Department;
import com.xmg.pss.mapper.DepartmentMapper;
import com.xmg.pss.service.IDepartmentService;

public class DepartmentServiceImpl implements IDepartmentService {

	@Setter
	private DepartmentMapper deptMapper;
	@Override
	public void save(Department dept) {

		deptMapper.save(dept);
		//System.out.println(1/0);
	}

	@Override
	public void delete(Long id) {
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
