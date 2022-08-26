package org.tns.c2tc;

import java.util.Scanner;

import org.tns.c2tc.entities.Book;
import org.tns.c2tc.service.BookService;
import org.tns.c2tc.service.BookServiceImpl;

public class Client {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		BookService service = new BookServiceImpl();
		
		System.out.println("Enter the uid");
		int id=scanner.nextInt();
		System.out.println("Enter the book title");
		String title=scanner.next();
		System.out.println("Enter the author name");
		String author=scanner.next();
		System.out.println("Enter the price");
		double  price=scanner.nextDouble();
		Book book=new Book(id, title, author, price);
		service.addBook(book);
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Boo with ID 106:"+service.getBookById(105));
		
		System.out.println("************Listing All books*************");
		for(Book book1:service.getAllBooks()) {
			System.out.println(book1);
		}
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book1:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(book1);
		}
		
		System.out.println("************Listing book on Android*************");
		for(Book book1:service.getBookByTitle("Android")) {
			System.out.println(book1);
		}
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book1:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(book1);
		}
	}
}
