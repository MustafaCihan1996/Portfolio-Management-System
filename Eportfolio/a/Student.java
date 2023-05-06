package a;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;



public class Student {
    
    protected String program;
        
    protected int year;
        
    protected float averageGrade;

    public Student(String program, int year, float averageGrade) {
        this.program = program;
        this.year = year;
        this.averageGrade = averageGrade;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }
    
    

    @Override
    public String toString() {
        
        return "Student{" + "program=" + program + ", year=" + year + ", averageGrade=" + averageGrade + '}';
    }
    
    public static void menu()
    
    {
    
        System.out.println("(1) Enter information for a new Student.");
        
        System.out.println("(2) Enter information for a new GraduateStudent");
        
        System.out.println("(3) Show all student information with each attribute on a separate line");
        
        System.out.println("(4)Print the average of the average grades and total nuumbers for all students");
        
        System.out.println("(5) Enter a specific program and show all student information for that program");
        
        System.out.println("(6) Load student information from an input file.");
        
        System.out.println("(7) Save all student information to an output file");
        
        System.out.println("(8) End program.");
        
    }

    public static void main(String[] args) {
        
        ArrayList <Student> studentInfom = new ArrayList <Student>();
        
        String studentInfo;
        
        Scanner sc = new Scanner(System.in); 
        
        int i = 0;
        
        while(i!=8)
        
        {
            
           menu();
           
           i = sc.nextInt();
           
           if(i == 1)
               
           {
               
           System.out.println("Enter the info");
           
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
               
               Student student = new Student(words[0],year,0.0f);
               
               studentInfom.add(student);
               
           }
           
           if(words.length == 3)
           
           {
               
               int year = Integer.parseInt(words[1]);
               
               float gpa =Float.parseFloat(words[2]);
               
               Student student = new Student(words[0],year,gpa);
               
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
                int year = 0;
                
                float gpa = 0;
                
                System.out.println("Enter the info");
                
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
                    
                     year = Integer.parseInt(words[1]);
               
                 
               
                }
           
                if(words.length == 3)
           
                {
               
                     year = Integer.parseInt(words[1]);
               
                     gpa =Float.parseFloat(words[2]);
               
               
                }
           
                if(words.length < 0 || words.length > 3)
           
                {
               
                    System.out.println("Error");
               
               
                }
                
                String superVisor;
                
                System.out.println("Enter the superVisor");
                
                superVisor = sc.nextLine();
                
                System.out.println("Enter the master or phd");
                
                boolean PHD = true;
                
                String isPHD;
                
                isPHD = sc.nextLine();
               
                if(isPHD.equals("0"))
                
                {
                
                    PHD = false;
                    
                }
                
                System.out.println("Enter the school");
                
                String school;
                
                school = sc.nextLine();
                
                
               GraduateStudent a = new GraduateStudent(words[0],year,gpa,superVisor,PHD,school);
               
               studentInfom.add(a);
               
           }
           
           
           
           if(i == 3)
               
           {
               
              for(Student a: studentInfom)
              
              {
              
                System.out.println(a.toString());
              
              }
               
           }
           
           if(i == 4)
               
           {
               float gpa = 0;
               
               int total = studentInfom.size();
             
               for(Student a : studentInfom)
              
               {
                  
                  gpa+= a.getAverageGrade();
                  
                  
                   
               }
               
               System.out.println("Total Student " + total + " average " + (gpa/total));
               
           }
           
           if(i == 5)
           
           {
               sc.nextLine();
               System.out.println("Enter the program");
               
               String programi;
               
               programi = sc.nextLine();
                       
               for(Student a: studentInfom)
               
               {
               
                   if(a.getProgram().equals(programi))
                   
                   {
                   
                       System.out.println(a);
                   
                   }
               
               }
           
           }
           
           if(i == 6)
           
           {
               
               try 
               
               {
           
                        FileInputStream inputStream = new FileInputStream("/Users/mustafaasimcihan/NetBeansProjects/program/src/main/java/a/input.txt");

      
                        Scanner scanner = new Scanner(inputStream);

            
                        while (scanner.hasNextLine()) 
                        
                        {
                            
                        String line = scanner.nextLine();
                        
                        System.out.println(line);
                        
                        
                        }
                        
                        scanner.close();
                        
                        inputStream.close();                   
                        
                } 
               
               catch (IOException e) 
               
               {
                    e.printStackTrace();
                
               }
               
           }
           
           if(i == 7)
           
           {
               
               try 
                   
               {
                    FileWriter writer = new FileWriter("/Users/mustafaasimcihan/NetBeansProjects/program/src/main/java/a/input.txt");
                    
                    for(Student a: studentInfom)
                    
                    {
                    
                         writer.write(a.toString());
                         
                        
                    }
                    
                    //writer.write("This is some text that will be written to the file!");
                    
                    writer.close();
                    
                    System.out.println("Successfully wrote to the file!");
               } 
               
               catch (IOException e) 
                     
                {
                     System.out.println("An error occurred.");
                        
                     e.printStackTrace();
                }
           
           }
           
          
        }
        
        sc.close();
    }
}