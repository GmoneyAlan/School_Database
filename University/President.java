package University;

import java.util.ArrayList;
import java.util.Hashtable;

public class President extends Faculty {
    private Hashtable<Integer, Professor> professors = new Hashtable<Integer, Professor>();
    private int setClassCost = 500;
    
    President(boolean override, int id, boolean isPres, String name){
        super(override, id, isPres, name);
    }
    
    public Hashtable<Integer, Professor> getProfessor(){
        return professors;
    }

    public void changeClassTuition(Classroom classroom, int cost){
        classroom.setCost(cost);
    }

    public void fireProfessor(int ID){
        professors.remove(ID);
    }

    public void hireProfessor(String name, int ID){
        if(this.professors.size() == 0){
            professors.put(ID, new Professor(true, ID, false, name));
            ID++;
        } else{
            professors.put(ID, new Professor(true, ID, false, name));
            ID++;
        }
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
    
    public void expandStudentSchedule(){
        
    }
}
