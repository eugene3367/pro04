package com.company.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.myapp.dao.SampleDAO;
import com.company.myapp.dto.SampleDTO;

@Service
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	SampleDAO sampleDao;

	@Override
	public List<SampleDTO> sampleList() throws Exception {
		return sampleDao.sampleList();
	}
	
	

}
