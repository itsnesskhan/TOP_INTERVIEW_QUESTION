package top150.twopointer;

import java.util.Arrays;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String string = builder.toString();
        System.out.println(string);
        String reverse = builder.reverse().toString();
        System.out.println(reverse);
        //builder don't have overridden equals method
        return string.equals(reverse);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "0P";
        String s2 = "a.";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}
