package OOPS.Inheritance.Vehicle;
import java.util.Scanner;

public class Vehicle {
    String fuelType;
    boolean automatic;
    int transmission;
}
 class Bike extends Vehicle {
     String bikeType = "Racing";
     float maxSpeed = 180.00f;
}
class Car extends Vehicle{
    String fuel= "CNG";
    int seats = 5;
}
class Truck extends Vehicle{
    int LoadCapacity = 1000;
    int wheels = 6;
}










