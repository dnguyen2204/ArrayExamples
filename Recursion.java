import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<5; i++)
        {
        System.out.println("Type a number");
        int x = sc.nextInt();
        System.out.println("sumOdds(" + x +")= "+  sumOdds(x));
        }
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
    
    public static int multiply(int n)//this is essentially the count function
    {
        if(n==0)
        {
                return 0;
            }
            else
            {
                return 12+multiply(n-1);
                //multiplier+recursion
            }
            //return rooms*students, rooms=12, students=20
            //recursion is the thing above, where n=students, and multiplier=rooms
            //and recursion is calling itself
            //definition of multiplication of n*x
            //add n to itself x times
    }
    
    public static int exponent(int n)
    {
        if(n==0)
        {
                return 1;
            }
            else
            {
                return 5*exponent(n-1);
                //x is the multiplier here
                //this function returns n^x
            }
        }
        
    public static int sumOdds(int n)//GOOD, sumEvens would be switch the things
    {
        if(n<=1)//n<=0
        {
            return 1;//0
        }
        else if (n%2==1)//n%2==0
        {
            return n+sumOdds(n-2);
        }
        else //if even//if odd
        {
              return sumOdds(n-1);//does nothing except for make n an odd forever
        }
    }
}