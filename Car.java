public class Car{
    
    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    public Car(){
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }
    public Car(String carName, int milesDriven, int gallonsUsed){
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
     
    }
    public int getMilesDriven(){
        return milesDriven;
    }
    public void setMilesDriven(int milesDriven){
        this.milesDriven = milesDriven;
    }
    public int getGallonsUsed(){
        return gallonsUsed;
    }
    public void setGallonsUsed(int gallonsUsed){
        this.gallonsUsed = gallonsUsed;
    }
    public double calculateAverage(){
        if(gallonsUsed == 0) return 0.0;
        double average = (double) milesDriven / gallonsUsed;
        return Math.round(average * 10.0) / 10.0;
    }
    public String toString(){
        return carName + " averaged" + calculateAverage() + " m/g";
    }
}
            
  
  
