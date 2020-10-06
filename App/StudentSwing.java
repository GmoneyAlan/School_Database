package App;

import javax.swing.JFrame;
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
}
