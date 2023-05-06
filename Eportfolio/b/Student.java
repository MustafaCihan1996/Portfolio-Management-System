package b;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;



public class Student {
    
    protected static ArrayList <Student> studentInfom = new ArrayList <Student>();
        
    protected static HashMap<String, String> StudentShower = new HashMap<String, String>();

    
    protected String program;
        
    protected int year;
        
    protected float averageGrade;
    
    protected String lastName;

    public Student(String program, int year, float averageGrade, String lastName) {
        this.program = program;
        this.year = year;
        this.averageGrade = averageGrade;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return program + " " +  year + " "  + averageGrade + " " + lastName + ' ';
    }
    
    public static void hasHMapCreator(HashMap<String, String> StudentShower,String program, int year, String lastName, Student b) {
        
        String total = ""; 
        
        total+=program;
        
        total+=Integer.toString(year);
        
        total+=lastName;
        
        StudentShower.put(total.toLowerCase(), b.toString());
        
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
        
        System.out.println("(8) Lookup via HashMap with program, year, and lastName.");
        
        System.out.println("(9) End Program");
        
    }
    
    //public static void studentCreator(String program, int year, float avrgGrade, String surName)
    
    //{
        
        
     //   Student student = new Student(program,year,avrgGrade, surName);
         
     //   hasHMapCreator(StudentShower,program,year,surName,student);
               
     //   studentInfom.add(student);
         
         
       
    
   // }

    public static void main(String[] args) {
        
        //ArrayList <Student> studentInfom = new ArrayList <Student>();
        
        //HashMap<String, String> StudentShower = new HashMap<String, String>();
        
        String studentInfo;
        
        Scanner sc = new Scanner(System.in); 
        
        int i = 0;
        
        while(i!=9)
        
        {
            
           menu();
           
           i = sc.nextInt();
           
           if(i == 1)
               
           {
                int year = 0;
                
                float gpa = 0;
                
                String checker = "";
               
                System.out.println("Enter the info");
           
                System.out.println("Enter the last name");
                
                sc.nextLine();
                
          
                String lastNameLast = sc.nextLine();
                
                
                if(lastNameLast.isEmpty())
                
                {
                
                    throw new NullPointerException("Lastname is required");
                       
                    
                }
           
                System.out.println("Enter the other information");
           
          
           
                studentInfo = sc.nextLine();
           
                String words[] = studentInfo.split(" ");
                
                
           
                if(words.length == 0 || words.length == 1)
           
                {
               
                    throw new NullPointerException("program and year are reuqired");
               
                }
           
                if(words.length == 2)
           
                {
                    try
                    {
                          
                    year = Integer.parseInt(words[1]);
                    
                    checker+=words[0] + year + lastNameLast;
                    
                    }
                    
                    catch(NumberFormatException e)
                    
                    {
                      
                         System.out.println("An error occurred: " + e.getMessage());
                        
                    }
                    
                   
                    
                    if(StudentShower.containsKey(checker.toLowerCase()))
                    
                    {
                     
                        System.out.println("Object already exists");
                        
                        continue;
                        
                    }
                    
                    try 
                        
                    {
                        
                         Student student = new Student(words[0],year,0.0f, lastNameLast);
                         
                         hasHMapCreator(StudentShower,words[0],year,lastNameLast,student);
               
                         studentInfom.add(student);
                    
                    }
                    
                    catch (NumberFormatException e)
                        
                    {
                        
                        System.out.println("An error occurred: " + e.getMessage());
                           
                    }
             
               
                  
               
                }
           
                if(words.length == 3)
           
                {
                    try
                    {
                        
                    year = Integer.parseInt(words[1]);
               
                    gpa =Float.parseFloat(words[2]);
                    
                    if(gpa<0 || gpa > 100)
                    
                    {
                        
                        throw new NullPointerException("gpa can not be less than 0 or more than 100");
                        
                    }
                    
                    }
                    
                    catch(NumberFormatException e)
                    
                    {
                    
                        System.out.println("An error occurred: " + e.getMessage());
                    
                    }
                    
                    if(gpa<0 || gpa >100)
                    
                    {
                    
                        throw new NullPointerException("gpa can not be less than 0 or more than 100");
                    
                    }
                            
                    
                    checker+=words[0] + year + lastNameLast;
                    
                    if(StudentShower.containsKey(checker.toLowerCase()))
                    
                    {
                        
                       System.out.println("Object already exists");
                        
                       continue; 
                    
                    }
                    
                    try
                    
                    {
               
                    Student student = new Student(words[0],year,gpa, lastNameLast);
               
                    hasHMapCreator(StudentShower,words[0],year,lastNameLast,student);
               
                    studentInfom.add(student);
                    
                    }
                    
                    catch(NumberFormatException e)
                    
                    {
                    
                         System.out.println("An error occurred: " + e.getMessage());
                         
                    }
               
                }
           
                if(words.length < 0 || words.length > 3)
           
                {
               
                    throw new NullPointerException("Error");
               
                    
               
                }
               
           }
           
           if(i == 2)
           
           {
                int year = 0;
                
                float gpa = 0;
                
                String checker = "";
                
                System.out.println("Enter the last name");
                
                sc.nextLine();
           
                String lastNameLast = sc.nextLine();
                
                if(lastNameLast.isEmpty())
                
                {
                
                    throw new NullPointerException("Lastname is required");
                
                }
           
                System.out.println("Enter the other information");
               
                studentInfo = sc.nextLine();
           
                String words[] = studentInfo.split(" ");
           
                if(words.length == 0 || words.length == 1)
           
                {
               
                    throw new NullPointerException("program and year are reuqired");
               
                   
               
                }
           
                if(words.length == 2)
           
                {
                    try
                    
                    {
                    
                        year = Integer.parseInt(words[1]);
                        
                    }
                    
                    catch(NumberFormatException e)
                    
                    {
                    
                        System.out.println("An error occurred: " + e.getMessage());
                    
                    }
                     
               
                 
               
                }
           
                if(words.length == 3)
           
                {
                    try
                    
                    {
                    
                        year = Integer.parseInt(words[1]);
               
                       
                    
                    }
                    
                    catch(NumberFormatException e)
                    
                    {
                    
                        System.out.println("An error occurred: " + e.getMessage());
                    
                    }
                    try
                    
                    {
                        
                         gpa =Float.parseFloat(words[2]);
                         
                         if(gpa <0 || gpa> 100)
                         
                         {
                             
                             throw new NullPointerException("gpa can not be less than 0 or more than 100");
                         
                         }
                                
                    } 
                    catch(NumberFormatException e)
                    
                    {
                    
                         System.out.println("An error occurred: " + e.getMessage());
                    }
                    
                    
                     
               
                }
           
                if(words.length < 0 || words.length > 3)
           
                {
               
                    throw new NullPointerException("Error");
               
               
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
                
                checker+= words[0] + year + lastNameLast;
                
                if(StudentShower.containsKey(checker.toLowerCase()))
                
                {
                    
                    System.out.println("Object already exists");
                    
                    continue;
                
                }
                
                try
                    
                {
                    
                GraduateStudent a = new GraduateStudent(words[0],year,gpa,lastNameLast,superVisor,PHD,school);
                
                hasHMapCreator(StudentShower,words[0],year,lastNameLast,a);
               
                studentInfom.add(a);
                
                }
                
                catch(NumberFormatException e)
                
                {
                
                    System.out.println("An error occurred: " + e.getMessage());
                    
                }
                
               
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
       
                System.out.println("Enter the input file name");
             
                String inputName = "/Users/mustafaasimcihan/NetBeansProjects/program/src/main/java/b/";
                
                String b;
                
                sc.nextLine();
             
                b = sc.nextLine();
                
                inputName+= b;
                
               // System.out.println(inputName);
         
                int year = 0;
             
                float gpa = 0;
             
                boolean bool1 = true;
               
               try 
               
               {
           
                        FileInputStream inputStream = new FileInputStream(inputName);

      
                        Scanner scanner = new Scanner(inputStream);

            
                        while (scanner.hasNextLine()) 
                        
                        {
                        
                        String checker = "";
                            
                        String line = scanner.nextLine();
                        
                        System.out.println(line);
                        
                        String words[] = line.split(" ");
                        
                        if(words.length == 4)
                        
                        {
                          
                          checker+= words[0] + words[1] + words[3];
                            
                           year = Integer.parseInt(words[1]);
                          
                           gpa = Float.parseFloat(words[2]);
                          
                          
                          if(StudentShower.containsKey(checker.toLowerCase()))
                          
                          {
                          
                              System.out.println("Object already exist");
                          
                          }
                          
                          else
                          
                          {
                              
                            try
                            {
                            
                             
                            Student student = new Student(words[0],year,gpa,words[3]);
               
                            hasHMapCreator(StudentShower,words[0],year,words[3],student);
                            
                            studentInfom.add(student);
                            
                            }
                            catch(NumberFormatException e)
                            
                            {
                            
                                System.out.println("An error occurred: " + e.getMessage());
                                
                            }
                              
                          }
                            
                        }
                        
                        if(words.length == 7)
                        
                        {
                        
                            checker+= words[0] + words[1] + words[3];
                            
                            try
                            {
                                
                             year = Integer.parseInt(words[1]);
                          
                             gpa = Float.parseFloat(words[2]);
                             
                             if(gpa < 0 || gpa >100)
                             
                             {
                                 
                                 throw new NullPointerException("gpa can not be less than 0 or more than 100");
                             
                             }
                            
                             bool1 = Boolean.parseBoolean(words[5]);
                             
                            }
                            catch(NumberFormatException e)
                            
                            {
                            
                                System.out.println("An error occurred: " + e.getMessage());
                            
                            }
                         
                            if(StudentShower.containsKey(checker.toLowerCase()))
                          
                            {
                          
                              System.out.println("Object already exist");
                          
                            }
                          
                            else
                          
                            {
                                try
                                
                                {
                          
                                GraduateStudent a = new GraduateStudent(words[0],year,gpa,words[3],words[4],bool1,words[6]);
                
                                hasHMapCreator(StudentShower,words[0],year,words[3],a);
               
                                studentInfom.add(a);
                                
                                }
                                
                                catch(NumberFormatException e)
                                
                                {
                                
                                    System.out.println("An error occurred: " + e.getMessage());
                                    
                                }
               
                 
                            }
                            
                        }
                        
                        
                        
                        
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
               int decider = 0;
               
               String fileName = "/Users/mustafaasimcihan/NetBeansProjects/program/src/main/java/b/"; 
               
               System.out.println("Enter the fileName");
               
               String b;
               
               sc.nextLine();
               
               b = sc.nextLine();
               
               fileName+=b;
               
               try 
                   
               {
                   if(studentInfom.isEmpty())
                        
                    {
                        
                            System.out.println("Student info is empty");
                            
                            continue;
                        
                    }
                   
                    //FileWriter writer = new FileWriter(fileName);
                    
                    FileWriter writer = new FileWriter(fileName, true);
                    
                    
                    
                    
                    for(Student a: studentInfom)
                    
                    {
                        
                        File file = new File(fileName);
            
                        Scanner scanner = new Scanner(file);
                        
                        while(scanner.hasNextLine())
                        
                        {
                            String objectCorrecter = "";
                            
                            String c = Integer.toString(a.year);
                            
                            objectCorrecter += a.program + c + a.lastName;
                            
                            String checker = "";
                            
                            String line = scanner.nextLine();
                        
                            //System.out.println(line);
                        
                            String wordsk[] = line.split(" ");
                      
                            checker+= wordsk[0] + wordsk[1] + wordsk[3];
                                
                            if(objectCorrecter.toLowerCase().equals(checker.toLowerCase()))
                                
                            {
                                
                                decider++;    
                                
                            }
                            
                        }
                        
                        if(decider == 0)
                        
                        {
                            
                        if (fileName.length() > 0) 
                        
                        { 
                           
                            writer.write("\n");
                            
                        }
                        
                            String str = a.toString();
                            
                            writer.write(str);
                         
                            writer.flush();
                            
                            System.out.println("Successfully wrote to the file!");
                        
                        }
                        
                        else
                        
                        {
                            System.out.println("Object is already in input file");
                            
                            decider = 0;
                        
                        }
                        
                        
                        
                        scanner.close();
                        
                         
                        
                     
                        
                        //String str = a.toString() + "\n";
                            
                        //writer.write(str);
                         
                        //writer.flush();
                         
                        
                    }
                    
                    //writer.write("This is some text that will be written to the file!");
                     
                    
                    writer.close();
                    
                    
               } 
               
               catch (IOException e) 
                     
                {
                     System.out.println("An error occurred.");
                        
                     e.printStackTrace();
                }
           
           }
           
           if(i == 8)
           
           {
               
               System.out.println("Enter the searchword program year and lastname are mandatory");
               
               String total = "";
               
               sc.nextLine();
               
               String wordo = sc.nextLine();
               
               String words[] = wordo.split(" ");
               
               for(int h = 0; h<words.length; h++)
               
               {
                      
                  total+= words[h]; 
               
               }
               
               
               if(StudentShower.containsKey(total.toLowerCase()))
               
               {
                
                   System.out.println("Result");
                   
                   System.out.println(StudentShower.get(total.toLowerCase()));
               
               }
               
               
               
           }
           
          
        }
        
        
    
        
        sc.close();
    }
    
}