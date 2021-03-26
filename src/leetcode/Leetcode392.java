package leetcode;

public class Leetcode392 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(s.charAt(2));
        System.out.println(isSubsequence("bcd","uuuuubcd"));
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(t.length()==j)
                break;
            for (;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    count++;
                    j++;
                    break;
                }
            }
        }
        if(count==s.length())
            return true;
        return false;
    }
}
