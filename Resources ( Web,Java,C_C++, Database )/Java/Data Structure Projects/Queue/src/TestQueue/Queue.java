package TestQueue;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;
/** Construct a queue with the default capacity 8 */
    public Queue() {
    this (DEFAULT_CAPACITY);
    }
/** Construct a queue with the specified maximum capacity */
    public Queue(int capacity) {
    elements = new int[capacity];
    }
    
    /** Push a new integer to the top of the stack */
    public void enqueue(int value) {
    if (size >= elements.length) {
    int[] temp = new int[elements.length * 2];
    System.arraycopy(elements, 0, temp, 0, elements.length);
    elements = temp;
    }
    elements[size++] = value;
    }
/** Return and remove the first element from the stack */    
   private int out ;
    public int dequeue() {  
        --size;
    return elements[out++];
}
/** Test whether the stack is empty */
    public boolean empty() {
    return size == 0;
    }
/** Return the number of elements in the stack */
    public int getSize() {
    return size;   
    }
}
