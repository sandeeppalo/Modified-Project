package org.deloitte.schoolmanagement.staffregistration.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@SuppressWarnings("serial")
@Entity
@Table(name="Country_Info")
@Component
public class Country_Info implements Serializable{
	@Id
	@Column(length=5)
	private String country_Id;
	@Column(length=25)
	private String country_Name;
	@Column(length=25)
	private String state_Name;

	
	public String getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public String getState_Name() {
		return state_Name;
	}
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

}
