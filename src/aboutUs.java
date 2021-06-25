import javax.swing.*;
import java.awt.*;

public class aboutUs extends JFrame{
    private JPanel contentPane;

    public static void main(String[] args) {
        new aboutUs().setVisible(true);
    }

    public aboutUs() {

        super("About Us - Developer");
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 500);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("");
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(500, 40, 100, 100);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Library");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(160, 40, 150, 55);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Management System");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Build939");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l5.setBounds(185, 140, 100, 21);
        contentPane.add(l5);


        JLabel l6 = new JLabel("Developed By : XYZ");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l6.setBounds(70, 198, 600, 35);
        contentPane.add(l6);

        JLabel l7 = new JLabel("Contact Us : XYZ@gmail.com");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(70, 260, 600, 34);
        contentPane.add(l7);

        JLabel l8 = new JLabel("This is a Library Management Software");
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l8.setBounds(70, 290, 600, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel("Made with the help of Java Swing and MYSQL");
        l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
        l9.setBounds(70, 320, 600, 34);
        contentPane.add(l9);


        JLabel l10 = new JLabel("Thank You");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
        l10.setBounds(70, 400, 600, 34);
        contentPane.add(l10);


        contentPane.setBackground(Color.YELLOW);
    }
}
