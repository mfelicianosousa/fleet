package br.com.mfsdevsystem.fleet.parameters.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mfsdevsystem.fleet.parameters.models.Country;
import br.com.mfsdevsystem.fleet.parameters.services.CountryService;

@Controller
public class CountryController {

	private final CountryService countryService;

	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
	/*
	@GetMapping("/countries")
	@ResponseBody  <-----------Erro json
	public List<Country> getAll(){
		return countryService.getAll();
	}
	*/
	
	@GetMapping("/countries")
	public String getAll(Model model){
		List<Country> countries = countryService.getAll();
		model.addAttribute("countries", countries);
		return "parameters/countryList" ;
	}
}
