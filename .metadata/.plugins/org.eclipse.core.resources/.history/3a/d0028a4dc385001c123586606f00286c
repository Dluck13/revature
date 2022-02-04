package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookDaoImpi implements BookDao {
	
	List<BookPojo> allBooks;

	public BookDaoImpi() {
		allBooks = new ArrayList<BookPojo>();
		allBooks.add(new BookPojo(100, "Harry Potter1", "JK", "Fiction", 40, ""));
		allBooks.add(new BookPojo(101, "Harry Potter2", "JK", "Fiction", 45, ""));
		allBooks.add(new BookPojo(102, "Harry Potter3", "JK", "Fiction", 50, ""));
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return allBooks;
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
	int newBookId = allBooks.get(allBooks.size()-1).getBookId()+1;
	bookPojo.setBookId(newBookId);
	allBooks.add(bookPojo);
	return bookPojo;
	
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo deleteBook(int bookId) {
		BookPojo returnBookPojo = null;
		for(int i=0; i<allBooks.size(); i++) {
			if(allBooks.get(i).getBookId() == bookId) {
				returnBookPojo = allBooks.get(i);
				allBooks.remove(i);
				
			}
		}
		return returnBookPojo;
	}

}
