package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Student;

public class Roster {
        static String invalid = " ";
//        static ArrayList<Student> basicArray = new ArrayList<>();
        static ArrayList<String> invalidEmail = new ArrayList<>();
        static double totalGrades;
        
    public static void main(String[] args) {
        ArrayList<Student> basicArray = new ArrayList<>();
        basicArray.add(new Student("1", "John", "Smith", "John1989@gmail.com", 31, new double[]{88, 79, 59}));
        basicArray.add(new Student("2", "Suzan", "Erikson", "Erickson_1990@gmailcom", 19, new double[]{91, 72, 85}));
        basicArray.add(new Student("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new double[]{85, 84, 87}));
        basicArray.add(new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, new double[]{91, 98, 82}));
        basicArray.add(new Student("5", "Jake", "Dyke", "jdyke2@wgu.edu", 31, new double[]{100, 100, 100}));
                
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
        System.out.println(" Student ID: " + value.getstudentID() + "|"  + "  Student First Name:  " + value.getfirstName() + "|" + "   Student Last Name:  "  + value.getlastName() + "|" + "   Email:  " + value.getEmail() + "|"
        + " Age: " + value.getage() + "|" + Arrays.toString(value.getGrades()));
        } 
  
        }
     
    public static void print_invalid_emails(String invalid, List<Student>basicArray) { 
        for(Student s : basicArray) { 
                
               
                if (!s.getEmail().contains(".") && !s.getEmail().contains(invalid) && !s.getEmail().contains(invalid)) {  
                invalidEmail.add(s.getEmail());
                }              
}
                if (invalidEmail.size() > 0) {
                System.out.println("The invalid emails are:  " + invalidEmail);                
                } else {
                System.out.println("There is no invalid emails currently!");              
            }
        }
 
    public static void print_average_grade(String studentID, List<Student>basicArray){
        for (Student a : basicArray) {
            if (a.getstudentID().equals(studentID)) {
                    double grades = 0;  
                for (double b : a.getGrades()){
                    grades = b++;
                    totalGrades = + grades;
                 System.out.println("Grade loop " + grades/* / a.getGrades().length*/);
                }
                System.out.println("Total grade points " + totalGrades/* / a.getGrades().length*/);
//                 System.out.println("Student has the grades of " + grades/* / a.getGrades().length*/);
        }
        }
        
       
        
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
