package com.bdi.sp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Execute {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac;
		cpac = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSessionFactory ssf;
		ssf = (SqlSessionFactory)cpac.getBean("ssf");
		try {
			SqlSession ss = ssf.openSession();
			Connection con = ss.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from board_info");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}