package com.Music.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.RegistrationMusic;

@Repository

public interface RegistrationRepository extends JpaRepository<RegistrationMusic,Integer>{

}
