package com.verusys.gourav.model;

import lombok.Data;

@Data
public class Customer {
	private Integer cno;
	private String cname;
	private String country="";
	private String[] languages=new String[] {"Hindi", "English"};
	private String[] hb=new String[] {"Playing Cricket", "Listening Music"};
	private String state;
	private String dist;
	private String block;
}
