package com.example.Restourant.Repository;

import com.example.Restourant.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    
    User findByUsernameAndPassword(String username, String password);
}
