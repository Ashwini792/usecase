package com.usecase.library.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.usecase.library.model.Book;


public interface BookRespository extends JpaRepository<Book,Integer>{

	List<Book> findByLibraryLibId(int libId);
	
	//@Query("SELECT u FROM Book u join Library l on u.lib_id=l.library_lib_id where l.library_lib_id = ?1")
	//List<Book> findByLibId(int libId);

	


}
