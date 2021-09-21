package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

@Service("service")
public class CoronaVaccineServiceMgmtImpl implements ICoronaVaccineServiceMgmt {
	@Autowired
	private ICoronaVaccineRepo vaccineRepo;
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine saveVaccine=null;
		if(vaccine!=null)
			saveVaccine=vaccineRepo.save(vaccine);
		return saveVaccine!=null?"Vaccine Registration Success with "+saveVaccine.getRegNo():"Vaccine Registration Failed";
	}
	@Override
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccines) {
		if(vaccines!=null)
		return vaccineRepo.saveAll(vaccines);
		else
			throw new IllegalArgumentException("batch insertion not done");
	}
	
	@Override
	public Long getVaccinesCount() {
		return vaccineRepo.count();
	}
	
	@Override
	public Boolean checkVaccineAvailabilityByRegNo(Long regNo) {
		return vaccineRepo.existsById(regNo);
	}
}
