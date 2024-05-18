package hust.soict.dsai.aims.media;

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
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
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
