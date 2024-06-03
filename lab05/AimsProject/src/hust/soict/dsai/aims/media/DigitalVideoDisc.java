package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}
	private String director;
	private int length;

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	@Override
	public void play() throws PlayerException {

		if(super.getLength()>0) {
			System.out.println("Playing DVD: " + super.getTitle());
			System.out.println("DVD length: " + super.getLength());
		}
		else {
			System.err.println("ERROR: DVD length is non-positive");
			throw new PlayerException("ERROR: DVD length is non-positive");
		}
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
}
