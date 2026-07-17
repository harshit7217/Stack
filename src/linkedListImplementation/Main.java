package linkedListImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
//        Creating object
        LinkedListStack linkedListStack = new LinkedListStack();

//        Creating element
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);

//        Print the stack
        System.out.println(linkedListStack.toString());

//        Removing
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());
        System.out.println("Removing the elements: "+ linkedListStack.pop());


    }
}
