package controller;

public class Authenticator {
	String login;
	String password;
	
	public boolean authenticate(String login, String password)
	{
		if(login.equals("admin") && login.equals("pass"))
		{
			return true;
		}
		else return false;
	}
}
