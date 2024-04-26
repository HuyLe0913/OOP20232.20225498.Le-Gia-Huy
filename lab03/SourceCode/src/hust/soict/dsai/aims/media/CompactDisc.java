package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
	}
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	//
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
		}
		else {
			System.out.println(track + "is already in track");
		}
	}
	//
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}
		else {
			System.out.println(track + "is not in track");
		}
	}
	//
	public int getLength() {
		int sum = 0;
		for(Track t:tracks) {
			sum += t.getLength();
		}
		return sum;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for(Track t:tracks) {
			t.play();
		}
		
	}
}
