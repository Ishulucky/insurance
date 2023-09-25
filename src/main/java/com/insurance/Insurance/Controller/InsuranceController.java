package com.insurance.Insurance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.Insurance.model.InsurancePolicy;
import com.insurance.Insurance.model.InsuranceUser;
import com.insurance.Insurance.repository.InsuranceRepository;

@RestController
public class InsuranceController {

	@Autowired
	private InsuranceRepository insu;

	// by using tyhmeleaf
	@GetMapping(value = "/Viewpolicy")
	public String packages(Model model) {
		List<InsurancePolicy> policy = insu.ListAllPolicy();
		model.addAttribute("insurancePolicies", policy);
		return "ViewPolicy";
	}

	// it is used by using restapi
	@GetMapping("/policy")
	public List<InsurancePolicy> getAllPolicy() {
		return insu.ListAllPolicy();
	}

	@PostMapping(value = "/createpolicy")
	public ResponseEntity<Object> createPolicy(@RequestBody InsurancePolicy u) {
		insu.createNewPolicy(u);
		return new ResponseEntity<>("Employee is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseEntity<Object> createEmployee(@RequestBody InsuranceUser u) {
		insu.createNewUser(u);
		return new ResponseEntity<>("Employee is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateEmployee(@RequestBody InsuranceUser u) {
		insu.updateoldUser(u);
		return new ResponseEntity<>("Employee is updated successsfully", HttpStatus.OK);
	}

}
