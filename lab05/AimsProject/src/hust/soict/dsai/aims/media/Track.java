package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
	public Track(int length, String title) {
		super();
		this.length = length;
		this.title = title;
	}
	private int length;
	private String title;
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public void play() throws PlayerException {
		if(this.getLength()>0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		else{
			System.err.println("ERROR: DVD length is non-positive");
			throw new PlayerException("ERROR: DVD length is non-positive");
		}
	}
	@Override
	public boolean equals(Object o) {
		
		if((o==null) || (getClass()!= o.getClass())) {
			return false;
		}
		else {
			Track other = (Track) o;
			return title.equals(other.getTitle()) && length == other.getLength();
		}
	}
}
