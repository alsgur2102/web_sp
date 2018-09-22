package com.bdi.sp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.dao.TestDAO;
import com.bdi.sp.service.TestService;
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO tdao;
	@Override
	public List<Map<String,String>> getList() {
		return tdao.getList();
	}

	@Override
	public void doInsert() {
		// TODO Auto-generated method stub

	}

}