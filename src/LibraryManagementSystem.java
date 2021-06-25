import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystem extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1;

    public LibraryManagementSystem() {
        super("Build 939");
        setSize(1280,720); // like setContentPane(300,300,1366,390) to set size of frame (1366,390)part of setContentPane
        setLayout(null);
        setLocation(50,50);// like setContentPane(300,300,1366,390) to set size of frame (300,300)part of setContentPane

        l1 = new JLabel("");
        b1 = new JButton("Next");

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);



        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1280, 720,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        b1.setBounds(1000,600,200,60);
        l1.setBounds(0, 0, 1280, 720);

        l1.add(b1);
        add(l1);// b1 button added above l1

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        new Login_user().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        LibraryManagementSystem window = new LibraryManagementSystem();
        window.setVisible(true);
    }
}

