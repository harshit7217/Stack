package linkedListImplementation;

import java.util.EmptyStackException;

public class LinkedListStack {
    private int length;
    private LinkedList top;

//    Constructor create an empty stack
    public LinkedListStack(){
        length = 0;
        top = null;
    }

//    Adds specified data to the top of this stack
    public void push(int data){
        LinkedList temp = new LinkedList(data);
        temp.next = top;
        top = temp;
        length++;
    }

//    Removing the top element.
    public int pop()throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

//    Check whether the stack is empty
    public boolean isEmpty(){
        return (length == 0);
    }

//    Return the top element of the stack
    public int peek() throws Exception{
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

//    Size of the stack
    public int size(){
        return length;
    }

//    String
    public String toString(){
        LinkedList temp = top;
        String s;
        s = "[";
        if(length > 0){
            s += temp.data;
            temp = temp.next;
        }
        if(length > 1){
            for(int i=1; i<length; i++){
                s += ", " + temp.data;
                temp = temp.next;
            }
        }
        return s + "]";
    }
}
