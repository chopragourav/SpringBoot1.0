package com.nt.service;

import java.util.List;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineServiceMgmt {
	public String registerVaccine(CoronaVaccine vaccine);		
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines);
	public Long getVaccinesCount();
	public  Boolean checkVaccineAvailabilityByRegNo(Long regNo);
}

