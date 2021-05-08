package eTicaretDemo.dataAccess.concretes;

import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi: "+user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
