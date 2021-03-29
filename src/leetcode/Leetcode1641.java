package leetcode;

public class Leetcode1641 {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(33));
    }
    public static int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1;
        for (int j=1;j<n;j++){
            a=a+e+i+o+u;
            e=e+i+o+u;
            i=i+o+u;
            o=o+u;
            u=u;
        }
        return a+e+i+o+u;
    }
}
