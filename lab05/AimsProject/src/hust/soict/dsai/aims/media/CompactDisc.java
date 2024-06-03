package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String director;
	private int length;
	private String title;
	public CompactDisc(String title, int length, String director, String artist, ArrayList<Track> tracks) {
		super();
		this.artist = artist;
		this.tracks = tracks;
		this.director = director;
		this.length = length;
		this.title = title;

	}
	public CompactDisc(String title, int length, String director, String artist) {
		super();
		this.artist = artist;
		this.title = title;
		this.director = director;
		this.length = length;

	}

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
	public void play() throws PlayerException {

		for(Track t:tracks) {
			if(t.getLength() > 0) {
				try{
					t.play();
				}catch(PlayerException e) {
					throw e;
				}

			}
			else {
				System.err.println("ERROR: DVD length is non-positive");
				throw new PlayerException("ERROR: DVD length is non-positive");
			}
		}
		
	}
}
