package hust.soict.dsai.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	ArrayList<Media> itemsInStore = new ArrayList<Media>();
	//
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	//
	public void removeMedia(Media media) {
		itemsInStore.remove(media);
	}

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
}
