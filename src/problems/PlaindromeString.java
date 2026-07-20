package problems;

public class PlaindromeString {
    public static void main(String[] args) {
        String str = "ababXbaba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        return i<j ? false : true;
    }
}
