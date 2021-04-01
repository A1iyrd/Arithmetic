package other_channels.First_testA;
// 有一个长阶梯，若每步上2阶，最后剩1阶；
// 若每步上3阶，最后剩2阶；若每步上5阶，最后剩4阶；
// 若每步上6阶，最后剩5阶；只有每步上7阶，最后刚好一阶也不剩。则台阶最少为多少阶？

//此题不再解释
public class First_testA {
    public static void main(String[] args) {
        int i=0;
        while(true){
            if(i%2==1&&i%3==2&&i%5==4&&i%6==5&&i%7==0)
                break;
            i++;
        }
        System.out.println(i);
    }
}
