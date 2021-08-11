package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Plan;
import com.lti.appl.beans.Policy;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired 
	EntityManager em;
	
	@Override
	public List<Policy> getAllPolicy() {
		String sql="SELECT p FROM Policy p";
        TypedQuery<Policy> qry=em.createQuery(sql,Policy.class);
		List<Policy> pList=qry.getResultList();
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
