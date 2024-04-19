package com.shalini.com.rest.Repo;

import com.shalini.com.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
