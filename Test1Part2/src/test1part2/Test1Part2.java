
package test1part2;

import java.util.Scanner;
import java.util.ArrayList;

public class Test1Part2 
{
    
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int orderAmount = 0;
        int orderCount = 0;
        int customerOrder = 0;
        double total = 0;
        
        System.out.println("How many items do you wish to order? Enter a number from 1-10 please. ");
        orderAmount = input.nextInt();
       
        
        double [] orders = new double [10];
        double [] itemPrice = {4.25 , .15 , .05 , .10};
        String [] itemName = {"Box of Crayons" , "pencil" , "Paper" , "Eraser"};
        
        System.out.println("Choose what item you wish to order by entering a number from 1 to 4: ");
        while(orderCount < orderAmount)
        {
            
            printArray(itemName);
            
            customerOrder =input.nextInt();
            customerOrder = customerOrder -1;
            
            switch(customerOrder)
            {
                case 0:
                    orders[orderCount] = itemPrice[customerOrder];
                    break;
                    
                case 1:
                    orders[orderCount] = itemPrice[customerOrder];
                    break;
                    
                case 2:
                    orders[orderCount] = itemPrice[customerOrder];
                    break;
                    
                case 3:
                    orders[orderCount] = itemPrice[customerOrder];
                    break;
                case 4:
                    orderCount = orderAmount - 1;
                    break;
            }
            
            orderCount++;
        }
        
        for (int i = 0; i < orderCount ; i++ )
        {
            total = total + orders[i];
        }
        
        System.out.printf("%s%.2f%n", "The total for your cart will be: " , total);
        
    }
    
    public static void printArray(String itemName [])
    {
        for(int i = 0; i < itemName.length; i++)
        {
            System.out.printf("%d %s%n", i+1,  itemName[i]);
        }
    }
    
}
