package hust.soict.dsai.aims.media;

public class Disc extends Media{
	
	public Disc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
	}
	public Disc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public Disc(String title) {
		super();
		this.setTitle(title);
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}
	private int length;
	private String director;
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public String toString() {
		String info[] = {"Title: " + getTitle(),"Category: " + getCategory(),"Director: " + getDirector(),"Length: " + getLength(),"Cost: " + getCost()} ;
		StringBuilder str = new StringBuilder();
		for(String i : info) {
			str.append(i);
			str.append("\n");
		}
		return str.toString();
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}

}
