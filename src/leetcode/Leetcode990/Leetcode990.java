package leetcode.Leetcode990;
//990.等式方程的可满足性
// 给定一个由表示变量之间关系的字符串方程组成的数组，
// 每个字符串方程 equations[i] 的长度为 4，
// 并采用两种不同的形式之一："a==b" 或 "a!=b"。
// 在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
// 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 

//思路：这题是并查集
//一共只有 a-z 26个小写字母，初始化a-z为数组，parent[0]---parent[25]赋值0---25

//初始比较：parent[0]=0,parent[1]=1,parent[2]=2;
//a==b,b==c,a!=b
//a==b，a为parent[0]=0,b为parent[1]=1,
//a就变成了parent[0]=1,
//注意这里的1不是直接为b的值,而是parent[0]=[ [1] ](  [ [1] ]==[ 1 ] == 1  )的值。a的地盘变成b的
//     b==c                同样parent[1]=[ [2] ](  [ [2] ]==[ 2 ] == 2  )，b的地盘变成c的
//如果后边还有a!=b这个等式,那么就找a的实际值，为  parent[0]=[ [1] ] = [ 2 ] = 2, a的地盘是c的，
//                             找c的实际值，为  parent[2]=[ [2] ] = [ 2 ] = 2, c的地盘就是c自己的。
//本来a和b的老大都是c，但是这却有 a!=b 这个等式明显与我们的结论不符，自然返回false


public class Leetcode990 {
    public static void main(String[] args) {
        //"b==b","b==e","e==c","d!=e" t
        //"a==b","b!=c","c==a" f
        //"a==b","b!=a" f
        //"a!=a" f
        //"a!=b","b!=c","c!=a" t
        String[] string={"b==b","b==e","e==c","b!=e"};
        System.out.println(equationsPossible(string));
    }
    public static boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String str : equations) {
            if (str.charAt(1) == '=') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String str : equations) {
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public static int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
