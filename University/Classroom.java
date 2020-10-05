package University;

import java.util.ArrayList;

public class Classroom {
    private Professor classProf;
    private ArrayList<Student> students;
    private String className;
    private int classSize;
    private int MAX_STUDENTS;
    private int tier;
    private int cost;
    
    Classroom(Professor classProf, String className, int classSize, int tier, int cost){
        this.students = new ArrayList<Student>();
        this.classProf = classProf;
        this.className = className;
        this.classSize = this.students.size();
        this.tier = tier;
        this.cost = cost;
        
        if(tier == 1)
            MAX_STUDENTS = 200;
        else if(tier == 2)
            MAX_STUDENTS = 75;
        else
            MAX_STUDENTS = 30;
    }

    public Professor getProfessor(){
        return classProf;
    }

    public void setProfessor(Professor prof){
        this.classProf = prof;
    }

    public int getTier(){
        return tier;
    }

    public String getClassName(){
        return className;
    }

    public int getClassSize(){
        return classSize;
    }

    public void setClassSize(int classSize){
        this.classSize = classSize;
    }
    
    public int getcost(){
        return this.cost;
    }
    
    public void setCost(int Cost){
        this.cost = cost;
    }

    public boolean addStudent(Student student){
        if (students.size() == MAX_STUDENTS)
            return false;
        else{
            students.add(student);
            classSize++;
            return true;
        }
    }
    
    public boolean dropStudent(Student student){
        if (classSize == 0)
            return false;
        else{
            int i = students.indexOf(student);
            students.remove(i);
            return true;
        }    
    }
}
