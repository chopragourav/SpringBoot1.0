package com.verusys.gourav.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cricketer_tab")
@Data
public class Cricketer {
	@Id
	@GeneratedValue
	@Column(name = "crick_id_col")
	private Integer cId;
	
	@Column(name = "crick_name_col",length = 20)
	private String cName;
	
	@Column(name = "crick_type_col", length = 20)
	private String cType;
	
	@Column(name = "crick_dob_col")
	private Date dob;
	
	@Column(name = "crick_doj_col")
	private Date doj;
}
