package leetcode.Leetcode392;

//思路：字符串s比字符串t短，对字符串s从头开始对应字符串t，
//每找到一个相同字符计数+1，并从当前位置找下一个相同的字符，直到找到t字符串最后个字符
public class Leetcode392 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(s.charAt(2));
        System.out.println(isSubsequence("bcd","uuuuubcd"));
    }
    public static boolean isSubsequence(String s, String t) {
        int j=0;//位置标记
        int count=0;//相同字符计数
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
