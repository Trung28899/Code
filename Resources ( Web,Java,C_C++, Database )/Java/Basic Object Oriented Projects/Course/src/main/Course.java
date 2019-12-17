
package main;
import java.util.Scanner; 

public class Course {

    public static void main(String[] args) {
    CourseClas n = new CourseClas("Math"); 
    
    n.addStudent("Quang Trung Trinh");
    n.addStudent("Tuan Minh Nguyen");
    n.addStudent("Nam Nguyen"); 
    n.addStudent("Ngo Bao Chau"); 
    
    n.dropStudent("Nam Nguyen"); 
    n.dropStudent("Tuan Minh Nguyen"); 
    
    StringBuilder[] arr = n.getStudent(); 
        System.out.println("The course name is: " + n.getCourseName());
        System.out.println("The students are: " + arr[0]+ 
        "| "+arr[1]+"| "+arr[2]+"| "+arr[3]);
        System.out.println("The number of student is: " + n.getNumberOfStudent());
    
    }
    
}
