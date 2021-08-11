package com.lti.appl.dao;

import java.sql.Date;
import java.util.List;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Plan;
import com.lti.appl.beans.Policy;
import com.lti.appl.beans.User;
import com.lti.appl.beans.Vehicle;


public interface UserDao {
	
	public List<Policy> getAllPolicies();
		
	public List<Policy> getPolicyByUser(int userId);
	
	public Vehicle getVehicleByRegNum(String regNum) ;
	
	public Plan getPlanById(int planId) ;
	
	public boolean addPolicy(Policy p,int userId,String regNum,int planId);
	
	public int updatePolicyEndDate(int id, Date newEndDate) ;
	
	public boolean deletePolicy(long id) ;
	
}
