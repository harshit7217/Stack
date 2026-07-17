package simpleArrayImplementation;

public class FixedSizeArrayStack {
//    Length of the array used to implementation of stack
    protected int capacity;

//    Default array capacity
    public static final int CAPACITY = 10;

//    Array used to implement stack
    protected int[] stackRep;

//    Index of the top element of the stack in the array
    protected int top = -1;

//    Initialize the stack to use an array of given length
    public FixedSizeArrayStack() {
        this(CAPACITY);
    }

//    Initialize the stack to use an array of given length
    public FixedSizeArrayStack(int capacity){
        this.capacity = capacity;
        stackRep = new int[capacity];
    }

//    Return the number of element in the stack. This method runs in O(1) time.
    public int size(){
        return (top + 1);
    }

//    Test whether the stack is empty.This method runs in O(1) time.
    public boolean isEmpty(){
        return top<0;
    }

//    Insert the element at the top of the stack
    public void push(int data) throws Exception{
        if(size() == capacity)
            throw new Exception("Stack is Full");
        stackRep[++top] = data;
    }

//    Inspect the element at the top of the stack.
    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty.");
        return stackRep[top];
    }

//    Removing the top element from the stack.
    public int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("Stack is Empty");
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

//    Returns a string representation of the stack as a list of elements whith the top element at the end [..., prev, top]
    public String toString(){
        String s;
        s = "[";
        if(size() > 0)
            s += stackRep[0];

        if(size() > 1){
            for(int i=1; i< size(); i++){
                s += ", " + stackRep[i];
            }
        }
        return s + "]";
    }
}
