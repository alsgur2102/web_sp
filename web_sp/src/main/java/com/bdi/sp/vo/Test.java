package com.bdi.sp.vo;

import org.springframework.stereotype.Component;

@Component("t2")
public class Test {
	private String name;
	private Integer age;
	private String adddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	
}