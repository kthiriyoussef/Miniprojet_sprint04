package com.youssef.Miniprojet.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.youssef.Miniprojet.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
