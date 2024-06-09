package OOPS.Inheritance.Vehicle;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle Vc = new Vehicle();
        System.out.println("Bike has =" + "\n" + Vc.fuelType + "\n" + Vc.transmission + "\n" + Vc.automatic);

        System.out.println("------------------");

        Bike Bk = new Bike();
        System.out.println("Bike has =" + "\n" + Bk.bikeType + "\n" + Bk.maxSpeed);

        System.out.println("------------------");

        Car Cr = new Car();
        System.out.println("CarExample has =" + "\n" + Cr.fuel + "\n" + Cr.seats);

        System.out.println("------------------");

        Truck Tr = new Truck();
        System.out.println("Truck has =" + "\n" + Tr.LoadCapacity + "\n" + Tr.wheels);

    }


}
