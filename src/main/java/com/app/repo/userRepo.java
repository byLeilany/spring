/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.repo;

/**
 *
 * @author leila
 */

import org.springframework.stereotype.Repository;
import com.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepo extends JpaRepository<User, String> {

    public User findByUserId(String userId);
    
}
