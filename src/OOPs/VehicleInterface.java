package OOPs;

    public interface VehicleInterface {

        // all are the abstract methods.
        void changeGear(int a);

        void speedUp(int a);

        void applyBrakes(int a);

    }

    class Bicycle  implements VehicleInterface{

        int speed;
        int gear;

        // to change gear
        @Override
        public void changeGear(int newGear){

            gear = newGear;
        }

        // to increase speed
        @Override
        public void speedUp(int increment){

            speed = speed + increment;
        }

        // to decrease speed
        @Override
        public void applyBrakes(int decrement){

            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed
                    + " gear: " + gear);
        }
    }

    class MotorCycle implements VehicleInterface {

        int speed;
        int gear;

        // to change gear
        @Override
        public void changeGear(int newGear){

            gear = newGear;
        }

        // to increase speed
        @Override
        public void speedUp(int increment){

            speed = speed + increment;
        }

        // to decrease speed
        @Override
        public void applyBrakes(int decrement){

            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed
                    + " gear: " + gear);
        }

    }
    class Rider {

        public static void main (String[] args) {

            // creating an instance of Bicycle
            // doing some operations
//            Bicycle bicycle = new Bicycle();
//            bicycle.changeGear(2);
//            bicycle.speedUp(3);
//            bicycle.applyBrakes(1);
//
//            System.out.println("Bicycle present state :");
//            bicycle.printStates();
//
//            // creating instance of the bike.
//            MotorCycle bike=new MotorCycle();
//            bike.changeGear(1);
//            bike.speedUp(4);
//            bike.applyBrakes(3);
//
//            System.out.println("Bike present state :");
//            bike.printStates();



          //  VehicleInterface v=a->System.out.println("gear shift"+a);
           // v.changeGear(12);
        }
    }

// interface cannot instantiate
