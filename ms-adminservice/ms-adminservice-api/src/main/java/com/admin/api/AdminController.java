package com.admin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.service.IAdminService;

@RestController
@RequestMapping("/adminservice")
public class AdminController {

	@Autowired
	IAdminService adminService;
	
	@GetMapping(path = "/name",produces = "application/json")
	public String getAdminName() {
		return adminService.getAdminName();
	}
	
}
