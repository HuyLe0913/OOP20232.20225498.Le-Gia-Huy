package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAccumulator extends JFrame{
    private JTextField tfInput;
    private JTextField tfOuput;
    private int sum = 0;

    public SwingAccumulator() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2));
        cp.add(new Label("Enter an integer; "));

        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());
        cp.add(new Label("The Accumulated sum is: "));
        tfOuput = new JTextField(10);
        tfOuput.setEditable(false);
        cp.add(tfOuput);

        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SwingAccumulator();
    }
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numberIn = Integer.parseInt((tfInput.getText()));
            sum += numberIn;
            tfInput.setText("");
            tfOuput.setText(sum + "");
        }
    }
}
