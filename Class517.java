/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismail Yesildirek
 */

/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
*/
import java.util.Scanner;

public class Class517
{
 public static void main(String[] args) 
    {
        System.out.println("Enter the number of lines between 1 and 15: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int i;
        int j;
        int k;
        int l; 
        int row = 1; //initial row number
        if (userInput >0 && userInput <=9) // check for number between 1 and 9
        {
        for (i=userInput;i>0;i--) // ensure we provide userInput # of rows for triangle = loop#1
        {
        for (j=0;j<=i*2-3;j++)    // print beginning space "_", start at 0  sub 3 to align numbers = Loop #2
        {
        System.out.print(" "); // could use double space "__" instead but switch j<i instead of j<i*2 in for loop #2.
        }
        for (j=row;j>=1;j--) //Loop #3 = start with count(max # in row) and decrease down to 1. print decreasing order left ot right.
        {
        System.out.print(j+" ");   
        }
        for (k=2;k<=row;k++)    //Loop #4 = increase value of j to show (+) mirror of loop 3. shift j to 2 to avoid duplication of "1".
        {
        System.out.print(k+" ");   
        }        
        System.out.println(); // go to next row.
        row ++; //increase value of count for next row.
        }
        }
                                                                                                                                                                              
        //-------------------------------------------------------------------------------------------------------
        else if (userInput >9 && userInput <=15) // check for number between 10 and 15
        {
        for (i=userInput;i>0;i--) // ensure we provide userInput # of rows for triangle = loop #1
        {  
        
        for (j=0;j<=(i*2-3);j++)    // print beginning space "_", start at 0  sub 3 to align numbers = Loop #2
        {
        if (row <10)
        {  
        System.out.print(" "); // could use double space "__" instead but switch j<i instead of j<i*2 in for loop #2.
        }
        else
        {
        System.out.print(" ");
        }    
        }
        for (k=row;k>=1;k--) //Loop #3 = start with count(max # in row) and decrease down to 1. print decreasing order left ot right.
        {
        System.out.print(k+" ");   
        }
        for (l=2;l<=row;l++)    //Loop #4 = increase value of j to show (+) mirror of loop 3. shift j to 2 to avoid duplication of "1".
        {
        System.out.print(l+" ");   
        }        
        System.out.println(); // go to next row.
        row ++; //increase value row for next loop.
        }   
                                                                                                                                                    
        }
        
        //---------------------------------------------------------------------------------------------------------------
        else 
        {
        System.out.println("Your number is not between 1 and 15");
        }    
    }    
}
