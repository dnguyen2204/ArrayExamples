/*
 * Example for Arrays
 */
import java.lang.Math;
import java.util.Scanner;

class Main
{
    /*
     * This one will have public static void main
     */
    
    public static void main( String[] args)
    {

        /*
         * SET UP
         * We are going to ask the user to input an integer 
         * and we will call it
                              n
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" Please type in an integer :");
        int n = s.nextInt();
        
        
        /*
         * Task 1.  Create an array of integers from 0 to n-1
         *          call this array ar1.  Print it out below.
         */
        int[] ar1 = new int[n];
        System.out.println("\n*** PRINTING ar1 -- Task 1 *");
        for (int i=0; i<ar1.length; i++)//makes ar1
        {
            ar1[i] = i;
        }
        
        
        for (int i=0; i<ar1.length; i++)//prints ar1
        {            
            System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
        
                       
        /*
         * Task 2.  Create a new array called ar2.
         *          Copy the elements of ar1 into ar2.
         */
        System.out.println("\n*** PRINTING ar2 -- Task 2*");
        int[] ar2 = new int[ar1.length];
        //use ar2=ar1.clone() or for loop (creates 2 arrays), not ar2=ar1 (only one array)
        //because pointer variables
        for (int i=0; i<ar1.length; i++)//makes  and prints ar2
        {
            ar2[i] = ar1[i];
            System.out.println("ar2[" + i + "]= " + ar2[i]);
        }
        
        
        
        /* 
         * Task 3. Add 1 to each element in ar1.  Print it out below
         */
        System.out.println("\n*** PRINTING ar1 +1 -- Task 3*");
        for (int i=0; i<ar1.length; i++)//prints ar1 with the elements increased by 1
        {
            ar1[i]= ar1[i]+1;
            System.out.println("ar1[" + i + "]= " + ar1[i]);
        }
        

        
        
        /*
         * task 4. Create a new array called ar3.
         *         Copy the elements of ar1 into ar3.  Then do it again
         *         For example
         *         ar1: 1 2 3
         *         ar3: 1 2 3 1 2 3
         */
        int[] ar3 = new int[ar1.length*2];
        System.out.println("\n*** PRINTING ar3 -- Task 4*");
        for (int i=0; i<ar1.length; i++)//makes ar3
        {
            ar3[i] = ar1[i];//makes first half of ar3
            ar3[ar1.length +i] = ar1[i];//makes second half of ar3
        }

        for (int i=0; i<ar3.length; i++)//prints ar3
        {            
            System.out.println("ar3[" + i + "]= " + ar3[i]);//prints "ar3[i] ="  ar3[i]
        }
        
        
        /*
         * Task 5.  Switch the first and last element of ar1.
         *          print out the new ar1.  Then switch them back
         */
        int temp;
        //SWITCHING
        temp = ar1[ar1.length-1];//assigns the last value of ar1 to temp
        ar1[ar1.length-1] = ar1[0];// the last value of ar1 is now equivalent to the first value
        ar1[0] = temp;//the first value of ar1 is now the previous last value
        
        
        System.out.println("\n*** PRINTING SWITCHED ar1 -- Task 5*");
        
        for (int i=0; i<ar1.length; i++)//prints ar1
        {            
            System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
        
        //UNSWITCHING
        temp = ar1[ar1.length-1];//assigns the last value of ar1 to temp
        ar1[ar1.length-1] = ar1[0];// the last value of ar1 is now equivalent to the first value
        ar1[0] = temp;//the first value of ar1 is now the previous last value
        
        /*
         * Task 6A. Print the 2nd to (n-1)th elements of ar1
         * Task 6B: Print out just the odd numbers in ar1
         * Task 6C: Print out the elements of ar1 when
         *          the indices are multiples of 3
         *         
         */
        System.out.println("\n*** PRINTING ar1 from 2nd to n-1th -- Task 6A*");
        for (int i=1; i<ar1.length-1; i++)//prints ar1
        {            
            System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
        
        System.out.println("\n*** PRINTING ar1 odd numbers -- Task 6B*");
        //odd numbers are even indices
        //I could just put an if statement to check the value
        for (int i=0; i<ar1.length; i+=1)//prints ar1
        {            
            if (ar1[i]%2==1)
                System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
        
        
        System.out.println("\n*** PRINTING ar1 indices multiple of 3 -- Task 6C*");
        for (int i=0; i<ar1.length; i+=1)//prints ar1
        {            
            if (i%3==0)
                System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
        /*
         * Task 7.  For each element in ar1, 
         *          If the element is even: leave alone
         *          if the element is odd, multiply by 10
         *          print out the new ar1
         *          Example
         *          ar1[0]=10
         *          ar11]=2
         *          ar1[2]=30
         *          ar1[3]=4
         */
        System.out.println("\n*** PRINTING ar1 if odd * 10 -- Task 7*");
        for (int i=0; i<ar1.length; i++)
        {
            if (ar1[i]%2==1)
            {
                ar1[i] = ar1[i]*10;
            }
        }
        for (int i=0; i<ar1.length; i++)//prints ar1
        {            
            System.out.println("ar1[" + i + "]= " + ar1[i]);//prints "ar1[i] ="  ar1[i]
        }
         /*
          * Task 8
          *    Create an array called ar2odds
          *    If the index of ar2 is odd, copy it to ar2odds.
          *    If not, do not
          *    ar2[0]=0
          *    ar2[1]=1  ->  ar2odds[0]=1
          *    ar2[2]=2
          *    ar2[3]=3  ->  ar2odds[1]=3
          */
        //you could use separate variable that counts only under certain condition
        System.out.println("\n*** PRINTING ar2odds -- Task 8*");
        //NOTE: THIS CODE ONLY SITUATIONALLY WORKS
        int[] ar2odds = new int[ar2.length/2];
        
        for (int i =0; i<ar2.length; i++)
        {
            if (i%2==1) // if indices are odd
            {
                ar2odds[i/2] = ar2[i];//the i/2 works because java math
            }
        }
        for (int i=0; i<ar2odds.length; i++)//prints ar2odds
        {            
            System.out.println("ar2odds[" + i + "]= " + ar2odds[i]);
        }
         
        /*
         * Task 9. In the array ar2, count how many odd numbers you
         * have.  Then create an ew array called ar4.  Copy just the odd
         * numbers from ar2 into ar4.  Print ar4
         */
        
        System.out.println("\n*** PRINTING ar4-- Task 9*");
        int count=0;
        //this is int k==0; place
        for (int i=0; i<ar2.length; i++)//counts odd numbers in ar2
        {
            if (ar2[i]%2==1)
            {
                count+=1;
            }
        }
        int[] ar4 = new int[count];
        for (int i=0; i<ar2.length; i++)//copies odd numbers
        {
            if (ar2[i]%2==1)
            {
                ar4[i/2]= ar2[i];//again, the i/2 works only bc java math
                //also this i/2 only works situationally
                //this is the place where you would want to do k++
            }
        }
        
        for (int i=0; i<ar2odds.length; i++)//prints ar4
        {            
            System.out.println("ar4[" + i + "]= " + ar4[i]);
        }
        /*
         * Task 10.  Shift the elements of ar4 right by 1
         * For example
         * old   ar4: 1 3 5 7 9
         * new   ar4  9 1 3 5 7
         */
        //(new) ar4[i]= (old) ar4[i-1]
        //work: 9 1 3 5 7
        //repeatedly switch the 9 one to the left
        //repeatedly swtich the last number one to the left
        
        
        
        
        System.out.println("\n*** PRINTING ar4 shifted right by 1-- Task 10*");
        
        
        /*
         * assume array [x, y]
         * how to switch
          int temp = array[y];
          array[y] = array[x];
          array[x] = temp;
         * to put y into x
         * in this example [1, 3, 5] --> [5, 1, 3]
         * want to put ar[1] into ar[2]
         * ar[i] into ar[i+1]
         * y = ar[i]
         * x= ar[i+1]
         * 
         */
        int value;
        for (int i=ar4.length-1; i>0; i--)
        //has to be >0 or else array index out of bounds
        //this for loop goes from the last number and iterates down
        //runs ar4.length-1 times, which means it iterates thru the whole array
        //is there a way to do this and with for(int i=0; i<ar4.length; i++)?
        {
            //switches the last number with the one before it
            //1 3 5 
            //1 5 3
            //5 1 3
            //notice the diagnol line of 5
            value = ar4[i];
            ar4[i] = ar4[i-1];
            ar4[i-1] = value;
            
            
        }
        
        for (int i=0; i<ar2odds.length; i++)//prints ar4 shifted right by 1
        {            
            System.out.println("ar4[" + i + "]= " + ar4[i]);
        }
        /*
         * Task 11.  Reverse the order of elements in ar2
         * 0 1 2 3
         * 3 2 1 0
         */
        //can create new array and iterate thru ar2 backwards, adding the elements to newar2
        //then can clone newar2 into ar2
        //I want to do it thru the same array
        //each element switches with the element on the other side of the middle
        //array can either be length even or odd, which screws up middle
        //yeah, screw this i'm doing this the easy way
        
        System.out.println("\n*** PRINTING ar2 reversed-- Task 11*");
        int[] newar2 = new int[ar2.length];
        int k = 0;
        for (int i=ar2.length-1; i>0; i--)//iterates thru ar2 backwards
        {
            newar2[k] = ar2[i];//assigns to newar2
            k++;
        }
        for (int i=0; i<ar2.length; i++)//copies newar2 into ar2 since it says to change ar2
        {
            ar2[i] = newar2[i];
        }
        for (int i=0; i<ar2.length; i++)//prints ar2 reversed
        {            
            System.out.println("ar2[" + i + "]= " + ar2[i]);
        }
        
        /*
         * Task 12: 
         * Create an array of Strings called ar5.
         * 
         * Each element is a word of the following phrase
         * 
         * 
         * Four score and seven years ago our fathers brought forth on
         * this continent a new nation
         *
         *. ar5[0] = "Four"
         *  ar5[1] = "score"
         *  
         *  Create another array of ints called ar6.  Write a for loop that
         *  will iterate through each element in ar5 and the length of the
         *  word is the element in ar6.
         *  
         *  ar5[0]= "Four"   ar6[0]=4
         *  ar5[1]="score"   ar6[1]=5
         *  ar5[2]="and"     ar6[2]=3
         *  
         *  Count how many words have more than 5 letters.
         */
        System.out.println("\n*** PRINTING words with >5 letters-- Task 12*");
        
        String[] ar5 = {"Four", "score", "and", "seven", "year", "ago", "our", "fathers",
            "brought", "forth", "on", "this", "continent", "a", "new", "nation"};
        
        int[] ar6 = new int[ar5.length];//[0, 0, 0, ..., 0]
        count = 0;//count was already created
        String word;
        for (int i=0; i<ar5.length; i++)
        {
            word = ar5[i];//ar5[i] is a String
            ar6[i] = word.length();//.length() is for strings, word is a String, word.length() is an int
        }
        for (int i=0; i<ar6.length; i++)
        {
            if(ar6[i]>5)
            {
                count++;
            }
        }
        System.out.println(count + " words have more than 5 letters.");
        /*
         * Task 13
         * Create an array called monsterArray of 5 Monsters.
         * The name of the monsters are
         * "Cookie"
         * "Grover"
         * "Oscar the Grouch"
         * "Elmo"
         * "Rosita"
         * 
         * Print out their names
         * Use a for loop to print out the names of monster that start with
         * a vowel
         */
        System.out.println("\n*** PRINTING monsterArray names-- Task 13*");
        String[] monsterArray = {"Cookie", "Grover", "Oscar the Grouch", "Elmo", "Rosita"};
        for (int i=0; i<monsterArray.length; i++)
        {
            System.out.println("monsterArray[" + i + "]= " + monsterArray[i]);
        }
        
        System.out.println("\n*** PRINTING monsterArray vowel start names-- Task 13*");
        String thisMonster;
        char startLetter;
        for (int i=0; i<monsterArray.length; i++)
        {
            thisMonster = monsterArray[i];
            startLetter = thisMonster.charAt(0);
            //this is in chars because == doesn't work with strings
            if (startLetter=='A' || startLetter=='E' || startLetter=='I'
                || startLetter=='O' || startLetter=='U')//checks vowel
                {
                        System.out.println(thisMonster);//prints if vowel
                }
                /*  DEBUGGING TOOL
                else
                {
                    System.out.println("No vowel.");
                }
                */
        }
        
         /*
          * Task 14
          * Create an array of integers from 3 to 94 and call it arx
          * Create an array of the indices of arx when the item is
          * divisible by 3.  Call this arindex
          *      arx[0]=94
          *      arx[1]=95
          *      arx[2]=96 // this is divisible.  Index is 2
          *      arx[3]=97
          *      arx[4]=98
          *      arx[5]=99 // this is divisible  Index is 5
          *      
          *      So arindex[0]=2
          *         arindex[1]=5
          */
        System.out.println("\n*** PRINTING arindex-- Task 14*");
        int[] arx = new int[92];
        k=3; // k was created earlier 
        for (int i=0; i<arx.length; i++)//makes arx, an array of integers from 3 to 94
        {
            arx[i] = k;
            k++;
        }

        count=0; //count was already created
        int j=0;//to be used as a seprate index
        for (int i=0; i<arx.length; i++)//counts the length to be used for arindex
        {
            if (arx[i]%3==0)
            {
                count++;
            }
        }
        int[] arindex = new int[count];
        for (int i=0; i<arx.length; i++)//adds the indexes in which the element is divisible by 3
        {
            if (arx[i]%3==0)
            {
                arindex[j] = i;
                j++;
            }
        }
        for (int i=0; i<arindex.length; i++)
        {
            System.out.println("arindex[" + i + "]= " + arindex[i]);
        }
         /*
          * Create an arrary called "fb" and calculate the
          * first 10 fibonacci sequence.  You start with
          * fb[0]=1
          * fb[1]=1
          * fb[2]=fb[0]+fb[1]
          * fb[3]=fb[1]+fb[2]
          * fb[4]=fb[2]+fb[3]
          */
        System.out.println("\n*** PRINTING Fibonacci-- Task 15*");
        int[] fb = new int[10];
        fb[0]= 1;
        fb[1]=1;
        for (int i=2; i<fb.length; i++)
        {
            fb[i] = fb[i-1] + fb[i-2];
        }
        for (int i=0; i<fb.length; i++)
        {
            System.out.println("fb[" + i + "]= " + fb[i]); 
        }
        
        
        //let's try to make a quicksort
        System.out.println("What size array do you want to sort?");
        int x = s.nextInt();
        int[] sortThis = new int[x];
        for (int i=0; i<sortThis.length; i++)
        {
            sortThis[i] = (int) (100*Math.random()) +1;//random numbers from 1 to 100
        }
        int[] partition = new int[10];//idk what to put in here
        int partIndex =0;
        for (int i=sortThis.length; i>16; i/=2)//makes partitions
        {
            partition[partIndex]+=i;
            partIndex++;
        }
        //make an insertion sort to use in quicksort
        partIndex=0;
        for (int i=0; i<partition[partIndex]; i++)
        {
            
        }
        /*
        int[] array = {0, 1};
        
        double[] array1 = {0.0, 1.1};
        
        String[] array2 = {"aaa", "bbb"};
        
        char[] array3 = {'a', 'b'};
        */
    }
}