//Name: Shekainah Gaceta

import java.util.Scanner;

public class Map{
   public static void main(String [] args){
      Scanner scanner = new Scanner (System.in);
   
   System.out.println("=== Route System from Cebu City to Moalboal ===\n");
   System.out.println("Is Barili Obstructed? (1) Yes (2) No:");
      int bariliRoute = scanner.nextInt();
         if (bariliRoute != 1){
            System.out.println("Default Route:");
            System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Barili (Route 4)\n Dumanjug (Route 4.1.1)\n Alcantara (Route 4.1.2)\n Moalboal(End)\n");
         } else {
            System.out.println ("Is Dumanjug Obstructed?");
            int dumanjugRoute = scanner.nextInt();
               
               if(dumanjugRoute != 1){
                  System.out.println("Recomended Route:");
                  System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Dumanjug (Route 4.2.1)\n Alcantara (Route 4.2.2)\n Moalboal(End)\n"); 
               } else {
                  System.out.println("recomended Route:");
                  System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Argao (Route 5)\n Ronda (Route 5.1)\n Alcantara (Route 5.2)\n Moalboal(End)\n");
               }
         }
   } 
}