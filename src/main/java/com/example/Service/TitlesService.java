package com.example.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.example.Repository.TitlesRepository;
import com.example.model.Employees;
import com.example.model.Titles;

@Service
@Transactional
public class TitlesService {

	
	private final TitlesRepository titlesRepository;
	
	  //Construct injection
		public TitlesService(TitlesRepository titlesRepository) {

			this.titlesRepository = titlesRepository;

		}
		
		public void saveMyTitle(Titles title) {

			titlesRepository.save(title);
		}

}
