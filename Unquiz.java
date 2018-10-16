public class Unquiz
{
     public static void main(String[] args)
     {
         //int[] array = {-1, -2, -3, 4, 5, -6};//should return 3, does
         //int[] array = {0,1,2,3,4,5,6};//should return 1, does 
         int[] array = {-1,-2,-3,-4,-5,-6};//should return nothing, gives error
         
         int i = 0; 
    while (array[i] <=0) 
    { 
        i++; 
    } 
    int location = i;
    System.out.println(location);
     }
     
     
     
     
     
     
     
    
        
        
}
