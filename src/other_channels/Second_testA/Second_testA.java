package other_channels.Second_testA;

//有一类自然数，从左往右的第三个数字开始，每个数字都恰好是它左边两个数字之和，
//直至不能再写为止，如257,1459等，这类数一共有几个。

//思路1：dfs 九叉树，>9减支

//思路2：排列组合，{x+y<=9,x>=1,y>=0}
// =>让a=x , b=y+1 , ∴{a+b<=10,a>=1,b>=1}
// =>加入松弛变量 z=> {a+b+z=10,a>=1,b>=1,z>=0}
// =>让c=z+1 , ∴{a+b+c=11,a>=1,b>=1,c>=1}
//所以相当于在10个空中插两块板,也就是C 2↑ 10↓=45
public class Second_testA {
    public static void main(String[] args) {
        int result=0;
        for (int i=1;i<10;i++){
            for (int j=0;j<9;j++){
                result+=DFS(i,j);
            }
        }
        System.out.println(result);
    }
    public static int DFS(int i,int j){
        int result=1;
        if (i+j>9)
            return 0;
        DFS(j,i+j);
        return result;
    }
}
