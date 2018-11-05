import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(sumOdds(9));
        System.out.println(sumEvens(8));
    }
    //definition of FACTORIAL    n*(n-1)*(n-2)*...*1 OR  
    //n!= n*(n-1)!

    
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
        
    public static int sumOdds(int n)//GOOD, sumEvens would be switch the things
    {
        if(n<=1)//1 is lowest odd
        {
            return 1;//0
        }
        else if (n%2==1)//n%2==0
        {
            return n+sumOdds(n-2);
        }
        else //if even
        {
              return sumOdds(n-1);//does nothing except for make n an odd forever
        }
    }
    
    public static int sumEvens(int n)
    {
        if (n<=2)//2 is lowest even
        {
                return 2;
        }
        else if (n%2==0)
        {
           return n+sumEvens(n-2);
        }
        else
        {
             return sumOdds(n-1);
        }
            
    }
}