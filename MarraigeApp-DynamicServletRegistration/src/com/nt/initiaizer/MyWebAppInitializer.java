package com.nt.initiaizer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import com.nt.servlet.MarriageServlet;

public class MyWebAppInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> set, ServletContext sc) throws ServletException {
		MarriageServlet servlet=null;
		ServletRegistration.Dynamic dyna=null;
		servlet=new MarriageServlet();
		dyna=sc.addServlet("ms", servlet);
		dyna.addMapping("/marriageurl");
		dyna.setLoadOnStartup(1);
	}

}
