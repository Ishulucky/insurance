package com.insurance.Insurance.contracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.insurance.Insurance.model.InsurancePackage;
import com.insurance.Insurance.model.InsurancePackageMapper;
import com.insurance.Insurance.model.InsuranceUser;

@Repository
public class InsuranceDAoImplement implements InsuranceDAO {
	private final JdbcTemplate j;

	@Autowired
	public InsuranceDAoImplement(JdbcTemplate j) {
		this.j = j;
	}

	public List<InsurancePackage> getAll() {
		String sql = "SELECT * FROM ish_InsurancePackages";
		return j.query(sql, new InsurancePackageMapper());
	}
	
	 @Override
	    public void addPackage(InsurancePackage e) {
	        j.update(
	                "INSERT INTO ish_InsurancePackages (insp_title, insp_desc, insp_status, insp_range_start, insp_range_end, insp_agelimit_start, insp_agelimit_end) VALUES (?, ?, ?, ?, ?, ?, ?)",
	                e.getTitle(), e.getDescription(), e.getStatus(), e.getRangeStart(), e.getRangeEnd(), e.getAgeLimitStart(), e.getAgeLimitEnd());
	    }
	
	 @Override
	    public int updatePackage(InsurancePackage e) {
	        return j.update(
	                "UPDATE ish_InsurancePackages SET insp_title=?, insp_desc=?, insp_status=?, insp_range_start=?, insp_range_end=?, insp_agelimit_start=?, insp_agelimit_end=? WHERE insp_id=?",
	                e.getTitle(), e.getDescription(), e.getStatus(), e.getRangeStart(), e.getRangeEnd(), e.getAgeLimitStart(), e.getAgeLimitEnd(), e.getId());
	    }

	public void addUser(InsuranceUser e) {
		j.update(
				"INSERT INTO ish_insurance_Users (user_id, user_name, user_cdate, user_pwd, user_type, user_status) VALUES (?, ?, ?, ?, ?, ?)",
				e.getUserId(), e.getUserName(), e.getUserCDate(), e.getUserPwd(), e.getUserType(), e.getUserStatus());
	}
	
	public int updateUser(InsuranceUser e) {
		return j.update("update ish_insurance_Users set user_pwd = ? where user_name = ?", e.getUserPwd(), e.getUserName());
	}
	
	

}
