package leetcode.Leetcode1143;

public class Leetcode1143 {
    public static void main(String[] args) {
        String text1="ace";
        String text2="abcde";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int tj=0;//位置标记
        int ti=0;
        int count=0;//相同字符计数
        int min=Math.min(text1.length(),text2.length());
        int max=Math.max(text1.length(),text2.length());
        while (ti<max) {
            for (int i = ti; i < max; i++) {

                for (int j = tj; j < min; j++) {
                    if (text1.length() == max)
                        if (text1.charAt(i) == text2.charAt(j)) {
                            count++;
                            tj = j;
                            break;
                        }
                    if (text2.length() == max)
                        if (text2.charAt(i) == text1.charAt(j)) {
                            count++;
                            tj = j;
                            break;
                        }
                }
            }
        }
        return count;
//        int result=0;
//
//
//            result=DFS(text1, text2, 0, 0);
//
//        return result;
    }
    public static int DFS(String text1,String text2,int i1,int i2){
        int result=1;
        if (i1>=text1.length()||i2>=text2.length())
            return 0;
        if (text1.charAt(i1)==text2.charAt(i2))
            result+=DFS(text1,text2,i1+1,i2+1);
        else if (text1.length()>text2.length())
            result=DFS(text1,text2,i1,i2+1);
        else  result=DFS(text1,text2,i1+1,i2);
        return result;
    }
}
