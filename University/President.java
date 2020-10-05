package University;

import java.util.Random;
import java.util.ArrayList;
import java.util.Hashtable;

public class President extends Faculty {
    private Hashtable<String, Professor> professors = new Hashtable<String, Professor>();
    private Random random = new Random();
    private int setClassCost = 500;
    
    President(boolean override, int id, boolean isPres, String name){
        super(override, id, isPres, name);
    }

    public void changeClassTuition(Classroom classroom, int cost){
        classroom.setCost(cost);
    }

    public void fireProfessor(String name){
        professors.remove(name);
    }

    public void hireProfessor(String name){
        int id = random.nextInt(999999);
        professors.put(name, new Professor(true, id, false, name));
    }

    public boolean dropDecision(Classroom lecture, Student student){
        //Add suspensions
        if(student.getGPA() < 3.0){
            lecture.dropStudent(student);
            return true;
        }
        else{
            return false;
        }
    }

    public void newClass(School school, Professor professor){
        school.addClass(new Classroom(professor, "", 0, 1, setClassCost));
    }

    public void deleteClass(ArrayList<Classroom> classes, Classroom lecture){
        int i = classes.indexOf(lecture);
        classes.remove(i);
    }

    public void suspendStudent(){

    }

    public void changeProfClass(Classroom lecture, Professor professor){
        lecture.setProfessor(professor);
    }
}
