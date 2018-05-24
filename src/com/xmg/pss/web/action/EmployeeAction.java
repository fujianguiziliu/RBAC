package com.xmg.pss.web.action;

import java.io.StringReader;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xmg.pss.domain.Department;
import com.xmg.pss.domain.Employee;
import com.xmg.pss.page.PageResult;
import com.xmg.pss.query.EmployeeQueryObject;
import com.xmg.pss.service.IDepartmentService;
import com.xmg.pss.service.IEmployeeService;

public class EmployeeAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	@Getter
	private Employee e = new Employee();
	
	@Setter
	private IEmployeeService empService;
	@Setter
	private IDepartmentService deptService;
	@Setter
	private String repassword;
	@Getter
	private EmployeeQueryObject qo=new EmployeeQueryObject();
	@Override
	public String execute() throws Exception {
		PageResult result= empService.pageQuery(qo);
		//将数据添加到值栈中
		ActionContext.getContext().put("result", result);
		//将页面上的需要的部门的信息全部查询出来
		List<Department> depts = deptService.list();
		ActionContext.getContext().put("depts", depts);
		return LIST;
		
	}
	public String delete() throws Exception {
		if (e.getId()!=null) {
			empService.delete(e.getId());
		}
		return SUCCESS;
		
		
	}
	
	public String input() throws Exception {
		//将页面上的需要的部门的信息全部查询出来
				List<Department> depts = deptService.list();
				ActionContext.getContext().put("depts", depts);
		if (e.getId()!=null) {
			e=empService.get(e.getId());
		}
		return INPUT;
		
		
	}
	
	public String saveOrUpdate() throws Exception {
		
		if (e.getId()!=null) {
			empService.update(e);
		}else {
			empService.save(e);
		}
		return SUCCESS;
		
		
	}
	
	
}
