package other_channels.Third_testF;

public class Third_testF {
    public static void main(String[] args) {
        int x=1;
        int y=5;
        int result=x^y;
        int count=0;
        while (result>0){
            if (result%2==0){
                result>>=1;
                continue;
            }
            if ((x^0)==1){
                count++;
            }
            result>>=1;
        }
        System.out.println(count);
    }
}
