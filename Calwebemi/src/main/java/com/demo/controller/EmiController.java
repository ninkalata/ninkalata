package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.Emi;
import com.demo.service.EmiService;

import antlr.collections.List;

@Controller
@RequestMapping("/emi")
public class EmiController {
	@Autowired
	private EmiService emiService;

	@GetMapping("/Addvalues")
	public String showFormForAdd(Model theModel) {
		// create model
		Emi theEmi = new Emi();
		theModel.addAttribute("emi", theEmi);
		return "emi-form";
	}
@PostMapping("/saveEmi")
public String calculator(@RequestParam("loanAmount") float loanAmount,
@RequestParam("rateofInterest") float rateofInterest, @RequestParam("tenure") float tenure,
@RequestParam("NoofInstallments") float NoofInstallments, Model theModel) {
	float theResult = emiService.calculateEmi(loanAmount, rateofInterest, tenure, NoofInstallments);
		theModel.addAttribute(rateofInterest);
		theModel.addAttribute(loanAmount);
		theModel.addAttribute(tenure);
		theModel.addAttribute(NoofInstallments);
		theModel.addAttribute("emi", theResult);
		
		return "emi-form";
	}

//	@PostMapping("/repaymentSchedule")
//	public String repaymentSchedule(@RequestParam("emi") float emi, @RequestParam("loanAmount") float loanAmount,
//				@RequestParam("rateofInterest") float rateofInterest, @RequestParam("tenure") float tenure,
//			@RequestParam("NoofInstallments") float NoofInstallments, Model theModel) {
//		return "list-form";
//		}
}
