package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import javax.naming.LimitExceededException;

public class Aims {

	public static void main(String[] args) throws LimitExceededException {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addMedia(dvd3);
		
		System.out.println("Your cart:");
		System.out.println("Total cost is: " + anOrder.totalCost(true));
		System.out.println("-----------------------------------------");
		anOrder.removeMedia(dvd1);

	}

}
