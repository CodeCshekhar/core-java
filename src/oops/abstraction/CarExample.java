package oops.abstraction;

abstract class Car {

    public abstract void changeGear(int a);
    public abstract void speedUp(int a);
    public abstract void applyBrakes(int a);
}

    class Honda extends Car {
        int speed;
        int gear;


        @Override
        public void changeGear(int newGear){
            gear = newGear;
        }


        @Override
        public void speedUp(int increment){
            speed = speed + increment;
        }


        @Override
        public void applyBrakes(int decrement){
            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed + " gear: " + gear);
        }
    }

    public class CarExample {
        public static void main(String[] args) {

            Honda honda = new Honda();
            honda.changeGear(2);
            honda.speedUp(3);
            honda.applyBrakes(1);

            System.out.println("Honda present state :");
            honda.printStates();
        }
    }


