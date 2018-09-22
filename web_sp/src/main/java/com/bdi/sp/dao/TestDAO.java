package com.bdi.sp.dao;

import java.util.List;
import java.util.Map;

public interface TestDAO {
	public List<Map<String,String>> getList();
	public int doInsert();
}