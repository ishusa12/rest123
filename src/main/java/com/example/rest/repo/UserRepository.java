package com.example.rest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}