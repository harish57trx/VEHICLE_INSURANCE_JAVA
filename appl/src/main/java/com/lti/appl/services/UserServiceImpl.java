package com.lti.appl.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Policy;
import com.lti.appl.beans.User;
import com.lti.appl.beans.Vehicle;
import com.lti.appl.dao.UserDao;

@Service("user_service")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public List<Policy> getAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Policy> getPolicyByUser(int userId) {
		List<Policy> p = (List<Policy>)userDao.getPolicyByUser(userId);
		return p;
	}

	@Override
	public boolean addPolicy(Policy p, int userId, String regNum, int planId) {
		boolean status = userDao.addPolicy(p, userId, regNum, planId);
		return status;
	}

	@Override
	public int updatePolicyEndDate(int id, Date newEndDate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deletePolicy(long id) {
		boolean status = userDao.deletePolicy(id);
		return status;
	}


	
}
