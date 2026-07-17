package dynamicArrayImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicArrayStack dynamicArrayStack = new DynamicArrayStack(1);


//    Inserting element
        dynamicArrayStack.push(10);
        dynamicArrayStack.push(20);
        dynamicArrayStack.push(30);
        dynamicArrayStack.push(40);
        dynamicArrayStack.push(50);
        dynamicArrayStack.push(10);
        dynamicArrayStack.push(20);
        dynamicArrayStack.push(30);
        dynamicArrayStack.push(40);
        dynamicArrayStack.push(50);

//        Print the stack
        System.out.println(dynamicArrayStack.toString());

//        Size Of stack
        System.out.println("Size of the stack: " + dynamicArrayStack.size());

//        Top Element of the stack
        System.out.println("Top element of the stack: "+ dynamicArrayStack.top());

//        Removing element
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());
        System.out.println("Removing the element: "+ dynamicArrayStack.pop());

//        Print the stack
        System.out.println(dynamicArrayStack.toString());

//        Size Of stack
        System.out.println("Size of the stack: " + dynamicArrayStack.size());

//        Top Element of the stack
        System.out.println("Top element of the stack: "+ dynamicArrayStack.top());

//       Inserting element
        dynamicArrayStack.push(10);
        dynamicArrayStack.push(20);
        dynamicArrayStack.push(30);
        dynamicArrayStack.push(40);
        dynamicArrayStack.push(50);

//        Print the stack
        System.out.println(dynamicArrayStack.toString());

//        Size Of stack
        System.out.println("Size of the stack: " + dynamicArrayStack.size());

//        Top Element of the stack
        System.out.println("Top element of the stack: "+ dynamicArrayStack.top());
    }
}
