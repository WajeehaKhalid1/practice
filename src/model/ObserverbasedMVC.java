package model;

import View.BookView;
import controller.Controller;

public class ObserverbasedMVC {

	public static void main(String[] args) {
		Book model = new Book("PF", "DS-MALIK",10000,2);
		BookView view = new BookView();
		model.addObserver(view);
		Controller con = new Controller(model,view);
		con.listen();
	}
}
