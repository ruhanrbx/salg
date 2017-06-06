package fr.com.salg.service;

import java.util.List;

import fr.com.salg.entity.UserInfo;

public interface UserService {
	
	UserInfo findById(Long id);
	
	UserInfo saveOrUpdate(UserInfo user);
	
	void delete (Long id);
	
	List<UserInfo> listAll();
	
	

}
