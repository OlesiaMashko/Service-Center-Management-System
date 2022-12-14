package net.javaguides.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Admin;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.AdminRepository;
import net.javaguides.springboot.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public boolean getUser(String username, String password) {
		
		if((userRepository.findByUserName(username,password)).size()>0) {
			return true;
		}
		return false;
	}
	
	public void saveUser(User user) {
		this.userRepository.save(user);
	}
	
	@Autowired
	AdminRepository adminRepository;
	
	public boolean getAdmin(String username, String password) {
		
		if((adminRepository.findByUserName(username,password)).size()>0) {
			return true;
		}
		return false;
	}
	
	public void saveAdmin(Admin admin) {
		this.adminRepository.save(admin);
	}
}
