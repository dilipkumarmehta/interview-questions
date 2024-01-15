package com.java.techie.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.dilip.stream.Person;

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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public double getBpages() {
		return bpages;
	}

	public void setBpages(double bpages) {
		this.bpages = bpages;
	}

	public double getNbooks() {
		return nbooks;
	}

	public void setNbooks(double nbooks) {
		this.nbooks = nbooks;
	}

}

public class CollectorExample {
	public static void main(String[] args) {
		Book book = new Book("codejava", 200, 3000, 5);
		Book book1 = new Book("AdvanceJava", 300, 4000, 10);
		Book book2 = new Book("jock", 400, 6000, 4);
		Book book3 = new Book("JavaScript", 100, 1000, 40);
		Book book4 = new Book("spring", 50, 300, 5);
		Book book5 = new Book("story", 30, 500, 10);
		Book book6 = new Book("story", 40, 600, 4);
		Book book7 = new Book("jock", 10, 160, 40);
		ArrayList<Book> books = new ArrayList<Book>(
				Arrays.asList(book, book1, book2, book3, book4, book5, book6, book7));

		Optional<Book> max = books.stream().max(Comparator.comparing(Book::getBname));

		// Double bpage = books.stream().collect(Collectors.summingDouble(s->s.bpages));
		// System.out.println(bpage);
		// Double bprice =
		// books.stream().collect(Collectors.summingDouble(s->s.bprice));
		// System.out.println(bpage);
		Stream<Book> filter = books.stream().filter(name -> name.bname.equals("jock"));
		filter.forEach(System.out::println);
		// Stream<String> map = filter.map(name -> name.bname);
		// map.forEach(System.out::println);

	}

	public static List<Book> getBookList() {
		Book book = new Book("codejava", 200, 3000, 5);
		Book book1 = new Book("AdvanceJava", 300, 4000, 10);
		Book book2 = new Book("jock", 400, 6000, 4);
		Book book3 = new Book("JavaScript", 100, 1000, 40);
		Book book4 = new Book("spring", 50, 300, 5);
		Book book5 = new Book("story", 30, 500, 10);
		Book book6 = new Book("story", 40, 600, 4);
		Book book7 = new Book("jock", 10, 160, 40);
		ArrayList<Book> books = new ArrayList<Book>(
				Arrays.asList(book, book1, book2, book3, book4, book5, book6, book7));

		return books;

	}
}
