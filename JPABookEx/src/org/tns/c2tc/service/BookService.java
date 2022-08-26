package org.tns.c2tc.service;

import java.util.List;

import org.tns.c2tc.entities.Book;

public interface BookService {

	String getBookCount();

	String getBookById(int i);

	List<Book> getAllBooks();

	List<Book> getAuthorBooks(String string);

	List<Book> getBookByTitle(String string);

	List<Book> getBooksInPriceRange(int i, int j);

	void addBook(Book book);

}
