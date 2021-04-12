package other_channels.Third_testA;

public class Third_testA {
    public static void main(String[] args) {
        int count=0;
        int start=1;
        for (int y=1900;y<=2000;y++){
            for(int m=1;m<=12;m++) {
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                    start += 31;
                }
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    start += 30;
                }
                if (rn(y)) {
                    if (m==2)
                        start+=29;
                }
                else {
                    if (m==2)
                        start+=28;
                }
                if (start%7==0){
                    count++;
                    System.out.println(y+"  "+ (m+1)+"  "+ 1);
                }
                start=start%7;
            }
        }
        System.out.println(count);
    }
    public static boolean rn(int year){
        if (year%4==0&&year%100!=0)
            return true;
        else if(year%400==0)
            return true;
        else return false;
    }
}
