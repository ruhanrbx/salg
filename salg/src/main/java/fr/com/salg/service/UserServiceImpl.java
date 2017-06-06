package fr.com.salg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.com.salg.entity.UserInfo;
import fr.com.salg.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;

	@Autowired
	public UserServiceImpl(UserRepo userRepo) {

		this.userRepo = userRepo;
	}

	@Override
	public UserInfo findById(Long id) {

		return userRepo.findOne(id);
	}

	@Override
	public UserInfo saveOrUpdate(UserInfo user) {

		return userRepo.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepo.delete(id);

	}

	@Override
	public List<UserInfo> listAll() {
		List<UserInfo> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}

}
