package com.insurance.Insurance.Repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.Insurance.contracts.InsuranceDAO;
import com.insurance.Insurance.model.InsurancePackage;
import com.insurance.Insurance.model.InsuranceUser;

@Repository
public class InsuranceRepository {

    private final InsuranceDAO insuranceDAO;

    @Autowired
    public InsuranceRepository(InsuranceDAO insuranceDAO) {
        this.insuranceDAO = insuranceDAO;
    }

    public List<InsurancePackage> getAllPackages() {
        return insuranceDAO.getAll();
    }

    public void addPackage(InsurancePackage e) {
        insuranceDAO.addPackage(e);
    }

    public int updatePackage(InsurancePackage e) {
        return insuranceDAO.updatePackage(e);
    }

    public void addUser(InsuranceUser e) {
        insuranceDAO.addUser(e);
    }

    public int updateUser(InsuranceUser e) {
        return insuranceDAO.updateUser(e);
    }
}

