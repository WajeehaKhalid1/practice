package controller;

import View.BookView;
import model.Book;

public class Controller {
	private Book model;
	private BookView view;
	
	public Controller(Book model, BookView view)
	{
		this.model=model;
		this.view=view;
	}
	public void listen()
	{
		double newprice=-1;
		do {
			newprice = view.editbookPrice();
			model.setPrice(newprice);
		}while(newprice >= 0);
	}
}