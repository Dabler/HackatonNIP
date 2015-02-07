<%@page import="controller.PatientManagement"%>
<%@page import="model.Patient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	
	<input type="text" name="firstname" class="form-control" placeholder="Imie" required > </br>
    <input type="text" name="lastname" class="form-control" placeholder="Nazwisko" required> </br>
    <input type="text" name="birthday" class="form-control" placeholder="Data Urodzenia" required> </br>
    <input type="text" name="vaccines" class="form-control" placeholder="Szczepenia" required> </br>
    <input type="text" name="diseases" class="form-control" placeholder="Choroby" required> </br>
    <input type="text" name="allergies" class="form-control" placeholder="Alergie" required> </br>
    <input type="text" name="pesel" class="form-control" placeholder="Pesel" required> </br>
    <input type="text" name="bloodtype" class="form-control" placeholder="Grupa Krwi" required> </br>
    <input type="text" name="icenumber" class="form-control" placeholder="Numer ICE" required> </br>
    <input type="text" name="address" class="form-control" placeholder="Adres" required> </br>
    <input type="text" name="device" class="form-control" placeholder="Device" required> </br>
    
    
    <%
    try{
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lname");
		String bday = request.getParameter("birthday");
		String vaccines = request.getParameter("vaccines");
		String diseases = request.getParameter("diseases");
		String allergies = request.getParameter("allergies");
		String pesel = request.getParameter("pesel");
		String bloodtype = request.getParameter("bloodtype");
		String icenumber = request.getParameter("icenumber");
		String device = request.getParameter("device");
		int deviceNum = Integer.parseInt(device);
		
// 		Patient np = new Patient();
// 		np.setFirstname(fname);
// 		np.setLastname(lname);
// 		np.setBirthday(bday);
// 		np.setVaccines(vaccines);
// 		np.setDiseases(diseases);
// 		np.setAllergies(allergies);
// 		np.setPesel(pesel);
// 		np.setBloodType(bloodtype);
// 		np.setIceNumber(icenumber);
// 		np.setDevice(677653372);

		Patient np = new Patient();
		np.setFirstname("adam");
		np.setLastname("nowak");
		np.setBirthday("23/03/1990");
		np.setVaccines("bla");
		np.setDiseases("bla");
		np.setAllergies("bla");
		np.setPesel("219837912873");
		np.setBloodType("A");
		np.setIceNumber("32094839");
		np.setDevice(677653372);
		
		PatientManagement pm = new PatientManagement("patients");
		pm.addPatient(np);
		
	
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
    %>
    
    <button type="submit" action=NewUser> click! </button>
</body>
</html>