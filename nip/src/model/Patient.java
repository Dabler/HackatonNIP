package model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import controller.PatientManagement;

public class Patient implements Serializable{

	private String firstname;
	private String lastname;
	private String birthday;
	private String vaccines;
	private String diseases;
	private String allergies;
 	private String pesel;
 	private String bloodType;
 	private String iceNumber;
 	private String address;
 	int device;
 	
 	public Patient() throws IOException
 	{
 		firstname = "adam";
 		lastname = "nowak";
 		birthday = "23/04/1990";
 		vaccines = "oiewfjweoi";
 		diseases = "oiqjdfoeio";
 		allergies = "ioewfjew";
 		pesel="0928309282109";
 		bloodType = "A";
 		iceNumber = "291038120938210983";
 		address = "kwaitowa4";
 		device = 677653372;
 		
 	
 	}
 	
	
	public int getDevice() {
		return device;
	}
	public void setDevice(int device) {
		this.device = device;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday( String birthday) {
		this.birthday = birthday;
	}
	public String getVaccines() {
		return vaccines;
	}
	public void setVaccines(String vaccines) {
		this.vaccines = vaccines;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String  diseases) {
		this.diseases = diseases;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getIceNumber() {
		return iceNumber;
	}
	public void setIceNumber(String iceNumber) {
		this.iceNumber = iceNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
