public class Classroom {
    private Professor classProf;
    private String className;
    private boolean classAtCap;
    private int classSize;
    private int tier;
    private int cost;
    
    Classroom(Professor classProf, String className, int classSize, int tier, int cost){
        this.classProf = classProf;
        this.className = className;
        this.classSize = classSize;
        this.tier = tier;
        this.cost = cost;
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
}
