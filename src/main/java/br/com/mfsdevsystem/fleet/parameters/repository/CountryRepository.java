package br.com.mfsdevsystem.fleet.parameters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mfsdevsystem.fleet.parameters.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{

}
