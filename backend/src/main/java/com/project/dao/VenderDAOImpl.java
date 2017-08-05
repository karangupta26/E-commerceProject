package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.Authorities;
import com.project.model.User;
import com.project.model.Vendor;
@Repository
public class VenderDAOImpl implements VenderDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void registerVendor(Vendor vendor) {
		User user=vendor.getVuser();
		user.setEnabled(true);
		String username=vendor.getVuser().getUsername();
		
		Authorities authorities=new Authorities();
		authorities.setRole("ROLE_VENDOR");
		authorities.setUsername(username);
		
		Session session=sessionFactory.getCurrentSession();
		session.save(authorities);
		session.save(vendor);
		
	}

}
