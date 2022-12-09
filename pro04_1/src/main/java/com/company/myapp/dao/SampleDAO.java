package com.company.myapp.dao;

import java.util.List;

import com.company.myapp.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sampleList() throws Exception;

}
