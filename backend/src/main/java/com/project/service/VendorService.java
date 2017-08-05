package com.project.service;

import com.project.model.User;
import com.project.model.Vendor;

public interface VendorService {
	public void registerVendor(Vendor vendor);
	User validateUserName(String username);
}
