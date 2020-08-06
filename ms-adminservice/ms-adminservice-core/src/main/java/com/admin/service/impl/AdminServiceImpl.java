package com.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.repo.IAdminRepo;
import com.admin.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	IAdminRepo adminRepo;
	
	public String getAdminName() {
		return adminRepo.getAdminName();
	}

}
