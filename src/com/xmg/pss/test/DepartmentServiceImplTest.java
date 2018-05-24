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
import com.xmg.pss.mapper.DepartmentMapper;
import com.xmg.pss.service.IDepartmentService;
import com.xmg.pss.service.impl.DepartmentServiceImpl;
import com.xmg.pss.util.MyBatisUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DepartmentServiceImplTest {

	@Autowired
	private IDepartmentService deptService;
	
	@Test
	public void testSave() throws Exception {
		Department dept = new Department();
		dept.setName("市场部");
		dept.setSn("DEPT001");
		deptService.save(dept);
			
	}
	
	
	@Test
	public void testDelete() throws Exception {
		deptService.delete(2L);
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		Department dept = new Department();
		dept.setName("研发部");
		dept.setSn("001");
		dept.setId(5L);
		deptService.update(dept );
	}
	
	@Test
	public void testGet() throws Exception {
		Department dept = deptService.get(4L);
		System.out.println(dept);
	}
	
	@Test
	public void testList() throws Exception {
		List<Department> list = deptService.list();
		for (Department dept : list) {
			System.out.println(dept);
		}
	}
}
