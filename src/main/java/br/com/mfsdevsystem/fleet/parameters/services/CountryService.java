package br.com.mfsdevsystem.fleet.parameters.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mfsdevsystem.fleet.parameters.models.Country;
import br.com.mfsdevsystem.fleet.parameters.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

	public final CountryRepository countryRepository;

	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	@Override
	public List<Country> getAll(){
		return countryRepository.findAll() ;
	}
	
	@Override
	public void save(Country country) {
		countryRepository.save( country );
		
	}

	@Override
	public void delete(Integer id) {

		countryRepository.deleteById(id);
	
	}
	
	
}
