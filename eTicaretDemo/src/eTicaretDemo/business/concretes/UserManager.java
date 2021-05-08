package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	List<User> users = new ArrayList<>();

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(user.getFirstName()==null || user.getLastName()==null || user.getEmail()==null || user.getPassword()==null) {
			System.out.println("Alanlar boþ býrakýlamaz. Kayýt baþarýsýz oldu.");
			return;
		}
		if(user.getFirstName().length()<=2 || user.getLastName().length()<=2) {
			System.out.println("Ad ve soyad alaný en az 2 karakter olmalýdýr. Kayýt baþarýsýz oldu.");
			return;
		}
		if(user.getPassword().length()<=6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr. Kayýt baþarýsýz oldu.");
			return;
		}
		
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    CharSequence inputStr = user.getEmail();
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(inputStr);
		if(!matcher.matches()) {
			System.out.println("E-posta alaný e-posta formatýnda olmalýdýr. Kayýt baþarýsýz oldu.");
			return;
		}
		
		if(!emailCheck(user)) {
			System.out.println("E-Posta daha önce kullanýlmamýþ olmalýdýr.");
			return;
		}
		
		this.userDao.add(user);
		System.out.println("Kayýt baþarýlý: "+user.getEmail());
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getall() {
		return userDao.getall();
	}

	@Override
	public boolean emailCheck(User user) {
		for (User u : users)
			if (u.getEmail() == user.getEmail()) {
				return false;
		            }
		users.add(user);
		        return true;
	}

}
