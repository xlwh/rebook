package com.zhang.service.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhang.beans.Book;

public class BookService {
	private static Map<Integer,Book> books = new HashMap<Integer,Book>();
	
	static{
		books.put(1, new Book(1,"大学英语","张老师"));
		books.put(2, new Book(2,"高等数学","李老师"));
	}
	
	public List<Book> getAll(){
		return new ArrayList<Book>(books.values());
	}
}
