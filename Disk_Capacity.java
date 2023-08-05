import java.util.Scanner;
public class Disk{
    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        int a,b,c,t;
        a=sn.nextInt();
        b=sn.nextInt();
        c=sn.nextInt();
        t=1024*a*b*c;
        System.out.println(t);
    }
}