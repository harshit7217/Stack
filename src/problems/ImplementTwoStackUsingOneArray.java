package problems;

import java.util.EmptyStackException;

public class ImplementTwoStackUsingOneArray {
    public static void main(String[] args) {
        ImplementTwoStackUsingOneArray implementTwoStackUsingOneArray = new ImplementTwoStackUsingOneArray(7);
        for(int i=1; i<=2; i++){
            implementTwoStackUsingOneArray.push(1, i);
        }
        for(int i=4; i<=7; i++){
            implementTwoStackUsingOneArray.push(2, i);
        }

        for(int i=0; i<implementTwoStackUsingOneArray.arr.length -1; i++){
            System.out.print(implementTwoStackUsingOneArray.arr[i]+" ");
        }
    }

    private int[] arr;
    private int size, topOne, topTwo;

    public ImplementTwoStackUsingOneArray(int size){
        if(size < 2) throw new StackOverflowError("size < 2 is no permissible");
        arr = new int[size];
        this.size = size;
        topOne = -1;
        topTwo = size;
    }

    public void push(int stackId, int data){
        if(topTwo == topOne+1) throw new StackOverflowError("Array is full");
        if(stackId == 1){
            arr[++topOne] = data;
        }else if(stackId == 2){
            arr[--topTwo] = data;
        }else {
            return;
        }
    }

    public int pop(int stackId){
        if(stackId == 1){
            if(topOne == -1) throw new EmptyStackException();
            int temp = arr[topOne];
            arr[topOne--] = Integer.MIN_VALUE;
            return temp;
        }else if(stackId == 2){
            if(topTwo == size) throw new EmptyStackException();
            int temp = arr[topTwo];
            arr[topTwo++] = Integer.MIN_VALUE;
            return temp;
        }else {
            return Integer.MIN_VALUE;
        }
    }

    public int top(int stackId){
        if(stackId == 1){
            if(topOne == -1) throw new EmptyStackException();
            return arr[topOne];
        }else if(stackId == 2){
            if(topTwo == size) throw new EmptyStackException();
            return arr[topTwo];
        }else {
            return Integer.MIN_VALUE;
        }
    }

}
