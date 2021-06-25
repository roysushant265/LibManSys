import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Loading extends JFrame implements Runnable{
    private JPanel contentPane;
    private JProgressBar progressBar;
    Connection conn;
    int s;
    Thread th;

    public static void main(String[] args) {
        new Loading().setVisible(true);
    }

    public void setUploading() {
        th.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    i = 201;
                    setVisible(false);
                    new Home().setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading() { // All coding for frame is done in constructor

            super("Loading"); // For Heading of the Loader frame
            th = new Thread((Runnable) this);

            setBounds(600, 300, 600, 400);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("Library Management System Build 939");
            lbllibraryManagement.setForeground(Color.BLACK);
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            lbllibraryManagement.setBounds(100, 60, 500, 35);
            contentPane.add(lbllibraryManagement);

            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground(Color.BLACK);
            lblNewLabel_2.setBounds(220, 200, 150, 20);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.MAGENTA);
            panel.setBounds(0, 0, 590, 390);
            contentPane.add(panel);

            setUploading();
    }
}
