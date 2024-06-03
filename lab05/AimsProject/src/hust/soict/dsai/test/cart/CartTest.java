package hust.soict.dsai.test.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

import javax.naming.LimitExceededException;

public class CartTest {
	public static void main(String[] args) throws LimitExceededException {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		cart.addMedia(dvd3);
		
		
		//
		ArrayList<Media> media = new ArrayList<Media>();
		Disc cd = new Disc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		Book book = new Book("Star Wars","Science Fiction", 24.95f);
		media.add(dvd1);
		media.add(cd);
		media.add(book);
		for(Media m : media) {
			System.out.println(m.toString());
		}
	}
}
