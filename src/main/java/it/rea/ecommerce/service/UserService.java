package it.rea.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.rea.ecommerce.entity.User;
import it.rea.ecommerce.payload.dto.UserDto;
import it.rea.ecommerce.repository.UserRepository;

@Service
@javax.transaction.Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User registerNewUser (UserDto userdto) throws Exception
	{
		if(existsByEmail(userdto.getEmail())) {
			throw new Exception("Email " + userdto.getEmail() + "is already used");
		}
		if(existsByUsername(userdto.getUsername())) {
			throw new Exception("Username " + userdto.getUsername() + "is already used");
		}
		
		User u = new User();
		u.setUsername(userdto.getUsername());
		u.setEmail(userdto.getEmail());
		u.setFirstname(userdto.getFirstname());
		u.setLastname(userdto.getLastname());
		u.setPassword(userdto.getPassword());
		
		
		return userRepository.save(u);
	}
	
	public boolean existsByUsername(String username) {
		return userRepository.existsByUsername(username);
	}
	
	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
	
	public void save(User u) {
		userRepository.save(u);
	}

}
