import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton b1,b2,b3,b4,b5,b6;

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    public Home() {
        super("Home");
        setBounds(400, 20, 800, 800);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JMenuBar menuBar = new JMenuBar(); // form menu bar
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.BLACK);
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit"); // form the menu(items visible in the menu bar)
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnExit.setForeground(Color.WHITE);


        JMenuItem mntmLogout = new JMenuItem("Logout");// items in the respective menu
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);// ActionListener needed for the menu items as after clicking the menu items we need an event to occur
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 105, 105));
        mntmExit.setBackground(new Color(211, 211, 211));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);



        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnHelp.setForeground(Color.WHITE);


//        JMenuItem mntmReadme = new JMenuItem("Read Me");
//        mntmReadme.setBackground(new Color(211, 211, 211));
//        mntmReadme.setForeground(new Color(105, 105, 105));
//        mnHelp.add(mntmReadme);

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setForeground(new Color(105, 105, 105));
        mntmAboutUs.setBackground(new Color(211, 211, 211));
        mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnRecord = new JMenu("Record");
        mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnRecord.setForeground(Color.WHITE);


        JMenuItem bookdetails = new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        mnRecord.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        mnRecord.add(studentdetails);

        menuBar.add(mnRecord);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);


        JLabel l1 = new JLabel("Library Management System");
        l1.setForeground(new Color(204, 51, 102));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        l1.setBounds(200, 30, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);//getImage returns object of Image class .for adding image we create a panel and put the image in the panel and then add the panel
        ImageIcon i3 = new ImageIcon(i2); // put the Image object in the ImageIcon class
        l2 = new JLabel(i3);//put the ImageIcon class object in the label
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);//add the label in the pane

        JLabel l3 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/third.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(300, 160, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 140, 225, 152);
        contentPane.add(l4);

        b1 = new JButton("Add Books");
        b1.addActionListener(this);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLUE);
        b1.setBounds(60, 320, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLUE);
        b2.setBounds(313, 320, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.BLUE);
        b3.setBounds(562, 320, 167, 44);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "OPERATION", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(20, 120, 750, 260);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        b4 = new JButton("Issue Book");
        b4.addActionListener(this);
        b4.setBackground(Color.PINK);
        b4.setForeground(Color.BLUE);
        b4.setBounds(76, 620, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBackground(Color.PINK);
        b5.setForeground(Color.BLUE);
        b5.setBounds(310, 620, 159, 41);
        contentPane.add(b5);

        b6 = new JButton("About Us");
        b6.addActionListener(this);
        b6.setBackground(Color.PINK);
        b6.setForeground(Color.BLUE);
        b6.setBounds(562, 620, 159, 41);
        contentPane.add(b6);

        JLabel l5 = new JLabel("");
        ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("icons/fifth.png"));
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.png"));
        Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(332, 440, 139, 152);
        contentPane.add(l6);

        JLabel l7 = new JLabel("");
        ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.png"));
        Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(562, 440, 157, 152);
        contentPane.add(l7);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "ACTION", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(233, 150, 122)));
        panel2.setBounds(20, 420, 750, 270);
        panel2.setBackground(Color.WHITE);
        contentPane.add(panel2);

        getContentPane().setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
    }


    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand(); // returns in string which menu item is clicked
        if(msg.equals("Logout")){
            setVisible(false);
            new Login_user().setVisible(true);
        }else if(msg.equals("Exit")){
            System.exit(ABORT);

        }
//        else if(msg.equals("Read Me")){
//            setVisible(false);
//            new aboutUs().setVisible(true);
//        }
        else if(msg.equals("About Us")){
            setVisible(false);
            new aboutUs().setVisible(true);

        }else if(msg.equals("Book Details")){
            setVisible(false);
            new BookDetails().setVisible(true);
        }else if(msg.equals("Student Details")){
            setVisible(false);
            new StudentDetails().setVisible(true);

        }

        if(ae.getSource() == b1){ // getSource returns which button is clicked
            this.setVisible(false);
            new AddBook().setVisible(true);
        }
        if(ae.getSource() == b2){
            this.setVisible(false);
            new Statistics().setVisible(true);
        }
        if(ae.getSource() == b3){
            this.setVisible(false);
            new AddStudent().setVisible(true);
        }
        if(ae.getSource() == b4){
            this.setVisible(false);
            new IssueBook().setVisible(true);
        }
        if(ae.getSource() == b5){
            this.setVisible(false);
            new ReturnBook().setVisible(true);

        }
        if(ae.getSource() == b6){
            this.setVisible(false);
            new aboutUs().setVisible(true);

        }

    }
}
