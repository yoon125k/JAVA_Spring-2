package com.test02;

public class Adress {
	private String name;
	private String addr;
	private String phone;
	
	
	public Adress() {
	}
	
	public Adress(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "aDRESS [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
	
}
