package com.myblog.blogapp.repository;

import com.myblog.blogapp.entities.Role;
import com.myblog.blogapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
