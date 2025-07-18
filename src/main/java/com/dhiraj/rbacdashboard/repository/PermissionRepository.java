package com.dhiraj.rbacdashboard.repository;

import com.dhiraj.rbacdashboard.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
