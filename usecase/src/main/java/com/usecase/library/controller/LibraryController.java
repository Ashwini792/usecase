package com.usecase.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.library.model.Library;
import com.usecase.library.repository.LibraryRepository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository libraryRepository;
	
	@GetMapping("/alllibraries")
	public List<Library> getAllLibrary()
	{
		List<Library> libraries=libraryRepository.findAll();
	

	return libraries;
	}
	@PostMapping("/addlibrary")
public void saveLibrary(Library lib)
{
		
		libraryRepository.save(lib);
		//return "Saved";
}
}
