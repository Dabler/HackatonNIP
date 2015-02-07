package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import model.Patient;

@SuppressWarnings("serial")
public class SerializedPatientDAO implements PatientDAO, Serializable{
	
	public HashMap<Integer, Patient> patients;
	private String path;
	
	public SerializedPatientDAO(String path){
		this.path = path;
		patients = new HashMap<Integer, Patient>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public HashMap<Integer, Patient> getPatientsList() {
		InputStream is = null;
		
		try{
			is = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(is);
			patients = (HashMap<Integer, Patient>) ois.readObject();
			ois.close();
			is.close();
		}
		catch(IOException e){
			System.err.println(e);
		}
		
		catch(ClassNotFoundException e){
			System.err.println(e);
		}
		
		finally{
			try{
				is.close();
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return patients;
	}

	@Override
	public Patient getPatientByPesel(long pesel) {
		return patients.get(pesel);
	}
	
	

	@Override
	public void savePatient(Patient param) {
		HashMap<Integer, Patient> patients = getPatientsList();
		if(patients.get(param.getPesel()) == null){
			patients.put(param.getDevice(), param);
			OutputStream out = null;
			
			try{
				out = new FileOutputStream(path);
				ObjectOutputStream o = new ObjectOutputStream(out);
				o.writeObject(patients);
			}
			catch(IOException e){
				System.err.println(e);
			}
			finally{
				try{
					out.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void updatePatient(Patient param) {
		HashMap<Integer, Patient> patients = getPatientsList();
		if(patients.get(param.getPesel()) != null){
			patients.remove(param.getPesel());
			patients.put(param.getDevice(), param);
			OutputStream out = null;
			
			try{
				out = new FileOutputStream(path);
				ObjectOutputStream o = new ObjectOutputStream(out);
				o.writeObject(patients);
			}
			catch(IOException e){
				System.err.println(e);
			}
			finally{
				try{
					out.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else System.err.println("no patient found");
		
		
	}

	@Override
	public void deletePatient(Patient param) {
		HashMap<Integer, Patient> patients = getPatientsList();
		if(patients.get(param.getPesel()) != null){
			patients.remove(param.getPesel());
			OutputStream out = null;
			
			try{
				out = new FileOutputStream(path);
				ObjectOutputStream o = new ObjectOutputStream(out);
				o.writeObject(patients);
			}
			catch(IOException e){
				System.err.println(e);
			}
			finally{
				try{
					out.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else System.err.println("no patient found");

		
	}

	@Override
	public Patient getPatientByDevice(int device) {
		return patients.get(device);
	}

}
