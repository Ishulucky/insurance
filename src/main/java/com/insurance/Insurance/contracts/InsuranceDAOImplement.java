package com.insurance.Insurance.contracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.insurance.Insurance.model.InsurancePolicy;
import com.insurance.Insurance.model.InsurancePolicyRowMapper;
import com.insurance.Insurance.model.InsuranceUser;

@Component
public class InsuranceDAOImplement implements InsuranceDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<InsurancePolicy> getAllPolicies() {
		String sql = "SELECT * FROM ish_InsurancePolicies";
		return jdbcTemplate.query(sql, new InsurancePolicyRowMapper());
	}

	public int addPolicy(InsurancePolicy e) {
		return jdbcTemplate.update(
				"INSERT INTO ish_InsurancePolicies (iplc_id,iplc_cust_id, iplc_cdate, iplc_sum_assured, iplc_applicable_date, iplc_insp_id, iplc_yrly_prem_amount, iplc_expdate, iplc_agnt_id) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)",
				e.getIplcId(), e.getIplcCustId(), e.getIplcCdate(), e.getIplcSumAssured(), e.getIplcApplicableDate(),
				e.getIplcInspId(), e.getIplcYrlyPremAmount(), e.getIplcExpdate(), e.getIplcAgntId());
	}

	public int addUser(InsuranceUser e) {
		return jdbcTemplate.update(
				"INSERT INTO ish_insurance_Users (user_id, user_name, user_cdate, user_pwd, user_type, user_status) VALUES (?, ?, ?, ?, ?, ?)",
				e.getUserId(), e.getUserName(), e.getUserCDate(), e.getUserPwd(), e.getUserType(), e.getUserStatus());
	}

	public int updateUser(InsuranceUser e) {
		return jdbcTemplate.update("update ish_insurance_Users set user_pwd = ? where user_name = ?", e.getUserPwd(),
				e.getUserName());
	}

}
