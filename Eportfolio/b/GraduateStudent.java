package b;



public class GraduateStudent extends Student {
    
    private String superVisor;
        
    private boolean isPhD ;
        
    private String undergraduateSchool;

    public GraduateStudent(String program, int year, float averageGrade, String lastName,String superVisor, boolean isPhD, String undergraduateSchool){
        super(program,year,averageGrade,lastName);
        this.superVisor = superVisor;
        this.isPhD = isPhD;
        this.undergraduateSchool = undergraduateSchool;
    }

    public String getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(String superVisor) {
        this.superVisor = superVisor;
    }

    public boolean isIsPhD() {
        return isPhD;
    }

    public void setIsPhD(boolean isPhD) {
        this.isPhD = isPhD;
    }

    public String getUndergraduateSchool() {
        return undergraduateSchool;
    }

    public void setUndergraduateSchool(String undergraduateSchool) {
        this.undergraduateSchool = undergraduateSchool;
    }

    
    
    @Override
    public String toString() {
        
        return program + " " + year + " " + averageGrade + " " + lastName + " " + superVisor + " " + isPhD + " " + undergraduateSchool;
    }
    
   
}