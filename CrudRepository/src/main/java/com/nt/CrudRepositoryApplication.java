package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineServiceMgmt;

@SpringBootApplication
public class CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CrudRepositoryApplication.class, args);
		ICoronaVaccineServiceMgmt service=ctx.getBean("service", ICoronaVaccineServiceMgmt.class);
		/*try {
			CoronaVaccine vacc=new CoronaVaccine(1L, "Covavax", "US pharmaceutical", "USA", 1140.0, 1);
			System.out.println(service.registerVaccine(vacc));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}
