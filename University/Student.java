package University;

public class Student {
    private int id;
    private String name;
    private String dob;
    public double GPA; //Based out of 4.0
    private int grade;
    private String major;
    private String typeOfStudent;
    private Classroom[] classes;

    Student(int id, String dob, int grade, String major, String typeOfStudent, Classroom[] classes) {
        this.id = id;
        this.dob = dob;
        this.grade = grade;
        this.major = major;
        this.typeOfStudent = typeOfStudent;
        this.classes = classes;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public int getGrade() {
        return grade;
    }
    
    public String getMajor() {
        return major;
    }

    public String getTypeOfStudent() {
        return typeOfStudent;
    }

    public double getGPA(){
        return GPA;
    }
    
    public void setTypeOfStudent(String typeOfStudent) {
        this.typeOfStudent = typeOfStudent;
    }

    // WIP //
    public void requestMoreClasses() {
        
    }
    
}
