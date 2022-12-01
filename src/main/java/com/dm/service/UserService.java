package com.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.entity.User;
import com.dm.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public User updateUser(long id, User user) {
		User userData = userRepository.findById(id).get();
		userData.setUserName(user.getUserName());
		userData.setPassword(user.getPassword());
		userData.setAge(user.getAge());
		userData.setGender(user.getGender());
		userData.setAddress(user.getAddress());
		return userRepository.save(userData);
	}

	public String validateUserInfo(User user) {
		String valid = null;
		User existingUserData = userRepository.findUserByName(user.getUserName());
		if (user.getUserName().equals(existingUserData.getUserName())
				&& user.getPassword().equals(existingUserData.getPassword())) {
			valid = "Valid";
		} else {
			valid = "Not Valid";
		}
		return valid;
	}
}
