package com.Fabio.IntrinsicStockAppDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fabio.IntrinsicStockAppDemo.domain.User;
import com.Fabio.IntrinsicStockAppDemo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public boolean verifyUserExistens() {
		
		
		return false;
	}
	
	public boolean verifyUsernamePassword(User user) {
		
		boolean passwordVerify = false;
		User userValid = userRepo.findByUserName(user.getUserName());
		if (userValid != null) {
			passwordVerify = userValid.getPassword().equals(user.getPassword());
		}
		else {
			return false;
		}
		
		if (passwordVerify == true) {
			return true;
		}
		else {
			return false;
		}		
	}

	public User saveUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser;
	}

	public User getUserByUserName(String userName) {
		
		return userRepo.findByUserName(userName);
	}

	public User getUserByUseId(Long userId) {
		
		return userRepo.findByUserId(userId);
	}

}
