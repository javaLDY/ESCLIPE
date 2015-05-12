package com.baiing.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String loginname;
	
	private String loginpass;
	
	@Override
	public String execute() throws Exception {
		return "login";
	}

	public String logintest(){
		if((loginname==null)||(loginname.trim().length()<0)){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("src", "登陆名称为空");
			System.out.println("登陆名称为空");
			return "login";
		}
		
		if((loginpass==null)||(loginpass.trim().length()<0)){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("src", "登陆名称为空");
			System.out.println("登陆名称为空");
			return "login";
		}
		
		if((loginname=="admin")&&(loginname=="admin")){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("src", "登陆成功");
			System.out.println("登陆成功");
			return "login";
		}
		return "login";
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpass() {
		return loginpass;
	}

	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}
	
	
}
