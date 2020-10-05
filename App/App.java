package App;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {

    private static int HEIGHT = 500;
    private static int WIDTH = 500;
    
    public App(){}
    
    public void logIn(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(75,75,80,25);
        panel.add(userLabel);
        
        JTextField username = new JTextField("");
        username.setBounds(175,75,200,40);
        panel.add(username);
        
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(75, 175, 80, 25);
        panel.add(passLabel);
        
        JTextField password = new JTextField("");
        password.setBounds(175, 175, 200, 40);
        panel.add(password);
        
        JButton sigInButton = new JButton("Sign in");
        sigInButton.setBounds(200, 250, 100, 40);
        panel.add(sigInButton);
        
        frame.setVisible(true);
    }
}
