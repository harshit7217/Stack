package problems;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(9);
        stack.push(11);
        stack.push(15);
        stack.push(13);

        System.out.println("Stack without sorted");
        System.out.println(stack.toString());

//        Sorting
        Stack<Integer> sortStack = sort(stack);
        System.out.println("Sorted Stack");
        System.out.println(sortStack.toString());

    }

    public static Stack<Integer> sort(Stack<Integer> stk){
        Stack<Integer> rstk = new Stack<>();
        while(!stk.isEmpty()){
            int tmp = stk.pop();
            while(!rstk.isEmpty() && rstk.peek() > tmp){
                stk.push(rstk.pop());
            }
            rstk.push(tmp);
        }
        return rstk;
    }
}
