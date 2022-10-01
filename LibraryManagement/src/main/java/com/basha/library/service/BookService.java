package com.basha.library.service;

import java.util.List;

import com.basha.library.entity.Book;

public interface BookService {
	public List<Book> findAll();

	public Book findById(int theId);

	public void save(Book theBook);

	public void deleteById(int theId);

	public List<Book> searchBy(String name, String author);

}
