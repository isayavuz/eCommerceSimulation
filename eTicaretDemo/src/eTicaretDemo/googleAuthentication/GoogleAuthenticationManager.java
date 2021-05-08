package eTicaretDemo.googleAuthentication;

public class GoogleAuthenticationManager {
	public void registerWithGoogle(String email, String password) {
		System.out.println("Google'a kayýt baþarýlýdýr: " + email);
	}
	
	public void loginWithGoogle(String email,String password) {
		System.out.println("Google ile giriþ baþarýlý: " + email);
	}

}
