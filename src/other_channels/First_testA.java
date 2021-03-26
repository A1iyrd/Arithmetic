package other_channels;

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
