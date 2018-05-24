package com.xmg.pss.test;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xmg.pss.domain.Department;
import com.xmg.pss.domain.Employee;
import com.xmg.pss.mapper.DepartmentMapper;
import com.xmg.pss.page.PageResult;
import com.xmg.pss.query.EmployeeQueryObject;
import com.xmg.pss.service.IEmployeeService;
import com.xmg.pss.service.impl.DepartmentServiceImpl;
import com.xmg.pss.util.MyBatisUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {

	@Autowired
	private IEmployeeService empService;
	
	@Test
	public void testSave() throws Exception {	
		Employee e = new Employee();
		e.setName("pao");
		e.setAdmin(true);
		e.setAge(33);
		Department dept = new Department();
		dept.setId(11L);
		e.setDept(dept);
		e.setEmail("pao@qq.com");
		e.setPassword("1234");
		empService.save(e);
			
	}
	
	
	@Test
	public void testDelete() throws Exception {
		empService.delete(2L);
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		Employee e = new Employee();
		e.setName("chris");
		e.setAdmin(true);
		e.setAge(32);
		Department dept = new Department();
		dept.setId(11L);
		e.setDept(dept);
		e.setEmail("chris@qq.com");
		e.setPassword("1234");
		e.setId(1L);
		empService.update(e);
	}
	
	@Test
	public void testGet() throws Exception {
		Employee e = empService.get(5L);
		//System.out.println(e.getDept());
		System.out.println(e);
	}
	
	@Test
	public void testList() throws Exception {
		List<Employee> list = empService.list();
		for (Employee e : list) {
			System.out.println(e);
		}
	}
	@Test
	public void testPageQuery() throws Exception {
		EmployeeQueryObject qo = new EmployeeQueryObject();
		qo.setKeyword("qq");
		qo.setDeptId(5L);
		PageResult result = empService.pageQuery(qo);
		System.out.println(result);
		
	}
}
