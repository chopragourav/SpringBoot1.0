package com.verusys.gourav.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.verusys.gourav.repository.IHumanActivitiesRepo;
import com.verusys.gourav.service.ICustomerService;

@Service("custService")
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private IHumanActivitiesRepo repo;
	
	@Autowired
	private Environment env;

	@Override
	public Set<String> getAllCountries() {
		Locale[] locales = Locale.getAvailableLocales();
		Set<String> countriesSet = new TreeSet<>();
		for (Locale l : locales)
			countriesSet.add(l.getDisplayCountry());
		return countriesSet;
	}

	@Override
	public Set<String> getAllLanguages() {
		Locale[] locales = Locale.getAvailableLocales();
		Set<String> languagesSet = new TreeSet<>();
		for (Locale l : locales)
			languagesSet.add(l.getDisplayLanguage());
		return languagesSet;
	}

	@Override
	public Set<String> getAllHobbies() {
		return repo.getAllHobbies();
	}

	@Override
	public List<String> getAllStates(String country) {
		String statesInfo=env.getRequiredProperty(country);
		List<String> statesList = Arrays.asList(statesInfo.split(","));
		Collections.sort(statesList);
		return statesList;
	}

	@Override
	public List<String> getAllDistrict(String state) {
		String distInfo=env.getRequiredProperty(state);
		List<String> distList=Arrays.asList(distInfo.split(","));
		Collections.sort(distList);
		return distList;
	}

	@Override
	public List<String> getAllBlock(String district) {
		String blockInfo=env.getRequiredProperty(district);
		List<String> blockList=Arrays.asList(blockInfo.split(","));
		Collections.sort(blockList);
		return blockList;
	}
}
