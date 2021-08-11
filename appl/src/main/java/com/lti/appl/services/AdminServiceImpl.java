package com.lti.appl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Plan;
import com.lti.appl.beans.Policy;
import com.lti.appl.dao.AdminDao;

@Service("service")
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao pDao;
	
	@Override
	public List<Policy> getAllPolicy() {
		List<Policy> pList=pDao.getAllPolicy();
		return pList;
	}

	@Override
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPlan(Plan p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updatePlan(int id, Long amt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deletePlan(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Long> estimatePlan(String vehicleType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int PlanId(String vehicleType, String planType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Long PlanAmount(String vehicleType, String planType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int approveClaim(long reqNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int declineClaim(long reqNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Claims> viewClaims() {
		// TODO Auto-generated method stub
		return null;
	}

}
