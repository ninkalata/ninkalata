package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
	@Table(name="emi")
	public class Emi {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="no")
		private int no;
		 
		@Column(name="loanAmount")
		@Range(min=0)
	    @NotEmpty(message="Please Enter out standing principaL")
		private float loanAmount;
		
		@Column(name="rateofInterest")
		@Range(min=0)
		@NotEmpty(message="Please Enter interestRate")
	    private float rateofInterest;
		
		@Column(name="NoofInstallments")
		@Range(min=0)
		@NotEmpty(message="Please Enter principle")
		private float NoofInstallments;
		
	   @Column(name="tenure")
		@Range(min=0)
		@NotEmpty(message="Please Enter principle")
		private float tenure;
	   
		@Override
	public String toString() {
		return "Emi [no=" + no + ", loanAmount=" + loanAmount + ", rateofInterest=" + rateofInterest
				+ ", NoofInstallments=" + NoofInstallments + ", tenure=" + tenure + ", emi=" + emi + "]";
	}

		public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public float getRateofInterest() {
		return rateofInterest;
	}

	public void setRateofInterest(float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}

	public float getNoofInstallments() {
		return NoofInstallments;
	}

	public void setNoofInstallments(float noofInstallments) {
		NoofInstallments = noofInstallments;
	}

	public float getTenure() {
		return tenure;
	}

	public void setTenure(float tenure) {
		this.tenure = tenure;
	}

	public float getEmi() {
		return emi;
	}

	public void setEmi(float emi) {
		this.emi = emi;
	}

		@Column(name="emi")
		@Range(min=0)
		@NotEmpty(message="Please Enter emi")
		private float emi;
 
		}