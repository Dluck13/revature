package service;

import java.util.List;

import pojo.BookPojo;

public interface BookService {
	
	//read
		List<BookPojo> fetchAllBooks();
		//create				
		BookPojo addBook(BookPojo bookPojo);
		//update
		BookPojo updateBook(BookPojo bookPojo);
		//delete
		BookPojo deleteBook(int bookId);
		// get one book
		BookPojo fetchBook(int bookId);

}
