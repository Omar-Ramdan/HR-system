package com.example.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.example.Repository.UserRepository;

import com.example.model.Users;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	  //Construct injection
		public UserService(UserRepository userRepository) {

			this.userRepository = userRepository;

		}

		public void saveMyUser(Users user) {

			userRepository.save(user);
		}
		
		
}
