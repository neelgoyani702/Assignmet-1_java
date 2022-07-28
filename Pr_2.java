import java.util.*;  
public class Pr_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();

        String answer = startOz(s);
        System.out.println(answer);
        sc.close();
    }

    public static String startOz(String a)
        {   
            String ans = "";
            if(a.charAt(0)=='o')
            ans=ans+'o';

            if(a.charAt(1)=='z')
            ans=ans+'z';

        return ans;
        }
    
}

