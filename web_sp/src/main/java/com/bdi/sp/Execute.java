package com.bdi.sp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdi.sp.vo.Test;


public class Execute {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac;
		cpac = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSession ss = (SqlSession)cpac.getBean("sst");
		Test t = new Test();
		t.setTnum(1); 
		System.out.println(ss.selectList("TEST.selectTest",t));	// TEST -> test.xml에서 <mapper namespace="TEST">(대문자)로 해주었기 때문에 여기에서도 대문자로 해줌
	}
}