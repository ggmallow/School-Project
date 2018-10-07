package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Student;

public class Roster {
        static String invalid = " ";
//        static ArrayList<Student> basicArray = new ArrayList<>();
        static ArrayList<String> invalidEmail = new ArrayList<>();
       // static int[] grades1;

    public static void main(String[] args) {
        ArrayList<Student> basicArray = new ArrayList<>();
        basicArray.add(new Student("1", "Jake", "Dyke", "jdyke 2@wgu.edu", 31, new double[]{100.0, 100.0, 100.0}));
        basicArray.add(new Student("2", "Joe", "F", "joef@apple..com", 28, new double[]{80.0, 10.0, 0.0}));
        basicArray.add(new Student("3", "Frank", "Rizzo", "frankrizzo@rizzo.com", 21, new double[]{100.0, 100.0, 100.0}));
        basicArray.add(new Student("4", "Hello", "World", "Hello@apple.com", 18, new double[]{100.0, 100.0, 100.0}));
        // print_ID("3");
                
        print_all(basicArray);
        print_ID(invalid, basicArray);
//        print_ID("3", basicArray);
        print_invalid_emails(invalid, basicArray);
        print_average_grade("1", basicArray);
        remove("3", basicArray);
        remove("3", basicArray);
    }
    
    public static void print_ID(String studentID, List<Student>basicArray) {
            for(Student s : basicArray) {
                if (s.getstudentID().equals(studentID)) {
                System.out.println("The ID is:  " + studentID);
                return;
                
                } else {
           
                }

        }
            System.out.println("The ID is not found.");
    }   
    
    public static void print_all(List<Student> basicArray) {
        for (Student value : basicArray) {
        System.out.println("Index: " + " Student ID: " + value.getstudentID() + "|"  + "  Student First Name:  " + value.getfirstName() + "|" + "   Student Last Name:  "  + value.getlastName() + "|" + "   Email:  " + value.getEmail() + "|"
        + " Age: " + value.getage() + "|" + Arrays.toString(value.getGrades()));
        } 
  
        }
     
    public static void print_invalid_emails(String invalid, List<Student>basicArray) { 
        for(Student s : basicArray) { 
            
                
            
                if (s.getEmail().contains(invalid) || s.getEmail().contains("..")) {  
                invalidEmail.add(s.getEmail());
                }
                
        }
                if (invalidEmail.size() > 0) {
                System.out.println("The invalid emails are:  " + invalidEmail);                
                } else /* if(invalidEmail.isEmpty()) */ {
                System.out.println("There is no invalid emails currently!");              
            }
        }
    
    public static void print_average_grade(String studentID, List<Student>basicArray){
        System.out.println("Ah man, you want math!");
        
        // for (Student student : basicArray) {
        //      if (student.studentID.equals(studentID)) {
        //          double gradeAggregate = 0.0;
        //          for (double grade : student.getGrades) {
        //              gradeAggregate++;
        //          }
        //          print(gradeAggregate / student.getGrades.count);
        //      }
        // }
        
    }
    
    public static void remove(String studentID, List<Student>basicArray) {
             for(Student s : basicArray) {
                if (s.getstudentID().equals(studentID)) {
                s.setstudentID("Removed");
                System.out.println("You have removed the student");
                return;
                
                } else {
           
                }

        }
            System.out.println("That student is not found.");  
    }
}
