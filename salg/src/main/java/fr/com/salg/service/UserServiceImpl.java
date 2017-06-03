package fr.com.salg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.com.salg.entity.User;
import fr.com.salg.repository.UserRepo;

public class UserServiceImpl implements UserService {

	private UserRepo userRepo;

	@Autowired
	public UserServiceImpl(UserRepo userRepo) {

		this.userRepo = userRepo;
	}

	@Override
	public User findById(Long id) {

		return userRepo.findOne(id);
	}

	@Override
	public User saveOrUpdate(User user) {

		return userRepo.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepo.delete(id);

	}

	@Override
	public List<User> listAll() {
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}

}
