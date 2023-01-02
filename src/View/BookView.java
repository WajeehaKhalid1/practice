package View;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import model.Book;

public class BookView implements Observer{
	private Scanner scan;
	public BookView(){
		scan = new Scanner(System.in);
	}
	@Override
	public void update(Observable o, Object arg) {
		Book book = (Book) o;
		printBookInfo(book);
	}
	
	private void printBookInfo(Book book){
		System.out.println("Book: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Price: " + book.getPrice());
		System.out.println("Weight: " + book.getWeight());
	}

	public double editbookPrice()
	{
		System.out.println("Write new price: ");
		return scan.nextDouble();
	}
}
