package com.library.LibraryRestApi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.LibraryRestApi.model.Emprunt;


@Repository
public interface EmpruntDao extends JpaRepository <Emprunt, Integer> {
	
	Emprunt findById(int id);
	
	List<Emprunt> findAll();
	
	
}