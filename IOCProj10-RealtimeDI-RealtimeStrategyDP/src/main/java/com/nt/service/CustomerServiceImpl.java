package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerServiceImpl implements ICustomerService {
	// HAS-A Property
	private ICustomerDAO dao;
	
	//alt+shift+s, o
	public CustomerServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateSimpleIntrest(CustomerDTO dto) throws Exception {
		//calculate Simple Intrest
		Float intAmt=(dto.getPamt()*dto.getTime()*dto.getRate())/100.0f;
		////create BO class obj having persistable data
		CustomerBO bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setpAmt(dto.getPamt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setIntrestAmount(intAmt);
		//use DAO
		int count=dao.insert(bo);
		return count==1?"Customer Registered Sucessfully --> Simple Intrest: "+intAmt:"Customer Registration Failed";
	}


}
