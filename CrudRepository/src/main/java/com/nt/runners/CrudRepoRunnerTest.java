package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineServiceMgmt;

@Component
public class CrudRepoRunnerTest implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		//Insert Single record at a time
		/*try {
			//CoronaVaccine vacc=new CoronaVaccine("Phizer", "US pharmaceutical", "USA", 500.0, 1);
			CoronaVaccine vaccine=new CoronaVaccine(null, null, null, null, null);
			System.out.println(service.registerVaccine(vaccine));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();		
		}*/
		
		//Insert record in Bulk at a time
		/*try {
			Iterable<CoronaVaccine> listVaccines=service.registerInBatch(List.of(new CoronaVaccine("abc", "xyz", "India",100.0, 2),
																																			 new CoronaVaccine("Moderana", "Moderana", "USA", 455.2, 1)
																																			 ));
			System.out.println("The regNos are: ");
			listVaccines.forEach(vaccine->System.out.println(vaccine.getRegNo()));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();		
		}*/
		
		//vaccine count
		/*try {
			System.out.println("Records Count: "+service.getVaccinesCount());
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
		
		//Vaccine Availability check
		try {
			System.out.println("9 RegNo vaccine Available "+service.checkVaccineAvailabilityByRegNo(9L));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
