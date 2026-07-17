package simpleArrayImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        FixedSizeArrayStack fixedSizeArrayStack = new FixedSizeArrayStack(10);


//        Push the elements
        fixedSizeArrayStack.push(10);
        fixedSizeArrayStack.push(15);
        fixedSizeArrayStack.push(20);
        fixedSizeArrayStack.push(25);
        fixedSizeArrayStack.push(30);
        fixedSizeArrayStack.push(35);

//        Print
        System.out.println(fixedSizeArrayStack.toString());

//        Pop
        System.out.println("Pop of the stack: "+ fixedSizeArrayStack.pop());

//        Top
        System.out.println("Top Element of the stack: "+ fixedSizeArrayStack.top());

//        Print
        System.out.println(fixedSizeArrayStack.toString());

        System.out.println("Size of the stack: "+fixedSizeArrayStack.size());
    }
}
