package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		int diff = (int)(o1.getCost()) - (int)(o2.getCost());
		if(!(diff == 0)) {
			return diff;
		}
		else {
			return (o1.getTitle()).compareTo(o2.getTitle());
		}
	}

}
