import java.util.Scanner;

public class CarTester {
    // Method to add a new car by taking user input
    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);

        // Take car's name input
        System.out.print("Please enter the car's name: ");
        String carName = scanner.nextLine();

        // Take miles input
        System.out.print("Please enter cars miles: ");
        int miles = scanner.nextInt();

        // Take gallons input
        System.out.print("Please enter cars gallons: ");
        int gallons = scanner.nextInt();

        // Create and return a new Car object with the provided values
        return new Car(carName, miles, gallons);
    }

    // Main method to drive the program
    public static void main(String[] args) {
        // Create two car objects using addCar method
        Car car1 = addCar();
        System.out.println(car1.toString()); // Print the car's info

        System.out.println("------NEXT CAR-------------------------------------------");

        Car car2 = addCar();
        System.out.println(car2.toString()); // Print the second car's info
    }
}
