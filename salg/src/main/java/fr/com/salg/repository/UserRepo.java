package fr.com.salg.repository;

import org.springframework.data.repository.CrudRepository;

import fr.com.salg.entity.UserInfo;

public interface UserRepo extends CrudRepository<UserInfo, Long>{
	
	

}
