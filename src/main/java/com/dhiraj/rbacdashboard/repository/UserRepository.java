package com.dhiraj.rbacdashboard.repository;

import com.dhiraj.rbacdashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
