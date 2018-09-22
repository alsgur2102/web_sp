package com.bdi.sp.vo;

import org.springframework.stereotype.Component;

@Component("t2")
public class Test {
	private String name;
	private Integer age;
	private String adddress;
	private String tname;
	private Integer tnum;
	private Integer tage;
	
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", adddress=" + adddress + ", tname=" + tname + ", tnum=" + tnum
				+ ", tage=" + tage + "]";
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTnum() {
		return tnum;
	}
	public void setTnum(Integer tnum) {
		this.tnum = tnum;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
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