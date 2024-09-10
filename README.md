[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/BhpJHDYh)
# Program 5b

## Program Description:  
- Implement a class Car
  - Should contain private class parameters for carName, milesDriven, and gallonsUsed
  - Should implement the following methods:
    - A constructor with no parameters
      - Should default
        - carName to an empty String
        - mileDriven to 0
        - gallonsUsed to 0
    - A constructor with parameters for name, miles and gallons
      - Should set each variable logically
    - get/set methods for each parameter
    - calculateAverage
      - Takes no parameters
      - Returns the average miles per gallon as a double rounded to the nearest 10th
    - toString
      - Takes no parameters
      - Returns a string formatted as: {Car Name} averaged {Calculated Average} m/g
- Implement a class CarTester
  - Implement the following methods
    - addCar
      - Takes no parameters
      - Takes user input to set up a new Car
      - Returns a Car object
    - main
      - Set up as a standard main method
      - Should call addCar at least twice
      - Should call and print the results of toString for each car
- Be sure to use variables with easily recognizable names.

## Program Data ##:
N/A


### Statements Required: 
- Input
- Output
- Variable Assignment
- Class Implementation

### Sample Output w/ 2 cars:
>Please enter the car's name: Honda Civic
>
>Please enter cars miles: 234
>
>Please enter cars gallons: 100
>
>Honda Civic averaged 2.3 m/g
>
> ------NEXT CAR-------------------------------------------
>
>Please enter the car's name: Toad Mobile
>
>Please enter cars miles: 13
>
>Please enter cars gallons: 7
>
>Toad Mobile averaged 1.9 m/g
>
