package com.usecase.library.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Library implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int libId;
	
	private String libName;
	
	//@OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
   // private List<Book> books;
	
	public Library()
	{
		
	}



	public Library(int libId, String libName) {
		super();
		this.libId = libId;
		this.libName = libName;
	}



	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}


	
	
	

}
