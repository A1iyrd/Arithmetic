package leetcode;

public class Leetcode424 {
    public static void main(String[] args) {
        String s="ABBBAABAABBA";
        System.out.println(characterReplacement(s,4));
    }
    public static int characterReplacement(String s, int k) {
//        int len=s.length();
//        int start=0;
//        int end=0;
//        int result=0;
//        while(start<len){
//            int tk=k;
//            int curSum=0;
//            int tstart=1;
//            int mulStart=s.charAt(start);
//            while (tk>=0) {
//                if (end==len)
//                    break;
//                if ((mulStart ^ s.charAt(end)) != 0) {
//                    tk--;
//                    if (tk<0)
//                        break;
//                    if (tstart!=0){
//                        start=end;
//                        tstart--;
//                    }
//                }
//                curSum += mulStart;
//                end++;
//            }
//
//            if (end==len&&tk>0) {
//                if (start >= tk)
//                    result = Math.max(result, (curSum / mulStart) + tk);
//                else{
//                    if ((curSum / mulStart) + start > len)
//                        return len;
//                    result = Math.max(result, (curSum / mulStart) + start);
//                }
//            }
//            result=Math.max(result,curSum/mulStart);
//            if (end==len)
//                break;
//            if (end-curSum/mulStart-start==0)
//                start=end;
//            end=start;
//        }
//
//        return result;
        int res = 0;
        char[] c = s.toCharArray();
        int n = c.length;
        int[] cnt = new int[26];
        int max = 0; // 区间内的最大频次
        for(int i = 0, j = 0; i < n; ){
            cnt[c[i]-'A']++;
            max = Math.max(max, cnt[c[i]-'A']);
            if(i - j + 1 - max > k){
                cnt[c[j++]-'A']--;
            }
            res = Math.max(res, i - j + 1);
            i++;
        }
        return res;
    }
}
