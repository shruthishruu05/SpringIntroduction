package com.example.demo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.HelloWorldDemoApplication;

@Component
public class EmployeeBean {
	private int eid;
	private String ename;
	
	
	@Autowired
	private DepartmentBean departmentBean;
	public static Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
	
	
	
	@Autowired
	public EmployeeBean(DepartmentBean departmentBean) {
		super();
		logger.info("here i am");
		this.departmentBean = departmentBean;
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	
	@Autowired
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	public void showDetails() {
		logger.info("Name :"+this.getEname());
		logger.info("Id:" +this.getEid());
		departmentBean.setDepartmentName("Computerr Science");
		
		logger.info("department name"+departmentBean.getDepartmentName());
		
	}
	
	
	
}
