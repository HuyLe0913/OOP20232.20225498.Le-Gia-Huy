package hust.soict.dsai.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	//
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore.add(disc);
	}
	//
	public void removeDVD(DigitalVideoDisc disc) {
		itemsInStore.remove(disc);
	}
}
