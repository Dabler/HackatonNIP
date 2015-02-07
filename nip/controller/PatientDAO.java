package controller;

import java.util.HashMap;
import model.Patient;

public interface PatientDAO {
	
	public HashMap<Long, Patient> getPatientsList();
	public Patient getPatientByPesel(long pesel);
	void savePatient(Patient param);
	void updatePatient(Patient param);
	void deletePatient(Patient param);
}
