package com.usecase.library.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.library.model.Book;
import com.usecase.library.repository.BookRespository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class BookController {
	
	@Autowired
	BookRespository bookRespository;
	
	@GetMapping("/getbooks/{libId}")
	private List<Book> getBookForaLibrary(@PathVariable("libId") int libId)
	{
		List<Book> books=(List<Book>) bookRespository.findAll();
		List<Book> booksList=books.stream().filter(book->book.getLibrary().getLibId()==libId).collect(Collectors.toList());
		System.out.println("books"+booksList.size());
		//return bookRespository.findByLibraryLibId(libId);
		return booksList;
	}
	@PostMapping("/addbook")
	private List<Book> addBook(Book book)
	{
		 bookRespository.save(book);
		return  bookRespository.findAll();
	}
	@PutMapping("/updatebook/{bookId}")
	private List<Book> updateBook(Book book)
	{
		bookRespository.save(book);
		return bookRespository.findAll();
	}

}
