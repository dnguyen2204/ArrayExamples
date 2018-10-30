import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an integer");
        int x = sc.nextInt();
        int answer = factorial2(x);
        System.out.println(answer);
    }
    //definition of FACTORIAL    n*(n-1)*(n-2)*...*1 OR  
    //n!= n*(n-1)!
    public static int factorial(int n)
    {
        //System.out.println(n);//prints
        if(n>1)
        {
                return n*factorial(n-1);
        }
        return n;
    }
       
    
    //rephrased
    public static int factorial2(int n)
    {
            if(n<=1)//stopping condition is important
            {
                    return n;
            }
            else//recursion
            {
                return n*factorial2(n-1);
            }
    }
}