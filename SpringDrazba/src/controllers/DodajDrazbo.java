package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import classesDAO.Drazba;

public class DodajDrazbo {

	@RequestMapping("/dodaj")
	public String dodajDrazbo(@ModelAttribute("dodajDrazbo") Drazba drazba, HttpServletRequest request){
		
		System.out.println(drazba.getImeDrazbe());
		
		return "asdlkasd";
		
	}
}
