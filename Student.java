public class Student {
    private int id;
    private String name;
    private String dob;
    private int grade;
    private String major;
    private String typeOfStudent;
    private int amountOfClasses;

    Student(int id, String dob, int grade, String major, String typeOfStudent, int amountOfClasses) {
        this.id = id;
        this.dob = dob;
        this.grade = grade;
        this.major = major;
        this.typeOfStudent = typeOfStudent;
        this.amountOfClasses = amountOfClasses;
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

    public void setTypeOfStudent(String typeOfStudent) {
        this.typeOfStudent = typeOfStudent;
    }

    // WIP //
    public void requestMoreClasses() {

    }
    
}
