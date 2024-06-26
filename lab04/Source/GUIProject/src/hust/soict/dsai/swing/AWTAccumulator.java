package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends JFrame {
    private TextField tfInput;
    private TextField tfOuput;
    private int sum = 0;
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));
        add(new Label(("Enter an Integer: ")));

        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        add(new Label("The accumalated Sum is: "));
        tfOuput = new TextField(10);
        tfOuput.setEditable(false);
        add(tfOuput);

        setTitle("AWTAccumulator");
        setSize(350, 120);
        setVisible(true);
    }

public static void main(String[] args) {
        new AWTAccumulator();
}
private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOuput.setText(sum + "");
        }
}

}
