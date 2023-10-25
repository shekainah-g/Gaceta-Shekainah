import java.util.Scanner;

public class ActivityThreeGaceta {
   public static void main (String [] args){
      Scanner scnr = new Scanner (System.in);
      double totalSum = 0.0;
      int totalQuantity = 0;
  
      
      while (true){
         System.out.println("== FAST FOOD ==\n");
         System.out.println("     Menu:     ");
         System.out.println("C1 = Php 100.00");
         System.out.println("C2 = Php 150.00");
         System.out.println("C3 = Php 200.00");
         System.out.println("---------------");
         System.out.println("    Add-ons:   ");
         System.out.println("R1 = Php 35.00 ");
         System.out.println("R2 = Php 50.00 ");

         System.out.println("Enter order number (Press 0 to proceed to payment): ");
            int choice = scnr.nextInt();
           
            if (choice == 0) {
               System.out.println("         === FAST FOOD ====\n");
               System.out.println("Total Quantity: " + totalQuantity);
               System.out.println("Total Price: Php " + totalSum);
               System.out.println("Total Price in USD: $" + totalSum / 56);
            break; 
         }
         
         System.out.println("Enter Quantity: ");
            int quantity = scnr.nextInt();
            double subtotal = 0.0; 
        
         
         switch (choice){
            case 1:
               {
                subtotal = 100.00 * quantity;
               System.out.println (quantity +  " C1 " + "= Php " + subtotal);
               break;
               }
            case 2:{
                subtotal = 150.00 * quantity;
               System.out.println (quantity +  " C2 " + "Total: Php " + subtotal);
               break;
               }
            case 3:{
                subtotal = 200.00 * quantity;
               System.out.println (quantity +  " C3 " + "Total: Php " + subtotal);
               break;
               }
            case 4:{
                subtotal = 35.00 * quantity;
               System.out.println (quantity +  " R1 " + "Total: Php " + subtotal);
               break;
               }
            case 5:{
                subtotal = 50.00 * quantity;
               System.out.println (quantity +  " R2 " + "Total: Php " + subtotal);
               break;
               }
            
         }
            totalQuantity += quantity;
            totalSum += subtotal;
            System.out.println("Total:" + totalSum);
         
      }
   }
   
}