package main;
import java.util.*;

public class PQueue {
   
    public static void main(String[] args) {
    System.out.println("Student name: Quang Trung Trinh\n\n"+ "Student id: n01237291\n");
    
    // Create 2 arrays of string for the 1st and 2nd set of name: 
        String[] list1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"} ; 
        String[] list2 = {"George", "Katherine", "Kevin", "Michelle", "Ryan"}; 
        
    // Create 2 arrayList from 2 list of name:
        ArrayList<String> arrayList1 = new ArrayList(Arrays.asList(list1)); 
        ArrayList<String> arrayList2 = new ArrayList(Arrays.asList(list2));
    
    
    // Create 2 PriorityQueue: 
        PriorityQueue queue1 = new PriorityQueue(); 
        PriorityQueue queue2 = new PriorityQueue();
    // Assign content of 2 arrayList to 2 PriorityQueue:
        queue1.addAll(arrayList1); 
        queue2.addAll(arrayList2); 
       
    // PriorityQueue to store intersection of queue1 and queue2: 
        PriorityQueue intersection = new PriorityQueue();
        intersection = findIntersection(queue1, queue2); 
        
        // Print out the intersection, union and different: 
        System.out.println("Intersection are: " + intersection);
        System.out.println("");
        System.out.println("Union are: "+findUnion(queue1, queue2, intersection));
        System.out.println("");
        System.out.println("Different of queue1 to queue2 are: "+findDifferent(queue1, intersection));
        System.out.println("");
        System.out.println("Different of queue2 to queue1 are: "+findDifferent(queue2, intersection));
        System.out.println("");
    }
    
    
   /* METHODS FOR FINDING INTERSECTION, UNION and DIFFERENTATION */
    
    // METHOD TO FIND THE INTERSECTION
    static PriorityQueue findIntersection(PriorityQueue queue1, PriorityQueue queue2)
    {
    // create a Priority q1 to clone the content of queue1
    PriorityQueue q1 = new PriorityQueue(); 
    q1.addAll(queue1); 
    // Find the Intersection of queue1 and queue2 by clone version of queue1
    q1.retainAll(queue2); 
    return q1; 
    }
    
    // METHOD TO FIND THE UNION
    static PriorityQueue findUnion(PriorityQueue queue1,PriorityQueue queue2, PriorityQueue intersection)
    {
    // Create q as a clone of queue1
    PriorityQueue q = new PriorityQueue();  
    q.addAll(queue1); 
    // Create intersect as a clone of intersection
    PriorityQueue intersect = new PriorityQueue();
    intersect.addAll(intersection); 
    
    // Remove the intersection names from the clone version of queue1
    while(!intersect.isEmpty())
    {
    q.remove(intersect.poll());
    }  
    
    // Add the content of queue2 to q to get the union
    q.addAll(queue2); 
    return q; 
    }
    
    // METHOD TO FIND THE DIFFERENT
    static PriorityQueue findDifferent(PriorityQueue queue1,PriorityQueue intersection)
    {
     // Create q as a clone of queue1
    PriorityQueue q = new PriorityQueue();  
    q.addAll(queue1);
    // Create intersect as a clone of intersection
    PriorityQueue intersect = new PriorityQueue();
    intersect.addAll(intersection); 
    
    // Remove the intersection names from the clone version to get the different
    while(!intersect.isEmpty())
    {
    q.remove(intersect.poll());
    }  
  return q;   
  }
}