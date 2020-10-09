package University;

import java.util.ArrayList;
import java.util.Hashtable;

class School{
    private President president = new President(true, 00000, true, "Alan Garcia");
    private ArrayList<Classroom> classes = new ArrayList<Classroom>();
    private Hashtable<Integer, Student> students = new Hashtable<Integer, Student>();
    private int studentID = 100000;
    private int profID = 10000;
    
    School(){
    
    }
        /**
    -int enrollment
    -int professorCount
    -ArrayList<Classroom> classes

    +setClasses()
    +getClasses()
    +setProfessorCount()
    +getProfessorCount()
    +setClasses()
    +getClasses()
    */
    public ArrayList<Classroom> getClasses(){
        return classes;
    }
    
    public void addProfessor(String name){
        
    }
    
    public void addClass(Classroom lecture){
        classes.add(lecture);
    }
    
    public void addStudent(String dob, int grade, String major, String typeOfStudent, Classroom[] classes){
        if(students.size() == 0){
            students.put(studentID, new Student(studentID, dob, grade, major, typeOfStudent, classes));
            this.studentID++;
        } else{
            students.put(studentID, new Student(studentID, dob, grade, major, typeOfStudent, classes));
            this.studentID++;
        }
        
    }    
}
