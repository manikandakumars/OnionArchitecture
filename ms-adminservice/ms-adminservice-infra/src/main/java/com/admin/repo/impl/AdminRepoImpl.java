package com.admin.repo.impl;

import org.springframework.stereotype.Repository;

import com.admin.repo.IAdminRepo;

@Repository
public class AdminRepoImpl implements IAdminRepo{

	public String getAdminName() {
		return "Hello Admin! - Repo";
	}

}
