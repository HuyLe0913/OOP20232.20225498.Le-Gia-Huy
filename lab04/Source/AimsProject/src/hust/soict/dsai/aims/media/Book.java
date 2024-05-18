package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>(); 
	public Book(int id, String title, String category, float cost) {
		super();
		this.setId(id);
		this.setTitle(title);
		this.setCategory(category);
		
		this.setCost(cost);
	}
	public Book(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public Book(String title) {
		super();
		this.setTitle(title);
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
		
	}
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}
	public String toString() {
		String info[] = {"Id: " + getId(),"Title: " + getTitle(),"Category: " + getCategory(),"Cost: " + getCost()} ;
		StringBuilder str = new StringBuilder();
		for(String i : info) {
			str.append(i);
			str.append("\n");
		}
		return str.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
