package eTicaretDemo.googleAuthentication;

public class GoogleAuthenticationManager {
	public void registerWithGoogle(String email, String password) {
		System.out.println("Google'a kay�t ba�ar�l�d�r: " + email);
	}
	
	public void loginWithGoogle(String email,String password) {
		System.out.println("Google ile giri� ba�ar�l�: " + email);
	}

}
