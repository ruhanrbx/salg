package fr.com.salg.repository;

import org.springframework.data.repository.CrudRepository;

import fr.com.salg.entity.User;

public interface UserRepo extends CrudRepository<User, Long>{
	
	

}
