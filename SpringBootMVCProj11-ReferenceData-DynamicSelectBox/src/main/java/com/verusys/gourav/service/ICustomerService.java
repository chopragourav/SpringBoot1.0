package com.verusys.gourav.service;

import java.util.List;
import java.util.Set;

public interface ICustomerService {
	
	public Set<String> getAllCountries();
	public Set<String> getAllLanguages();
	public Set<String> getAllHobbies();
	
	public List<String> getAllStates(String country);
	public List<String> getAllDistrict(String state);
	public List<String> getAllBlock(String district);
}
