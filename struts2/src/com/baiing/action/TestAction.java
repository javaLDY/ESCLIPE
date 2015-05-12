package com.baiing.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String style;
	
	private String mudi;
	
	public String testform(){
		System.out.println(style);
		System.out.println(mudi);
		return SUCCESS;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getMudi() {
		return mudi;
	}

	public void setMudi(String mudi) {
		this.mudi = mudi;
	}
	
	
}
