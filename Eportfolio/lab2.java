import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class lab2 {
    
    
    
        private String program;
        
        private int year;
        
        private float averageGrade;

    public lab2(String program, int year, float averageGrade) {
        this.program = program;
        this.year = year;
        this.averageGrade = averageGrade;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "lab2{" + "program=" + program + ", year=" + year + ", averageGrade=" + averageGrade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final lab2 other = (lab2) obj;
        if (this.year != other.year) {
            return false;
        }
        if (Float.floatToIntBits(this.averageGrade) != Float.floatToIntBits(other.averageGrade)) {
            return false;
        }
        return Objects.equals(this.program, other.program);
    }
    
    
    
        
        public static void menu(){
            
            
            
            System.out.println("(1) Enter information for a new student.");
            
            
            System.out.println("(2) Show all student information with program, year, and average grade on separate\n" +
"lines");
            
            System.out.println("(3) Print the average of the average grades for class and the total number of\n" +
"students.");
            
            System.out.println("(4) Enter a specific program and show all student information for that program");
            
            
            System.out.println("(5) End the program.");
            
        }

    public static void main(String[] args) {
        
        ArrayList <lab2> studentInfom = new ArrayList <lab2>();
        
        String studentInfo;
        
        Scanner sc = new Scanner(System.in); 
        
        int i = 0;
        
        while(i!=5)
        
        {
            
           menu();
           
           i = sc.nextInt();
           
           if(i == 1)
               
           {
               
           
           
           sc.nextLine();
           
           studentInfo = sc.nextLine();
           
           String words[] = studentInfo.split(" ");
           
           if(words.length == 0 || words.length == 1)
           
           {
               
               System.out.println("Program and year are mandatory");
               
               continue;
               
           }
           
           if(words.length == 2)
           
           {
               int year = Integer.parseInt(words[1]);
               
               lab2 student = new lab2(words[0],year,0.0f);
               
               studentInfom.add(student);
               
           }
           
           if(words.length == 3)
           
           {
               
               int year = Integer.parseInt(words[1]);
               
               float gpa =Float.parseFloat(words[2]);
               
               lab2 student = new lab2(words[0],year,gpa);
               
               studentInfom.add(student);
               
           }
           
           if(words.length < 0 || words.length > 3)
           
           {
               
               System.out.println("Error");
               
               continue;
               
           }
               
           }
           
           if(i == 2)
           
           {
               
               if(studentInfom.isEmpty())
               
               {
                   
                   System.out.println("No student record");
                   
               }
                
               
           {
               
               for(lab2 a : studentInfom)
               
               {
               
                   System.out.println(a.getProgram() + " " +  a.getYear() + " " +  a.getAverageGrade());
                   
               }
               
           }
           
           }
           
           if(i == 3)
               
           {
               
              float averageGpa = 0;
              
              int totalStudent;
              
              for(lab2 b: studentInfom)
              
              {
                  
                   averageGpa += b.getAverageGrade(); 
                   
                  
              }
              
              System.out.println("Total student " + studentInfom.size() + " Average Gpa " + averageGpa/studentInfom.size() );
               
           }
           
           if(i == 4)
               
           {
               String specific;
               
               System.out.println("Enter the specific program");
               
               sc.nextLine();
               
               specific = sc.nextLine();
               
               for(lab2 c: studentInfom)
               
               {
                   if(c.getProgram().equals(specific))
                   
                   {
                       
                       System.out.println(c.getProgram() + " " +  c.getYear() + " " +  c.getAverageGrade());
                       
                   }
                   
                   
               }
               
               
           }
           
          
        }
        
        sc.close();
    }
    
    
}

    
   