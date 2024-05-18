package hust.soict.dsai.aims.screen.manager;

import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel{
	private Media media;
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN,15));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		
		JLabel cost = new JLabel("" + media.getCost() + "$");
		cost.setAlignmentX(CENTER_ALIGNMENT);

		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));

		if(media instanceof Playable) {
			JFrame dialog = new JFrame();
			dialog.setSize(500,200);
			dialog.setLocationRelativeTo(null);
			JPanel infomation = new JPanel();
			infomation.add(new JLabel("<html>" + media.toString() + "</html>"));
			dialog.add(infomation);
			JButton playButton = new JButton("Play");
			playButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dialog.setVisible(true);
				}
			});
			container.add(playButton);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createHorizontalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

}
