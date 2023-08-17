import java.util.*;
public class Kiran{
    public static void main(String[] pandii)
    {
        Scanner n=new Scanner (System.in);
        int a,b,c,i;
        a=n.nextInt();
        b=n.nextInt();
        c=n.nextInt();
        if(b<=a)
        {
            System.out.println("-1");
        }
        else
        {
            b=b-a;
            i=(c/b)+1;
            System.out.println(i);
        }
    }
}