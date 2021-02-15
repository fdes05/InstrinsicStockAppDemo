package com.Fabio.IntrinsicStockAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Fabio.IntrinsicStockAppDemo.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);

	User findByUserId(Long userId);

}
