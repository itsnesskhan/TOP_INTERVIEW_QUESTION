package top150.arraystrings;

import java.util.Arrays;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
//        String[] split = s.split("\\s");
//         \s+ which matches one or more whitespace characters.
//         This will ensure that consecutive whitespace characters are treated as a single delimiter
        String[] split = s.split("\\s+");
        System.out.println(Arrays.toString(split));
        for (int i=split.length-1;i>=0;i--){

            String trim = split[i].trim();
            builder.append(trim);
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        String str =  "the sky is blue";
        String str2 = "a good   example";
        System.out.println(reverseWords(str));
        System.out.println(reverseWords(str2));
    }
}
