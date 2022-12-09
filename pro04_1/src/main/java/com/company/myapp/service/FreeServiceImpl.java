package com.company.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.myapp.dao.FreeDAO;
import com.company.myapp.dto.FreeDTO;

@Service
public class FreeServiceImpl implements FreeService {
	
	@Autowired
	private FreeDAO freeDAO;

	@Override
	public List<FreeDTO> freeList() throws Exception {
		return freeDAO.freeList();
	}


}
