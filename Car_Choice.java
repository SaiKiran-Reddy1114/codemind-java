import java.util.*;
public class Charm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            float x1,x2,y1,y2;
            x1=sc.nextFloat();
            x2=sc.nextFloat();
            y1=sc.nextFloat();
            y2=sc.nextFloat();
            double e,f;
            e=y1/x1;
            f=y2/x2;
            if(e<f)
            {
                System.out.println("-1");
            }
            else if(e>f)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}