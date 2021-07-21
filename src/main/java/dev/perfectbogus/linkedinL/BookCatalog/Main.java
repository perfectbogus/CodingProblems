package dev.perfectbogus.linkedinL.BookCatalog;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		bc.printAllBooks();

		// TODO: there is an error collection after convert the price of the book
		//get price of book called Tom Jones in EUR
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

		bc.printAllBooks();
	}
}
