package University;

import java.util.ArrayList;

class School{
    private ArrayList<Classroom> classes = new ArrayList<Classroom>();
    
    public void addClass(Classroom lecture){
        classes.add(lecture);
    }
    
    
}
