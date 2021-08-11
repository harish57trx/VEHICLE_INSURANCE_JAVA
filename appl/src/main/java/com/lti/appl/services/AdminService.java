package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Plan;
import com.lti.appl.beans.Policy;

public interface AdminService {
	
	public abstract List<Policy> getAllPolicy();
	
	public List<Plan> getAllPlans();
	
	public boolean addPlan(Plan p) ;
	
	public int updatePlan(int id,Long amt) ;
	
	public boolean deletePlan(int id) ;
	
	public List<Long> estimatePlan(String vehicleType) ;
	
	public int PlanId(String vehicleType,String planType) ;
	
	public Long PlanAmount(String vehicleType, String planType);

	public abstract int approveClaim(long reqNum); 
	
	public int declineClaim(long reqNum); 
	
	public abstract List<Claims> viewClaims(); 
}
