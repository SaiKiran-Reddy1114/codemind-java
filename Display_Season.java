import java.util.*;
public class Charm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=6 && n>=4)
        {
            System.out.print("Summer");
        }
        else if(n<=10 && n>=7)
        {
            System.out.print("Rainy");
        }
        else if(n>=10 && n<=12 ||n==1 )
        {
            System.out.print("Winter");
        }
        else if(n<=3 && n>=2)
        {
            System.out.print("Spring");
        }
        else
        {
            System.out.print("-1");
        }
    }
}