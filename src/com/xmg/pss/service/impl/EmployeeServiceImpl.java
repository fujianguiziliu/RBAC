package com.xmg.pss.service.impl;

import java.util.Collections;
import java.util.List;

import lombok.Setter;
import com.xmg.pss.domain.Employee;
import com.xmg.pss.mapper.EmployeeMapper;
import com.xmg.pss.page.PageResult;
import com.xmg.pss.query.QueryObject;
import com.xmg.pss.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

	@Setter
	private EmployeeMapper empMapper;
	@Override
	public void save(Employee e) {

		empMapper.save(e);
		//System.out.println(1/0);
	}

	@Override
	public void delete(Long id) {
		empMapper.delete(id);
	}

	@Override
	public void update(Employee e) {
		empMapper.update(e);
	}

	@Override
	public Employee get(Long id) {
		return empMapper.get(id);
	}

	@Override
	public List<Employee> list() {
		return empMapper.list();
	}

	@Override
	public PageResult pageQuery(QueryObject qo) {
		Long totalCount = empMapper.getTotalCount(qo);
		List<Employee> listData = empMapper.pageQuery(qo);
		if (totalCount == 0) {
			return new PageResult(Collections.EMPTY_LIST,0,1,qo.getPageSize());
		}
		
		return new PageResult(listData, totalCount.intValue(), 
				qo.getCurrentPage(), qo.getPageSize());
	}

}
