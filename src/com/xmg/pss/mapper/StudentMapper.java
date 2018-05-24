package com.xmg.pss.mapper;

import org.apache.ibatis.annotations.Param;

import com.xmg.pss.domain.Student;
import com.xmg.pss.domain.Teacher;

public interface StudentMapper {

	void save(Student s);
	
	Student get(Long id);
	
	void updateRelation(@Param("teacherId")Long teacherId,
			@Param("studentId")Long studentId);
}
