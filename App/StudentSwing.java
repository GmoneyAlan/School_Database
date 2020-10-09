package App;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class StudentSwing {
    
    private int HEIGHT = 500;
    private int WIDTH = 500;
    
    private JPanel studentPanel = new JPanel();
    private JFrame frame = new JFrame();
    
    
    public StudentSwing(){
        studentView();
    }
    
    public void studentView(){
        //changePanel(sigInPanel, studentPanel);
        this.frame.setVisible(false);
        this.frame.dispose();
        
        frame.setSize(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(studentPanel);
        frame.setBackground(new Color(255, 255, 255));
        
        JMenuBar nav = new JMenuBar();
        
        JMenu home = new JMenu("Home");
        JMenu classes = new JMenu("Classes");
        JMenu grades = new JMenu("Grades");
        JMenu profile = new JMenu("Profile");
        JMenu chat = new JMenu("Chat");
        
        nav.add(home);
        nav.add(classes);
        nav.add(grades);
        nav.add(grades);
        nav.add(profile);
        nav.add(chat);
        
        this.frame.setJMenuBar(nav);
        
        this.frame.setVisible(true);
    }
    
    public void home(){
        JLabel classes = new JLabel("Username");
        classes.setBounds(75,75,80,25);
        sigInPanel.add(classes);
        
        JLabel classes = new JLabel("Username");
        classes.setBounds(75,75,80,25);
        sigInPanel.add(classes);
        
        JLabel classes = new JLabel("Username");
        classes.setBounds(75,75,80,25);
        sigInPanel.add(classes);
        
        JLabel classes = new JLabel("Username");
        classes.setBounds(75,75,80,25);
        sigInPanel.add(classes);
    }
}
