package com.verusys.gourav.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HUMAN_ACTIVITES")
public class HumanActivities {
	@Id
	private String hobbies;
}
