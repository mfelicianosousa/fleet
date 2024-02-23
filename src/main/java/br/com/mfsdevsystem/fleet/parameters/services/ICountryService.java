package br.com.mfsdevsystem.fleet.parameters.services;

import java.util.List;

import br.com.mfsdevsystem.fleet.parameters.models.Country;

public interface ICountryService {
	

	public List<Country> getAll();
	
	public void save(Country country);	
	
	public void delete(Integer id);

}
