package com.java.techie.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;



class Book {
	String bname;
	double bprice;
	double bpages;
	double nbooks;

	public Book(String bname, double bprice, double bpages, double nbooks) {
		super();
		this.bname = bname;
		this.bprice = bprice;
		this.bpages = bpages;
		this.nbooks = nbooks;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + ", bprice=" + bprice + ", bpages=" + bpages + ", nbooks=" + nbooks + "]";
	}

}

public class CollectorExample {
	public static void main(String[] args) {
		Book book = new Book("codejava", 200, 3000, 5);
		Book book1 = new Book("AdvanceJava", 300, 4000, 10);
		Book book2 = new Book("Springboot", 400, 6000, 4);
		Book book3 = new Book("JavaScript", 100, 1000, 40);

		ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(book, book1, book2, book3));
        Double bpage = books.stream().collect(Collectors.summingDouble(s->s.bpages));
        System.out.println(bpage);
        
        Double bprice = books.stream().collect(Collectors.summingDouble(s->s.bprice));
        System.out.println(bpage);
		
	}
}
