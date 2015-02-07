package controller;

import java.util.HashMap;
import model.Patient;

public interface PatientDAO {
	
	public HashMap<Integer, Patient> getPatientsList();
	public Patient getPatientByPesel(long pesel);
	public Patient getPatientByDevice(int device);
	public void savePatient(Patient param);
	public void updatePatient(Patient param);
	public void deletePatient(Patient param);
}
