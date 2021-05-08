package eTicaretDemo.core.concretes;

import eTicaretDemo.core.abstracts.AuthenticationService;
import eTicaretDemo.googleAuthentication.GoogleAuthenticationManager;

public class GoogleAuthenticationManagerAdapter implements AuthenticationService{
	GoogleAuthenticationManager googleAuthenticationManager = new GoogleAuthenticationManager();

	@Override
	public void registerToSystem(String email, String password) {
		googleAuthenticationManager.registerWithGoogle(email, password);
		
	}

	@Override
	public void loginToSystem(String email, String password) {
		googleAuthenticationManager.loginWithGoogle(email, password);
		
	}

}
