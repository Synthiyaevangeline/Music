package com.Music.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.LoginMusic;

@Repository
	public interface LoginRepository extends JpaRepository<LoginMusic, Integer>
    {

		LoginMusic findByusername(String username);
	}




