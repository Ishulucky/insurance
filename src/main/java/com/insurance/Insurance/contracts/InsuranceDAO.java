package com.insurance.Insurance.contracts;

import java.util.List;

import com.insurance.Insurance.model.InsurancePolicy;
import com.insurance.Insurance.model.InsuranceUser;

public interface InsuranceDAO {
	List<InsurancePolicy> getAllPolicies();

	int addUser(InsuranceUser e);

	int updateUser(InsuranceUser e);

	int addPolicy(InsurancePolicy e);

}
