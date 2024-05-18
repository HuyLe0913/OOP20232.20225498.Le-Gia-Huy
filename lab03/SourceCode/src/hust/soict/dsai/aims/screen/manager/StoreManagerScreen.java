package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.store.Store;

public class StoreManagerScreen extends JFrame{
	private Store store;
	static ArrayList<Media> mediaInStore;
	
	public void addCDMouseClicked(java.awt.event.MouseEvent evt) {
	    System.out.println("Mouse clicked on addCD");
	    // Add your logic here
	}
	public void addDVDMouseClicked(java.awt.event.MouseEvent evt) {
		
	}
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        menu.add(new JMenuItem("View store"));
        JMenuItem addBook = new JMenuItem("Add Book");
        JMenuItem addCD = new JMenuItem("Add CD");
        JMenuItem addDVD = new JMenuItem("Add DVD");
        
        
        
        
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);
        menu.add(smUpdateStore);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }
	
	JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;

    };

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        
        for(int i = 0; i < mediaInStore.size(); i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    }
    
    public StoreManagerScreen(Store store) {
    	this.store = store;
    	
    	Container cp = getContentPane();
    	cp.setLayout(new BorderLayout());
    	cp.add(createNorth(), BorderLayout.NORTH);
    	cp.add(createCenter(), BorderLayout.CENTER);
    	
    	setTitle("Store");
    	setSize(1024, 768);
    	setLocationRelativeTo(null);
    	setVisible(true);
    	
    }
    public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		store.addMedia(dvd3);
		store.removeMedia(dvd3);
		mediaInStore = store.getItemsInStore();
		
		StoreManagerScreen sc = new StoreManagerScreen(store);
	}
}
