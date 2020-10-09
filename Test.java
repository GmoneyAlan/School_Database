import javax.swing.UIManager;

import App.*;

public class Test {
    
    public static void main(String[] args){
    /*
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        App app = new App();
        app.logIn();
    }
}
