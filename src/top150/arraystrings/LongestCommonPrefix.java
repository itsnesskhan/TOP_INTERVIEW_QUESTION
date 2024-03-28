package top150.arraystrings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i=0;i<Math.min(first.length, last.length);i++){
            if (first[i]!=last[i])
                return builder.toString();
            builder.append(first[i]);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String[] strs= {"flower","flow","flight"};
        System.out.println("LONGEST COMMON PREFIX IS : "+longestCommonPrefix(strs));
    }
}
