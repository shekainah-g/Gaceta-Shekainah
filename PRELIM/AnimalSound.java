//Name: Shekainah Gaceta

import java.util.Scanner;

public class AnimalSound{
   AnimalSound(){
     
   }
   
   public void Dog(){
      System.out.print("Dog: Woof Woof");
   }
   
   public void Cat(){
      System.out.print("Cat: Meow Meow");
   }
  
   public void Cow(){
      System.out.print("Cow: Moo Moo");
   }

   public void Fox(){
      System.out.print("Fox: Ding Ding");
   }

public static void main(String args[]){
   AnimalSound animal = new AnimalSound();
   Scanner scan = new Scanner(System.in);  
   char choices;
     
      System.out.println("Activity 1: Animal Sounds\n" + "Select an Animal\n" + "1. Dog\n" + "2. Cat\n" + "3. Cow\n" + "4. Fox");
      System.out.println("Enter selected number: ");
      int num = scan.nextInt();
      
      System.out.println("Animal Number: " + num);
      
         switch (num){
         case 1:
               animal.Dog();
               break;
            case 2: 
               animal.Cat();
               break;
            case 3:
               animal.Cow();
               break;
            case 4:
               animal.Fox();
               break;
            default:
               System.out.print("Invalid Input");
               
        }
      
      
} 
 }