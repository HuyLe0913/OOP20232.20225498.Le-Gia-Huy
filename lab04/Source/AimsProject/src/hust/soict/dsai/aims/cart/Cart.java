package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	//
	public float totalCost(boolean print) {
		float totalCost=0;
		int count = 1;
		for(Media m:itemsOrdered) {
			
				if(print) {
				System.out.println(count + "   " + m.getTitle() + "   " + m.getCost());
				}
				count += 1;
				totalCost += m.getCost();
			
		
		}
		
		return totalCost;
		
	}
	//
	public void addMedia(Media m) {
		if(!itemsOrdered.contains(m)) {
			itemsOrdered.add(m);
		}
		else {
			System.out.println("item already in your cart.");
		}
	}
	//
	public void removeMedia(Media m) {
		if(itemsOrdered.contains(m)) {
			itemsOrdered.remove(m);
		}
		else {
			System.out.println("can't find item in your cart.");
		}
	}
	//
	public void print(Comparator<Media> c) {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		int id = 0;
		Collections.sort(itemsOrdered, c);
		for(Media m: itemsOrdered) {
			id+=1;
			
			System.out.println(id + ".DVD - " + m.getTitle() + " - " + m.getCategory() + " - " + m.getDirector() + " - " + m.getLength() + ":"  +  m.getCost() + " $");
		}
		System.out.println("Total cost: " + totalCost(false));
		System.out.println("**************************************************");
	}
	//
	public void search(String title) {
		int id =0;
		System.out.println("***********************CART***********************");
		System.out.println("Searching result:");
		for(Media m : itemsOrdered) {
			id += 1;
			if(m.getTitle() == title) {
				System.out.println(id + ".DVD - " + m.getTitle() + " - " + m.getCategory() + " - " + m.getDirector() + " - " + m.getLength() + ":"  +  m.getCost() + " $");
			}
		}
		
		System.out.println("**************************************************");
	}
	//
	public void search(int id) {
		System.out.println("***********************CART***********************");
		System.out.println("Searching result:");
		int i = id-1;
		System.out.println(id + ".DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - " + itemsOrdered.get(i).getDirector() + " - " + itemsOrdered.get(i).getLength() + ":"  +  itemsOrdered.get(i).getCost() + " $");
			
		
		
		System.out.println("**************************************************");
	}
	//
	
}
