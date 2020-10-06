package App;

import App.Student.StudentSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

//import com.com.sea.SeaGlassLookAndFeel.*;

public class App implements ActionListener {

    private int HEIGHT = 500;
    private int WIDTH = 500;
    private JPanel sigInPanel = new JPanel();
    private JPanel studentPanel = new JPanel();
    private JPanel pressPanel = new JPanel();
    private JPanel profPanel = new JPanel();
    private JFrame frame = new JFrame();
    
    public App(){}
    
    public void lookFeel(){
    }
    
    public void logIn(){
        lookFeel();
        
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(sigInPanel);
        
        sigInPanel.setLayout(null);
        
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(75,75,80,25);
        sigInPanel.add(userLabel);
        
        JTextField username = new JTextField("");
        username.setBounds(175,75,200,40);
        sigInPanel.add(username);
        
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(75, 175, 80, 25);
        sigInPanel.add(passLabel);
        
        JPasswordField password = new JPasswordField("");
        password.setBounds(175, 175, 200, 40);
        sigInPanel.add(password);
        
        JButton sigInButton = new JButton("Sign in");
        sigInButton.setBounds(200, 250, 150, 40);
        sigInButton.addActionListener(new App());
        sigInPanel.add(sigInButton);
        
        JButton resetButton = new JButton("Reset Password");
        resetButton.setBounds(200, 300, 150, 40);
        resetButton.addActionListener(new App());
        sigInPanel.add(resetButton);
        
        JLabel test = new JLabel("");
        test.setBounds(200, 400, 100, 40);
        

        frame.setVisible(true);
    }
    

    
    public void changePanel(JPanel remove, JPanel add){
        this.frame.remove(remove);
        this.frame.setContentPane(add);
        this.frame.dispose();
        this.frame.validate();
        this.frame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Sign in")){
            System.out.println("Testing Sign in button works");
            this.frame.setVisible(false);
            new StudentSwing();
        } else if(e.getActionCommand().equals("Reset Password")){
            System.out.println("Testing reset button works");
        }
            
    }
}
