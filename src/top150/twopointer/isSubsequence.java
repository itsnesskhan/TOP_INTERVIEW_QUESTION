package top150.twopointer;

public class isSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int idx = 0;
        for (int i=0;i<s.length();i++){
            idx = t.indexOf(s.charAt(i), idx);
            if (idx==-1) return false;
            idx++;
        }
        return true;
    }
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "acb";
        String s1 = "aaaaaa";
        String t1 = "bbaaaa";
        System.out.println(isSubsequence(s,t));
        System.out.println(isSubsequence(s1,t1));
    }
}
