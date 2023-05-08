package com.Music.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Music.demo.Model.Details;


@Repository
public interface DetailsRepository extends JpaRepository<Details,Long>{

}
