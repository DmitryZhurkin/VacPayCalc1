package com.example.VacPayCalc.AddController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.VacPayCalc.domain.PayCalculator;

@Controller
public class PayCalculatorController {
	
	@GetMapping("/index")
	public String sendForm(Model model) {
		model.addAttribute("Calculate", new PayCalculator());
		return "index";
	}

	
	@PostMapping("/calculate")
	public String calcForm(@ModelAttribute PayCalculator payCalculator, BindingResult result,Model model) {
		model.addAttribute("payCalulator", payCalculator);
		return "calculate";
	}
}
