package controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class DodajDrazbo {

	@RequestMapping("/dodaj.jsp")
	public String dodajDrazbo(@ModelAttribute("dodajDrazbo") String a){
		return a;
		
	}
}
