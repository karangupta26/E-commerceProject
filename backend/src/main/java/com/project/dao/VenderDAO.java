package com.project.dao;

import com.project.model.User;
import com.project.model.Vendor;

public interface VenderDAO {
	public void registerVendor(Vendor vendor);
	User validateUserName(String username);
}
