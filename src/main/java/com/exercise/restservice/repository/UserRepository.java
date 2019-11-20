package com.exercise.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exercise.restservice.entity.User;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, String> {

}