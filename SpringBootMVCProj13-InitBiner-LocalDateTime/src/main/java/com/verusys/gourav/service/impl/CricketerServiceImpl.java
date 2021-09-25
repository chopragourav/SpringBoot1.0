package com.verusys.gourav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verusys.gourav.entity.Cricketer;
import com.verusys.gourav.repository.ICricketerRepository;
import com.verusys.gourav.service.ICricketerService;

@Service
public class CricketerServiceImpl implements ICricketerService {

	@Autowired
	private ICricketerRepository repo;

	@Override
	public String registerCricketer(Cricketer cricketer) {
		return "Cricketer registered with "+repo.save(cricketer).getCId();
	}

}
