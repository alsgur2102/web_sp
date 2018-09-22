package com.bdi.sp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdi.sp.vo.Board;


public class Execute {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac;
		cpac = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSession ss = (SqlSession)cpac.getBean("sst");
		/*Test t = new Test();
		t.setTnum(1); 
		System.out.println(ss.selectOne("TEST.selectTest",t));	// TEST -> test.xml에서 <mapper namespace="TEST">(대문자)로 해주었기 때문에 여기에서도 대문자로 해줌
		*/
		Board b = new Board();
		b.setBinum(1);
		System.out.println(ss.selectOne("BOARD.selectBoard",b)); 
	}
}