package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		Scanner scan = new Scanner(System.in);
		char ch = 'y';
		while(ch=='y') {
			System.out.println("***************************");
			System.out.println("\tBook Management System");
			System.out.println("1. Add a Book");
			System.out.println("2. Update a Book");
			System.out.println("3. Remove a Book");
			System.out.println("4. Fetch all Books");
			System.out.println("5. Exit");
			System.out.println("****************************");
			System.out.println("Please enter a menu option : ");
			int option = scan.nextInt();
			scan.nextLine();
			System.out.println("****************************");

			switch (option) {
			case 1:
				BookPojo book1 = new BookPojo();
				System.out.println("Enter book title :");
				book1.setBookTitle(scan.nextLine());
				System.out.println("Enter book author :");
				book1.setBookAuthor(scan.nextLine());
				System.out.println("Enter book genre :");
				book1.setBookGenre(scan.nextLine());
				System.out.println("Enter book cost :");
				book1.setBookCost(scan.nextInt());
				BookPojo newBook = bookService.addBook(book1);
				System.out.println("Book added!!\n your book id is : "+ newBook.getBookId());
				break;
			case 2:
				System.out.println("Enter BookId that you want to update?");
				int UpdateBookId= scan.nextInt();	
				BookPojo updatedBook = bookService.fetchBook(UpdateBookId);
				if(updatedBook == null) {
					System.out.println("This Book ID does not exist!!!");
					break;
				}
				System.out.println("****************************************");
				System.out.println("Book ID :"+ updatedBook.getBookId());
				System.out.println("Book Title :"+ updatedBook.getBookTitle());
				System.out.println("Book Author :"+ updatedBook.getBookAuthor());
				System.out.println("Book Genre :"+ updatedBook.getBookGenre());
				System.out.println("Book Cost :"+ updatedBook.getBookCost());
				System.out.println("*****************************************");
				System.out.println("Please enter the new cost");
				updatedBook.setBookCost(scan.nextInt());
				bookService.updateBook(updatedBook);
				System.out.println("Book Updated");
			
				break;
			case 3:
				System.out.println("Enter BookId");
				int bookId= scan.nextInt();	
				BookPojo delBook = bookService.fetchBook(bookId);
				if(delBook == null) {
					System.out.println("This Book ID does not exist!!!");
					break;
				}
				System.out.println("****************************************");
				System.out.println("Book ID :"+ delBook.getBookId());
				System.out.println("Book Title :"+ delBook.getBookTitle());
				System.out.println("Book Author :"+ delBook.getBookAuthor());
				System.out.println("Book Genre :"+ delBook.getBookGenre());
				System.out.println("Book Cost :"+ delBook.getBookCost());
				System.out.println("Are you sure you want to DELETE??? (y/n) ");
				char delOption = scan.next().charAt(0);
				System.out.println("*****************************3");
				if(delOption == 'y') {
					bookService.deleteBook(bookId);
					System.out.println("Book Removed Successfully!!");
				}
				break;
			case 4:
				List<BookPojo> allBooks = bookService.fetchAllBooks();
				Iterator<BookPojo> itr = allBooks.iterator();
				System.out.println("*******************************************");
				System.out.println("Book Title\tAuthor\tID\tGenre\tCost");
				System.out.println("*******************************************");
				while (itr.hasNext()) {
				BookPojo book = itr.next();
				System.out.println(book.getBookTitle() + "\t" + book.getBookAuthor() + "\t" + book.getBookId() + "\t"
						+ book.getBookGenre() + "\t" + book.getBookCost());
				}
				break;
			case 5:
				System.exit(0);

			}
			System.out.println("Do you want to continue(y/n) : ");
			ch = scan.next().charAt(0);
		}

		
	}

}
