package com.usecase.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.usecase.library.model.Library;

public  interface LibraryRepository extends JpaRepository<Library,Integer>{

	
}
