package com.demo.service;

import java.util.List;

import org.springframework.ui.Model;

import com.demo.entity.Emi;


public  interface  EmiService {
 public float calculateEmi(float loanAmount, float rateofInterest, float tenure, float NoofInstallments);
//   public void repaymentSchedule(float emi, float loanAmount, float rateofInterest, float tenure, float NoofInstallments);
   
	

}
