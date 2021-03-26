package leetcode;
//424.替换后的最长重复字符
// 给你一个仅由大写英文字母组成的字符串，
// 你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。
// 在执行上述操作后，找到包含重复字母的最长子串的长度。
//注意：字符串长度 和 k 不会超过 104。

//输入：s = "ABAB", k = 2
//输出：4
//解释：用两个'A'替换为两个'B',反之亦然。

//输入：s = "AABABBA", k = 1
//输出：4
//解释：
//将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
//子串 "BBBB" 有最长重复字母, 答案为 4。

//此题为sliding window

//思路（我自己的）：假设字符串"ABBBAABAABBA"
//维护一个start值和end值。初始值为0。
//一开始start值找到A，往后找，只要找到与A不同，k值减1，直到k小于0时，
//用MAX函数比较result和end到start的距离，需考虑k还没减完的情况
//用tk标记第一个不同的位置，start=tk，end=start，继续往后找。直到start>=字符串长度
public class Leetcode424 {
    public static void main(String[] args) {
        String s="ABBBAABAABBA";
        System.out.println(characterReplacement_my(s,4));
        System.out.println(characterReplacement(s,4));
    }
    public static int characterReplacement_my(String s, int k) {
        int len=s.length();
        int start=0;
        int end=0;
        int result=0;
        while(start<len){
            int tk=k;
            int curSum=0;
            int tstart=1;
            int mulStart=s.charAt(start);
            while (tk>=0) {
                if (end==len)
                    break;
                if ((mulStart ^ s.charAt(end)) != 0) {
                    tk--;
                    if (tk<0)
                        break;
                    if (tstart!=0){
                        start=end;
                        tstart--;
                    }
                }
                curSum += mulStart;
                end++;
            }

            if (end==len&&tk>0) {
                if (start >= tk)
                    result = Math.max(result, (curSum / mulStart) + tk);
                else{
                    if ((curSum / mulStart) + start > len)
                        return len;
                    result = Math.max(result, (curSum / mulStart) + start);
                }
            }
            result=Math.max(result,curSum/mulStart);
            if (end==len)
                break;
            if (end-curSum/mulStart-start==0)
                start=end;
            end=start;
        }

        return result;
    }
    public static int characterReplacement(String s, int k) {
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
