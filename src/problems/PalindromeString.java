package problems;

import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
//        String str = "ababXbaba";
//        System.out.println(isPalindrome(str));

//        Using Linked List
//        Creating a linked list
        insertElementsInLinkedList();
        System.out.println(isPalindromeLinkedList());

    }
//With out stack
    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        return i<j ? false : true;
    }

//    Using Linked List
    private static ListNode head;
//    Creating Linked List
    public static void insertElementsInLinkedList() {
        ListNode n1 = new ListNode('a');
        ListNode n2 = new ListNode('b');
        ListNode n3 = new ListNode('a');
        ListNode n4 = new ListNode('X');
        ListNode n5 = new ListNode('a');
        ListNode n6 = new ListNode('b');
        ListNode n7 = new ListNode('a');

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
    }

    public static boolean isPalindromeLinkedList(){
//        Finding a mid of the linked list
        ListNode curr = head;
        ListNode mid = head;
        while(curr != null && curr.next != null){
            curr = curr.next.next;
            mid = mid.next;
        }

//        After mid-store in a linked list into stack
        Stack<Character> stack = new Stack<>();

        while(mid != null){
            stack.push(mid.data);
            mid = mid.next;
        }

//        Check starting list to ending list
        curr = head;

        while(curr != null && !stack.isEmpty() && curr.data == stack.peek()){
            curr = curr.next;
            stack.pop();
        }

        return stack.isEmpty();
    }
}
