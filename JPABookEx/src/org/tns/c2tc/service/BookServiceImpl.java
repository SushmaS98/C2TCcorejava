package org.tns.c2tc.service;

import java.util.List;

import org.tns.c2tc.entities.Book;
import org.tns.c2tc.repo.BookRepo;
import org.tns.c2tc.repo.BookRepoImpl;

public class BookServiceImpl implements BookService {
	
	BookRepo repo;
	public BookServiceImpl()
	{
		repo=new BookRepoImpl();
	}

	@Override
	public String getBookCount() {
		String count=repo.getTotalCount();
		return count;
	}

	@Override
	public String getBookById(int id) {
		String books=repo.getStudnet(id);
		return books;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books=repo.getBook();
		return books;
	}

	@Override
	public List<Book> getAuthorBooks(String string) {
		List<Book> books=repo.getBookbyauthor(AuthorName);
		return books;
	}

	@Override
	public List<Book> getBookByTitle(String string) {
		List<Book> book=repo.getBookbytitle(BookByTitle);
		return book;
	}
	

	@Override
	public List<Book> getBooksInPriceRange(int i, int j) {
		List<Book> book=repo.getBookbetweenPrice(i,j);
		return book;
	}

	@Override
	public void addBook(Book book) {
		repo.getTransaction();
		repo.addBook(book);
		repo.endTransaction();
		
	}
}
