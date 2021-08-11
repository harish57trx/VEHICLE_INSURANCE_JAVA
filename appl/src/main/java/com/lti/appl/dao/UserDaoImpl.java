package com.lti.appl.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.beans.Claims;
import com.lti.appl.beans.Plan;
import com.lti.appl.beans.Policy;
import com.lti.appl.beans.User;
import com.lti.appl.beans.Vehicle;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Policy> getAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Policy> getPolicyByUser(int userId) {
		String myQuery = "from User where user_id=:uId";
		Query query = entityManager.createQuery(myQuery);
		query.setParameter("uId", userId);
		User user = (User)query.getSingleResult();
		String myQuery1 = "from Policy where user_id=:uId";
		Query query1 = entityManager.createQuery(myQuery1);
		query1.setParameter("uId", userId);
		
		return query1.getResultList();
	}


	@Override
	public Vehicle getVehicleByRegNum(String regNum) {
		return entityManager.find(Vehicle.class,regNum);
	}

	@Override
	public Plan getPlanById(int planId) {
		return entityManager.find(Plan.class, planId);
	}

	@Override
	@Transactional
	public boolean addPolicy(Policy p, int userId, String regNum, int planId) {
		String myQry = "from User where userId=:uId";
		Query query = entityManager.createQuery(myQry);
		
		query.setParameter("uId", userId);
		User user = (User)query.getSingleResult();
		p.setUserId(user);
		p.setVehicleRegNum(getVehicleByRegNum(regNum));
		p.setPlanId(getPlanById(planId));
		entityManager.persist(p);
		System.out.println(p);
		return true;
	}

	@Transactional
	@Override
	public boolean deletePolicy(long id){
		Policy p = entityManager.find(Policy.class, id);
		entityManager.remove(p);
		return true;
	}

	@Override
	public int updatePolicyEndDate(int id, Date newEndDate) {
		// TODO Auto-generated method stub
		return 0;
	}


}
