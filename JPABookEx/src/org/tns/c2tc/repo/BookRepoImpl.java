package org.tns.c2tc.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.tns.c2tc.entities.Book;

public class BookRepoImpl implements BookRepo {
	
	EntityManager entityManager;
	
	public BookRepoImpl()
	{
		entityManager=Configuration.getentityManager();	
	}

	@Override
	public Book getStudnet(int id) {
		Book book=entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public Long getTotalCount() {
		String query="SELECT COUNT(s.id) FROM Student s";
		TypedQuery<Long> tquery=entityManager.createQuery(query, Long.class);
		Long count=tquery.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBook() {
		String query="SELECT s FROM Book s where s.AuthorName like : name";
		TypedQuery<Book> tquery=entityManager.createQuery(query, Book.class);
		tquery.setParameter("name","%"+AuthorName +"%");
		List<Book> book=tquery.getResultList();
		return book;
	}

	@Override
	public List<Book> getBookbetweenPrice(int i, int j) {
		String query="SELECT s FROM Book s where s.price between : low and high:";
		TypedQuery<Book> tquery=entityManager.createQuery(query, Book.class);
		tquery.setParameter("low",i);
		tquery.setParameter("high",j);
		List<Book> book=tquery.getResultList();
		return book;
	}

	@Override
	public void getTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void addBook(Book book) {
		entityManager.persist(book);			
	}
}
