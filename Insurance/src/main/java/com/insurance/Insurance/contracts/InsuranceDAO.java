package com.insurance.Insurance.contracts;

import java.util.List;

import com.insurance.Insurance.model.InsurancePackage;
import com.insurance.Insurance.model.InsuranceUser;

public interface InsuranceDAO {
	List<InsurancePackage> getAll();

	void addPackage(InsurancePackage e);

    int updatePackage(InsurancePackage e);

	void addUser(InsuranceUser e);

	int updateUser(InsuranceUser e);

}
