//final
//Name: Shekainah Gaceta

import java.util.Scanner;

public class Route{
    Scanner scan = new Scanner (System.in);
    public int correction() {
        int choice;
        do {
            while (!scan.hasNextInt()) {
                System.out.printf("Please enter a valid number (1 or 2).");
                scan.next();
            }
            choice = scan.nextInt();

        } while (choice != 1 && choice != 2);
            return choice;


}

    public double speed() {
        double pace;
        do {
            System.out.printf("How fast are you going?(km/h): ");
            while (!scan.hasNextDouble()) {
                System.out.printf("Please enter a valid number.");
                scan.next();
            }
            pace = scan.nextDouble();
        } while (pace <= 0);
        return pace;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Route myObj = new Route();
        double bariliEta = 84.9;
        double dumanjugEta = 94.0f;
        double argaoEta = 92.3;



        System.out.println("=== Route System from Cebu City to Moalboal ===\n");
        System.out.println("Default Route:");
        System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Barili (Route 4)\n Dumanjug (Route 4.1.1)\n Alcantara (Route 4.1.2)\n Moalboal(End)\n");


        System.out.printf("Is Barili Obstructed? (1) Yes (2) No: ");
        int bariliRoute = myObj.correction();



        if (bariliRoute != 1){
            double speed = myObj.speed();
            System.out.println("Recomended Route:");
            System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Barili (Route 4)\n Dumanjug (Route 4.1.1)\n Alcantara (Route 4.1.2)\n Moalboal(End)\n");
            double time = bariliEta/speed;
            int hours = (int) time;
            int minutes = (int) ((time - hours) * 60);

            String timeFormat = String.format("%02d:%02d", hours, minutes);

            System.out.println("Distance: " + bariliEta + " kilometers");
            System.out.println("Speed: " + speed + " kilometers per hour");
            System.out.println("Estimated Time of Arrival: " + timeFormat);


        } else {
            System.out.printf("Is Dumanjug Obstructed? (1)Yes (2)No: ");
            int dumanjugRoute = myObj.correction();

            if (dumanjugRoute != 1) {
                double speed = myObj.speed();
                System.out.println("Recomended Route:");
                System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Dumanjug (Route 4.2.1)\n Alcantara (Route 4.2.2)\n Moalboal(End)\n");
                double time = dumanjugEta/speed;
                int hours = (int) time;
                int minutes = (int) ((time - hours) * 60);

                String timeFormat = String.format("%02d:%02d", hours, minutes);

                System.out.println("Distance: " + bariliEta + " kilometers");
                System.out.println("Speed: " + speed + " kilometers per hour");
                System.out.println("Estimated Time of Arrival: " + timeFormat);

            } else {
                double speed = myObj.speed();
                System.out.println("Recomended Route:");
                System.out.println(" Cebu City (Start)\n Minglanilla (Route 1)\n San Fernando (Route 2)\n Carcar (Route 3)\n Sibonga (Route 4.2)\n Argao (Route 5)\n Ronda (Route 5.1)\n Alcantara (Route 5.2)\n Moalboal(End)\n");
                double time = argaoEta/speed;
                int hours = (int) time;
                int minutes = (int) ((time - hours) * 60);

                String timeFormat = String.format("%02d:%02d", hours, minutes);

                System.out.println("Distance: " + bariliEta + " kilometers");
                System.out.println("Speed: " + speed + " kilometers per hour");
                System.out.println("Estimated Time of Arrival: " + timeFormat);
            }

        }
    }
}

//Barili-84.9 km
//Dumanjug - 94.0 km
// Argao -92.3 km