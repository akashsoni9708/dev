package com.openapi.dev.repository;

import com.openapi.dev.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserRegistration, Integer> {

}
