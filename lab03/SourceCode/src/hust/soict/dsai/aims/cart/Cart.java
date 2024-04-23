package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	//
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int count = 1;
		if(qtyOrdered < MAX_NUMBER_ORDERED ) {
			for(int i=0;i<MAX_NUMBER_ORDERED;i++) {
				if(itemsOrdered[i]==null) {
					itemsOrdered[i] = disc;
					qtyOrdered+=1;
					System.out.println("The disc " + disc.getTitle() +" has been added");
					System.out.println("Your cart:");
					for(int j=0;j<MAX_NUMBER_ORDERED;j++) {
						if(itemsOrdered[j]!=null) {
							System.out.println(count + "   " + itemsOrdered[j].getTitle() + "   " + itemsOrdered[j].getCost());
							count += 1;
							
						}
					}
					System.out.println("-----------------------------------------");
					break;
				}
			}
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	//
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		for(int i=0; i<dvdList.length; i++) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	//
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	//
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int count = 1;
		for(int i=0;i<MAX_NUMBER_ORDERED;i++) {
			if(itemsOrdered[i]==disc) {
				System.out.println("You just removed " + disc.getTitle());
				itemsOrdered[i] = null;
				qtyOrdered-=1;
				System.out.println("Your cart:");
				for(int j=0;j<MAX_NUMBER_ORDERED;j++) {
					if(itemsOrdered[j]!=null) {
						System.out.println(count + "   " + itemsOrdered[j].getTitle() + "   " + itemsOrdered[j].getCost());
						count += 1;
						
					}
				}
				System.out.println("-----------------------------------------");
				break;
			}
		}
	}
	//
	public float totalCost() {
		float totalCost=0;
		int count = 1;
		for(int i=0;i<MAX_NUMBER_ORDERED;i++) {
			if(itemsOrdered[i]!=null) {
				System.out.println(count + "   " + itemsOrdered[i].getTitle() + "   " + itemsOrdered[i].getCost());
				count += 1;
				totalCost += itemsOrdered[i].getCost();
			}
		
		}
		
		return totalCost;
		
	}
	//
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int i = 0; i <= qtyOrdered; i++) {
			System.out.println(i + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ":"  +  itemsOrdered[i].getCost() + " $");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}
	//
	public void search(String title) {
		System.out.println("***********************CART***********************");
		System.out.println("Searching result:");
		for(int i = 0; i <= qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle() == title) {
				System.out.println(i + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ":"  +  itemsOrdered[i].getCost() + " $");
			}
		}
		
		System.out.println("**************************************************");
	}
	//
	public void search(int id) {
		System.out.println("***********************CART***********************");
		System.out.println("Searching result:");
		int i = id;
		System.out.println(i + ".DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ":"  +  itemsOrdered[i].getCost() + " $");
			
		
		
		System.out.println("**************************************************");
	}
	//
}
