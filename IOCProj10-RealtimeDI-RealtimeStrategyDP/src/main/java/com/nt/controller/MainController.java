package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVO;

public final class MainController {
	private ICustomerService service;

	public MainController(ICustomerService service) {
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception{
		//convert  VO class obj data to DTO class object data
		CustomerDTO dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		//use service
		String result=service.calculateSimpleIntrest(dto);
		return result;
	}
	
	
}
