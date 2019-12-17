
package main;
import java.util.*;

public class CourseClas {
 private String courseName;
 private int numberOfStudent = 0; 
 private StringBuilder[] students = new StringBuilder[30];
 
 public CourseClas(String courseName)
 {
 this.courseName = courseName; 
  
 for(int n=0; n<30; n++)
 {
students[n] = new StringBuilder("");  
 }
 
 }
 
 public String getCourseName()
 {return courseName;}
 
 public void addStudent(String students)
 {
 this.students[numberOfStudent].append(students); 
 numberOfStudent++; 
 }
 
 public void dropStudent (String student)
 {  
    for(int i=0; i<numberOfStudent; i++)
    {
    if(students[i].toString() == student)
    {students[i].delete(0, students[i].length()-1);
    numberOfStudent--;}
    }
     
 }
 
 public StringBuilder[] getStudent()
 {return students;}
 
 public int getNumberOfStudent()
 {return numberOfStudent;}
}
