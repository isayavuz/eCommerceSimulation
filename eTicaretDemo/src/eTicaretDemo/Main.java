package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new HibernateUserDao());
		User user1=new User(1, "isa", "yavuz", "isa@gmail.com", "1234567");
		User user2=new User(2, "isa", "yavuz", "yavuz@mail.com", "1234567");
		User user3=new User(3, "isa", "yavuz", "isa@gmail.com", "1234567");
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);

	}

}
