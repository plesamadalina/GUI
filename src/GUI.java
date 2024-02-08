import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){

        frame = new JFrame();

        JButton button = new JButton("Click here!");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,20,30,20));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mada's GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
