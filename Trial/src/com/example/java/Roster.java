package com.example.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Student;

public class Roster {
        static String invalid = " ";
        static ArrayList<Student> basicArray = new ArrayList<>();
        static ArrayList<String> invalidEmail = new ArrayList<>();
       // static int[] grades1;
    public static void main(String[] args) {

        basicArray.add(new Student("1", "Jake", "Dyke", "jdyke#2@wgu.edu", 31));
        basicArray.add(new Student("2", "Joe", "F", "joef@apple.com", 28));
        basicArray.add(new Student("3", "Frank", "Rizzo", "frankrizzo@rizzo.com", 21));
        basicArray.add(new Student("4", "Hello", "World", "Hello@apple.com", 18));
        // print_ID("3");
                
        print_all(basicArray);
        print_invalid_emails(invalid);
        print_average_grade("1");
        remove("3");
        remove("3");
    }
    
    public static void print_ID(String studentID) {
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
        Iterator<Student> firstIterator = basicArray.iterator();
        while (firstIterator.hasNext()) {
        Student value = firstIterator.next();
        System.out.println("Index: " + " Student ID: " + value.getstudentID() + "|"  + "  Student First Name:  " + value.getfirstName() + "|" + "   Student Last Name:  "  + value.getlastName() + "|" + "   Email:  " + value.getEmail() + "|"
        + " Age: " + value.getage()/* + "|" + value.getGrades()*/);
        } 
  
        }
     
    public static void print_invalid_emails(String invalid) { 
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
    
    public static void print_average_grade(String studentID){
        System.out.println("Ah man, you want math!");
        
    }
    
    public static void remove(String studentID) {
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
