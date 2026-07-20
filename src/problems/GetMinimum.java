package problems;

import java.util.Stack;

public class GetMinimum {
    protected static Stack<Integer> stack = new Stack<>();
    protected static Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        push(2);
        push(6);
        push(4);
        push(1);
        push(5);
        System.out.println(stack.toString());
        System.out.println(minStack.toString());

        System.out.println("Min Element: "+ getMinimum());

        System.out.println(pop());
        System.out.println(pop());

        System.out.println("min Element: "+ getMinimum());
    }
//     Space Complexity is too high
//    public static int pop(){
//        if(stack.isEmpty()) return Integer.MAX_VALUE;
//        minStack.pop();
//        return stack.pop();
//    }

//    Optimized Space Complexity
    private static int pop(){
        if(stack.isEmpty()) return Integer.MAX_VALUE;
        int minTop = minStack.peek();
        int elementTop = stack.peek();
        if(minTop == elementTop) minStack.pop();
        return stack.pop();
    }


    public static void push(int data){
        stack.push(data);
        if(minStack.isEmpty() || minStack.peek() >= data){
            minStack.push(data);
        }
    }

    public static int getMinimum(){
        return minStack.peek();
    }
}
