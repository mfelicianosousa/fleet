package br.com.mfsdevsystem.fleet.parameters.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mfsdevsystem.fleet.parameters.models.Country;
import br.com.mfsdevsystem.fleet.parameters.repository.CountryRepository;

@Service
public class CountryService {

	public final CountryRepository countryRepository;

	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	public List<Country> getAll(){
		return countryRepository.findAll() ;
	}
}
