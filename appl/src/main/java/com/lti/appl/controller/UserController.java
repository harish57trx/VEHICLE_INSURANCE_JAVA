package com.lti.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.beans.Policy;
import com.lti.appl.services.AdminService;
import com.lti.appl.services.UserService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("api/v3")
public class UserController {


	@Autowired
	private AdminService service;

	@Autowired
	private UserService user_service;

	@GetMapping("/policies")
	public List<Policy> getPolicyList()
	{
		List<Policy> p = service.getAllPolicy();
		System.out.println(p);
		return p;
	}

	@PostMapping("/addpolicy/{userId}/{regNum}/{planId}")
	public boolean addPolicy(@RequestBody Policy p,@PathVariable int userId,@PathVariable String regNum,@PathVariable int planId)
	{
		boolean result = user_service.addPolicy(p, userId, regNum, planId);
		return result;
	}

	@GetMapping("/policies/{userId}")
	public List<Policy> getPolicyByUser(@PathVariable int userId)
	{
		List<Policy> policy = user_service.getPolicyByUser(userId);
		return policy;
	}

	@GetMapping("/deletePolicy/{id}")
	public boolean deletePolicy(@PathVariable long id)
	{
		boolean res= user_service.deletePolicy(id);
		return res;
	}
}
