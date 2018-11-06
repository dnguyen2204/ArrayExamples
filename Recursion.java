import java.util.Scanner;
public class Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOdds(n));
        System.out.println(sumEvens(n));


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
            //add n to itself x times}
    }
        
    public static int sumOdds(int n)//GOOD, sumEvens would be switch the things
    {
        if(n<=1)//1 is lowest odd, STOPPING CONDITION
        {
            return 1;//0
        }
        else if (n%2==1)//n%2==0, RECURSION IF ODD
        {
            return n+sumOdds(n-2);
        }
        else //if even, RECURSION IF EVEN
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
             return sumEvens(n-1);
        }
            
    }
    
    public static int sumEvensAndOdds(int n)
    {
        if (n<=2)
        {
            return n;
        }
        else
        {
            return n+sumEvensAndOdds(n-2);
        }
        
    }
}