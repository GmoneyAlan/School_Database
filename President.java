import java.util.Random;
import java.util.Hashtable;

public class President extends Faculty {
    //Professor list
    private Hashtable<String, Professor> professors = new Hashtable<String, Professor>();
    private Random random = new Random();
    private int setClassCost = 500;
    
    President(boolean override, int id, boolean isPres, String name){
        super(override, id, isPres, name);
    }

    public void changeClassTuition(Classroom classroom, int cost){
        classroom.setCost(Cost);
    }

    public void fireProfessor(){
        
    }

    public void hireProfessor(String name){
        int id = random.nextInt(999999)
        professors.put(name, new Professor(true, id, false, name))
    }

    public void dropDecision(){

    }

    public void newClass(School school, Professor professor){
        school.addClass(new Classroom(professor, "", 0, 1, setClassCost);
    }

    public void deleteClass(){

    }

    public void suspendStudent(){

    }

    public void changeProfClass(){

    }
}
