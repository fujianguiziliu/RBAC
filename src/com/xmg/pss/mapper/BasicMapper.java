package com.xmg.pss.mapper;

import java.util.List;

import com.xmg.pss.domain.Employee;
import com.xmg.pss.query.QueryObject;

public interface BasicMapper<T> {

	void save(T e);
	
	void delete(Long id);
	
	void update(T e);
	
	T get(Long id);
	
	List<T> list();
	
	List<T> pageQuery(QueryObject qo);
	
	Long getTotalCount(QueryObject qo);
}
