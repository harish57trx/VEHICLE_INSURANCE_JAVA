package com.lti.appl.services;

import java.sql.Date;
import java.util.List;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Policy;
import com.lti.appl.beans.User;
import com.lti.appl.beans.Vehicle;

public interface UserService {
	
	public abstract List<Policy> getAllPolicies() ;
	
	public List<Policy> getPolicyByUser(int userId) ;
	
	public boolean addPolicy(Policy p,int userId,String regNum,int planId) ;
	
	public abstract int updatePolicyEndDate(int id, Date newEndDate);
	
	public abstract boolean deletePolicy(long id);
	

}
