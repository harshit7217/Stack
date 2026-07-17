package dynamicArrayImplementation;

public class DynamicArrayStack {
//    Lenght of the array used to implement the stack
    protected int capacity;

//    Default array Capacity
    public static final int CAPACITY = 16;
    public static int MINCAPACITY = 1<<15;

//   Array used to implement the stack
    protected int[] stackRep;

//    Index of the top element of the stack in the array
    protected int top = -1;

//    Initialize the stack to use an array of default length
    public DynamicArrayStack(){
        this(CAPACITY);
    }

//    Initialize the stack to use an array of given length
    public DynamicArrayStack(int capacity){
        this.capacity = capacity;
        stackRep = new int[capacity];
    }

//    Returns the number of element in stack
    public int size(){
        return top + 1;
    }

//    Tester whether the stack is empty.
    public boolean isEmpty(){
        return top < 0;
    }

//    Insert the element at the top of the element
    public void push (int data){
        if(size() == capacity)
            expand();
        stackRep[++top] = data;
    }

    public void expand(){
        int length = size();
        int[] newstack = new int[length<<1];
        System.arraycopy(stackRep, 0, newstack, 0, length);
        stackRep = newstack;
        this.capacity = capacity<<1;
    }

//    dynamic array operation : shrinks to 1/2 if more than 3/4 empty
    private void shrink(){
        int length = top + 1;
        if(length < MINCAPACITY || top << 2 >= length)
            return;
        length = length + (top<<1);
        if(top < MINCAPACITY)
            length = MINCAPACITY;
        int[] newstack = new int[length];
        System.arraycopy(stackRep, 0, newstack, 0, top+1);
        stackRep = newstack;
        this.capacity = capacity<<1;
    }

//    Inspect the element at the top of the stack.
    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackRep[top];
    }

//    Remove the top element of the stack
    public int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("Stack is Empty");
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        shrink();
        return data;
    }

//    Return a string representation
    public String toString() {
        String s;
        s = "[";
        if(size() > 0)
            s = s +  stackRep[0];
        if(size() > 1){
            for(int i=1; i<size(); i++){
                s += ", " + stackRep[i];
            }
        }
        return s + "]";
    }
}
