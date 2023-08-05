import java.util.Scanner;
public class Hand{
    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        int a,b;
        a=sn.nextInt();
        b=a*(a-1);
        System.out.println(b/2);
    }
}