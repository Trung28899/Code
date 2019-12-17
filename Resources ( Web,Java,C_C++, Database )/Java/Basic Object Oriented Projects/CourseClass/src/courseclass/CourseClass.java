
package courseclass;
import java.util.*;
public class CourseClass {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    
    Course c1 = new Course("Java Programming"); 
    Course c2 = new Course("Unix Internal");
    
    c1.addStudent("Quang Trung Trinh");
    c1.addStudent("Tuan Minh Nguyen");
    c1.addStudent("Nam");
    c2.addStudent("Ben Kam");
    c2.addStudent("Abdi");
    c1.dropStudent("Nam");
    
    int num1 = c1.getNumberOfStudent();
    int num2 = c2.getNumberOfStudent();
    
    String[] student = c1.getStudent();
    System.out.println("The number of student in Java Programming are: " + c1.getNumberOfStudent());
    System.out.println("The students in Java Programming are: ");
    for(int i = 0; i<num1; i++)
    {
        System.out.print(student[i]+", ");
    }
        System.out.println("");
    String[] student2 = c2.getStudent();
    System.out.println("The number of student in Unix Internal are: " + c2.getNumberOfStudent());
    System.out.println("The students in Unix Internal are: ");
        for(int n = 0; n<num1; n++)
    {
        System.out.print(student2[n]+", ");
    }
        System.out.println("");
    }
    
}
