package com.andrei.dbTest.repository;

import com.andrei.dbTest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{}
