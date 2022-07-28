import java.util.*;

public class Pr_4 {
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int d = array123(arr);

        if(d==1)
        System.out.println("true");

        if(d==0)
        System.out.println("false");
        sc.close();
    }

    public static int array123(int[] ar)
    {
        int c=0;

        for(int i=0 ;i < ar.length-2 ; i++)
        {
            if(ar[i]==1 )
            {
                if(ar[i+1]==2)
                {
                    if(ar[i+2]==3)
                    {
                        c=1;
                        break;
                    }
                }
            }
            else
            continue;
        }
        return c;
    }
}