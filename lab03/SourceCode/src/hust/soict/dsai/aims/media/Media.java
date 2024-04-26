package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media{
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	private int id; 
	private String title;
	private String category;
	private float cost;
	private String director;
	private int length;
	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public boolean equals(Object o) {
		
		if((o==null) || (getClass()!= o.getClass())) {
			return false;
		}
		else {
			Media other = (Media) o;
			return title.equals(other.getTitle());
		}
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
