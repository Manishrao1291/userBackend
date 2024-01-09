package com.usertask.backend.repo;

import com.usertask.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<User, Long> {

}
