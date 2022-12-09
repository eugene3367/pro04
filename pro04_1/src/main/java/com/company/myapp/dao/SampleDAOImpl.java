package com.company.myapp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.myapp.dto.SampleDTO;

@Repository
public class SampleDAOImpl implements SampleDAO {

	@Autowired
	SqlSession SqlSession;
	
	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return SqlSession.selectList("sample.sampleList");
	}
	
	

}
