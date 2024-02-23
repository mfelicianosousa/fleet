package br.com.mfsdevsystem.fleet.parameters.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@GetMapping("/countryAdd")
	public String addCountry() {
		return "parameters/countryAdd";
	}
	
	@PostMapping("/countries")
	public String save(Country country) {
		countryService.save(country);
		return "redirect:/countries";	
	}

	@RequestMapping(value = "/countries/delete/{id}", method= { RequestMethod.GET, RequestMethod.DELETE})
	public String delete (@PathVariable Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
