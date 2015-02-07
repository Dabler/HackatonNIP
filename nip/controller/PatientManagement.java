package controller;

import java.io.Serializable;
import java.util.HashMap;

import model.Patient;

@SuppressWarnings("serial")
public class PatientManagement implements Serializable {
	
	private SerializedPatientDAO patientDAO = null;
	
	public PatientManagement (String path){
		patientDAO = new SerializedPatientDAO(path);
	}
	
	public void setPatientDAO(SerializedPatientDAO spd){
		patientDAO = spd;
	}
	
	public SerializedPatientDAO getPatientDAO(){
		return patientDAO;
	}
	
	public void addPatient(Patient param){
		patientDAO.savePatient(param);
	}
	
	public void deletePatient(Patient param){
		patientDAO.deletePatient(param);
	}
	
	public void updatePatient(Patient param){
		patientDAO.updatePatient(param);
	}
	
	public Patient getPatientByPesel(Long pesel){
		return patientDAO.getPatientByPesel(pesel);
	}
	
	public HashMap<Long, Patient> getPatients()
	{
		return patientDAO.getPatientsList();
	}
}
