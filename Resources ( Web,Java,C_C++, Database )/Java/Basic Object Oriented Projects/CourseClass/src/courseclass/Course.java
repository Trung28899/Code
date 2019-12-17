
package courseclass;

public class Course {
   private String courseName; 
   private String[] students = new String[30]; 
   private int numberOfStudent ; 
   
   public Course(String courseName)
   {
   this.courseName = courseName; 
   }
   
   public String getCourseName()
   {return courseName; }
   
   public void addStudent(String student)
   {
       students[numberOfStudent] = student;
       numberOfStudent++; 
   }
   
   public void dropStudent(String student)
   {
   for(int n=0; n<numberOfStudent; n++)
   {
   if(students[n]==student)
   {students[n]="";}
   }
       numberOfStudent--; 
   }
   
   public String[] getStudent()
   {return students;}
   
   public int getNumberOfStudent()
   {return numberOfStudent;}
}
