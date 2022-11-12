/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

/**
* Name: Sheena P. Aceno
* Section: IT Dept
* Year: 4th Year
*/
import java.util.Scanner;
public class sheena {
    
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        int loop;
        int total = 0;
        
        System.out.print("Do you want to order?: [1-yes:2-no]: ");
        int want = order.nextInt();
        
            
        if(want == 1){
       System.out.println("--------Welcome to my store-----------");
        System.out.println("--List of foods:     Price"); 
        System.out.println("1. Oysters           150 php"); 
        System.out.println("2. Iberico ham       130 php"); 
        System.out.println("3. Wagyu beef        120 php"); 
        System.out.println("--List of drinks--"); 
        System.out.println("4. Orange Soda       50 php"); 
        System.out.println("5. Nestea            30 php"); 
        System.out.println("6. Lemon             50 php"); 
        System.out.println("--Snacks--"); 
        System.out.println("7. Potato Chips      30 php");
        System.out.println("8. Cheese Crackers   50php");   
        System.out.println("9. Tortilla Chips    70php");
        
            do{
            System.out.print("Please enter your order number: ");
            int orders = order.nextInt();
            switch(orders){
                case 1:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Oysters"+"\n"+"Quantity of order: "+quantity);
                    total += 150 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }
                case 2:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Iberico ham"+"\n"+"Quantity of order: "+quantity);
                    total += 130 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }
                case 3:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Wagyu beef"+"\n"+"Quantity of order: "+quantity);
                    total += 120 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }case 4:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Orange Soda"+"\n"+"Quantity of order: "+quantity);
                    total += 50 * quantity; 
                    System.out.println("Initial cost: "+total);
                    break;
                }case 5:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Nestea"+"\n"+"Quantity of order: "+quantity);
                    total += 30 * quantity;
                    break;
                }case 6:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Lemon"+"\n"+"Quantity of order: "+quantity);
                    total += 50 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }case 7:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Potato Chips"+"\n"+"Quantity of order: "+quantity);
                    total += 30 * quantity;
                    System.out.println("Initial cost: "+total);
                    
                    break;
                }case 8:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Cheese Crackers"+"\n"+"Quantity of order: "+quantity);
                    total += 50 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }case 9:{
                    System.out.print("Please enter order quantity: ");
                    int quantity = order.nextInt();
                    System.out.println("You ordered Tortilla Chips"+"\n"+"Quantity of order: "+quantity);
                    total += 70 * quantity;
                    System.out.println("Initial cost: "+total);
                    break;
                }
                default:{
                    System.out.println("Your order is not in option");
                }
                  
            }
            System.out.println("Would you like to order again?: ");
            System.out.println("[1-Yes:2-No]");
            int choice = order.nextInt();
            
            if(choice == 1){
                loop = 1;
            }
            else{
                loop = 0;
            }
             }while(loop == 1);
            
            System.out.println("Total Payment: "+total);
            System.out.println("Enter your cash: ");
            int num = order.nextInt();
             int change = num - total;
            System.out.println("Change: "+change);
        }
   
        else if(want == 2){
            
        }
        else{
            
            System.out.println("ERROR");
        }
       
    }
}
