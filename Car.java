import java.text.DecimalFormat;

public class Car {
    // Private class parameters
    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    // Constructor with no parameters, defaults to empty string, 0 miles, and 0 gallons
    public Car() {
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }

    // Constructor with parameters for carName, milesDriven, and gallonsUsed
    public Car(String carName, int milesDriven, int gallonsUsed) {
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }

    // Get and set methods for carName
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    // Get and set methods for milesDriven
    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    // Get and set methods for gallonsUsed
    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    // Method to calculate average miles per gallon
    public double calculateAverage() {
        if (gallonsUsed == 0) return 0.0; // Avoid division by zero
        double average = (double) milesDriven / gallonsUsed;
        return Math.round(average * 10.0) / 10.0; // Rounded to the nearest 10th
    }

    // toString method to return a string with the car's name and calculated average mpg
    public String toString() {
        return carName + " averaged " + calculateAverage() + " m/g";
    }
}
