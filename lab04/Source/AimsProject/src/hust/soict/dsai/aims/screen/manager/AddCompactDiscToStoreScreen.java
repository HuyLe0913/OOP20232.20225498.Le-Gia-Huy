package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
    public static JPanel addCD(ArrayList<Media> mediaInStore){
        JPanel center = new JPanel();
        JButton addButton = new JButton("Add CD");
        addButton.setSize(100,100);
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mediaInStore.add(new CompactDisc(title.getText(), Integer.parseInt(length.getText()), director.getText(), artist.getText() ));
            }
        }

        );

        JPanel button  = new JPanel();
        button.add(addButton);

        center.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.add(Box.createVerticalGlue());
        center.add(Box.createHorizontalGlue());

        center.add(new JLabel("Title"));
        center.add(title);
        center.add(new JLabel("Length"));
        center.add(length);
        center.add(new JLabel("Director"));
        center.add(director);
        center.add(new JLabel("Artist"));
        center.add(artist);

        center.add(addButton);
        return center;
    }
}
