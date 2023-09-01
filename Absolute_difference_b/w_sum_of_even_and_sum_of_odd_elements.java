import java.util.*;
public class Sowjanya{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,s=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                c+=arr[i];
            }
            else
            {
                s+=arr[i];
            }
        }
        System.out.print(Math.abs(s-c));
    }
}