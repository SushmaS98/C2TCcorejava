package org.tns.c2tc.repo;

import java.util.List;

import org.tns.c2tc.entities.Book;

public interface BookRepo {

	String getStudnet(int id);

	String getTotalCount();

	List<Book> getBook();

	List<Book> getBookbetweenPrice(int i, int j);

	void getTransaction();

	void endTransaction();

	void addBook(Book book);

}
