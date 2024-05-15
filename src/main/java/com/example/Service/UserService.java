package com.example.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import com.example.model.User;
import com.example.Repository.UserRepository;



@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	  //Construct injection
		public UserService(UserRepository userRepository) {

			this.userRepository = userRepository;

		}

		public void saveMyUser(User user) {

			userRepository.save(user);
		}
		
		
}
