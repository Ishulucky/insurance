package com.insurance.Insurance.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InsurancePolicyRowMapper implements RowMapper<InsurancePolicy> {

	@Override
	public InsurancePolicy mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		InsurancePolicy policy = new InsurancePolicy();
		policy.setIplcId(resultSet.getInt("iplc_id"));
		policy.setIplcCustId(resultSet.getInt("iplc_cust_id"));
		policy.setIplcCdate(resultSet.getDate("iplc_cdate"));
		policy.setIplcSumAssured(resultSet.getDouble("iplc_sum_assured"));
		policy.setIplcApplicableDate(resultSet.getDate("iplc_applicable_date"));
		policy.setIplcInspId(resultSet.getInt("iplc_insp_id"));
		policy.setIplcYrlyPremAmount(resultSet.getDouble("iplc_yrly_prem_amount"));
		policy.setIplcExpdate(resultSet.getDate("iplc_expdate"));
		policy.setIplcAgntId(resultSet.getInt("iplc_agnt_id"));
		return policy;
	}
}