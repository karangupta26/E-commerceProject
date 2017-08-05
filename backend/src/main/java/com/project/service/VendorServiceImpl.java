package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.VenderDAO;
import com.project.model.User;
import com.project.model.Vendor;
@Service
@Transactional
public class VendorServiceImpl implements VendorService {
	@Autowired
	private VenderDAO venderDao;
	public void registerVendor(Vendor vendor) {
		venderDao.registerVendor(vendor);
	}
	public User validateUserName(String username) {
		return venderDao.validateUserName(username);
	}

}
