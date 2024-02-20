package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserInfoRepository extends JpaRepository<User, Integer> {

	User findByUsermailAndUserpassword(String usermail, String userpassword);
}
