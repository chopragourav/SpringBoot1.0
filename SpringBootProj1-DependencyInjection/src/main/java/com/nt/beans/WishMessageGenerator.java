package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime date;
	
	public String generateWishMessage(String user) {
		int hour=date.getHour();
		
		//write B.Logic
		if(hour<12)
			return "Good Morning: "+user;
		else if(hour<16)
			return "Good Morning: "+user;
		else if(hour<20)
			return "Good Morning: "+user;
		else
			return "Good Night: "+user;
	}
}
