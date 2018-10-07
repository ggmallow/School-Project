/* This class will contain the student data */
package model;


/**
 *
 * @author jacobdyke
 */

public class Student {

      private String studentID;
      private String firstName;
      private String lastName;
      private String email;
      private int age;
      private double[] grades;

      public Student(){
//     ///could set default value for student here
     }
   
      public Student(String studentID, String firstName, String lastName, String email, int age/* , double[] grades*/) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentID = studentID;
            this.email = email;
            this.age = age;
            this.grades = grades;
            
      }
      
      public String getfirstName(){
        return firstName;
    }
    
      public void setfirstName(String firstName){
            this.firstName = firstName;
    }
      
      public String getlastName(){
        return lastName;
    }
    
      public void setlastName(String lastName){
            this.firstName = lastName;
    }

      public String getstudentID(){ 
            return studentID;
    }
    
      public void setstudentID(String studentID){
            this.studentID = studentID;
    }
    
     public String getEmail(){
        return email;
    }
    

     public void setEmail(String email){
        this.email = email;
    }
     
      public int getage(){ 
            return age;
    }
    
      public void setage(int age){
            this.age = age;
    }
     

     public double[] getGrades(){
        return grades;
    }
    
     public void setGrades(double[] grades){
     this.grades = grades;
    }     
     
     
}