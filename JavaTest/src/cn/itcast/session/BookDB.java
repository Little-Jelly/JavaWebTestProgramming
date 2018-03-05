package cn.itcast.session;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
	private static Map<String, Book> books = new LinkedHashMap<String, Book>();
	static{
		books.put("1", new Book("1", "javaweb����"));
		books.put("2", new Book("2", "jdbc����"));
		books.put("3", new Book("3", "java����"));
		books.put("4", new Book("4", "struts����"));
		books.put("5", new Book("5", "spring����"));
	}
	public static Collection<Book> getAll(){
		return books.values();
	}
	public static Book getBook(String id){
		return books.get(id);
	}
}
