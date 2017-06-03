package fr.com.salg.service;

import java.util.List;

import fr.com.salg.entity.User;

public interface UserService {
	
	User findById(Long id);
	
	User saveOrUpdate(User user);
	
	void delete (Long id);
	
	List<User> listAll();
	
	

}
