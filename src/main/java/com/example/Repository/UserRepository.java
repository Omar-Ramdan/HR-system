package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer>{

}
