package com.insurance.Insurance.model;

import java.util.Date;

public class InsurancePolicy {
	private int iplcId;
	private int iplcCustId;
	private Date iplcCdate;
	private double iplcSumAssured;
	private Date iplcApplicableDate;
	private int iplcInspId;
	private double iplcYrlyPremAmount;
	private Date iplcExpdate;
	private int iplcAgntId;

	public InsurancePolicy() {
		super();
	}

	public InsurancePolicy(int iplcId, int iplcCustId, Date iplcCdate, double iplcSumAssured, Date iplcApplicableDate,
			int iplcInspId, double iplcYrlyPremAmount, Date iplcExpdate, int iplcAgntId) {
		super();
		this.iplcId = iplcId;
		this.iplcCustId = iplcCustId;
		this.iplcCdate = iplcCdate;
		this.iplcSumAssured = iplcSumAssured;
		this.iplcApplicableDate = iplcApplicableDate;
		this.iplcInspId = iplcInspId;
		this.iplcYrlyPremAmount = iplcYrlyPremAmount;
		this.iplcExpdate = iplcExpdate;
		this.iplcAgntId = iplcAgntId;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [iplcId=" + iplcId + ", iplcCustId=" + iplcCustId + ", iplcCdate=" + iplcCdate
				+ ", iplcSumAssured=" + iplcSumAssured + ", iplcApplicableDate=" + iplcApplicableDate + ", iplcInspId="
				+ iplcInspId + ", iplcYrlyPremAmount=" + iplcYrlyPremAmount + ", iplcExpdate=" + iplcExpdate
				+ ", iplcAgntId=" + iplcAgntId + "]";
	}

	public int getIplcId() {
		return iplcId;
	}

	public void setIplcId(int iplcId) {
		this.iplcId = iplcId;
	}

	public int getIplcCustId() {
		return iplcCustId;
	}

	public void setIplcCustId(int iplcCustId) {
		this.iplcCustId = iplcCustId;
	}

	public Date getIplcCdate() {
		return iplcCdate;
	}

	public void setIplcCdate(Date iplcCdate) {
		this.iplcCdate = iplcCdate;
	}

	public double getIplcSumAssured() {
		return iplcSumAssured;
	}

	public void setIplcSumAssured(double iplcSumAssured) {
		this.iplcSumAssured = iplcSumAssured;
	}

	public Date getIplcApplicableDate() {
		return iplcApplicableDate;
	}

	public void setIplcApplicableDate(Date iplcApplicableDate) {
		this.iplcApplicableDate = iplcApplicableDate;
	}

	public int getIplcInspId() {
		return iplcInspId;
	}

	public void setIplcInspId(int iplcInspId) {
		this.iplcInspId = iplcInspId;
	}

	public double getIplcYrlyPremAmount() {
		return iplcYrlyPremAmount;
	}

	public void setIplcYrlyPremAmount(double iplcYrlyPremAmount) {
		this.iplcYrlyPremAmount = iplcYrlyPremAmount;
	}

	public Date getIplcExpdate() {
		return iplcExpdate;
	}

	public void setIplcExpdate(Date iplcExpdate) {
		this.iplcExpdate = iplcExpdate;
	}

	public int getIplcAgntId() {
		return iplcAgntId;
	}

	public void setIplcAgntId(int iplcAgntId) {
		this.iplcAgntId = iplcAgntId;
	}
}
