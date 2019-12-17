package TestQueue;

public class Lab5part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue stack = new Queue();
    
    for (int i = 1; i < 21; i++)
      stack.enqueue(i);
    
    while (!stack.empty())
      System.out.print(stack.dequeue() + " ");
    }
    
}
