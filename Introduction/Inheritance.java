public class Inheritance {
    static class Bicycle {                  // Bycicle class
        int speed = 0;
        int cadence = 0;
        int gear = 1;                       // The state of the bycicle objects (the fields of the object)
        
        void speedUp(int speedUp) {
            speed += speedUp;
        }
        
        void applyBrakes(int slowDown) {
            speed -= slowDown;
        }
        
        void changeCadence(int newValue) {
            cadence = newValue;
        }
        
        void changeGear(int Gear) {
            gear = Gear;
        }                                       // The behaviour of the bybicla objects (the methods of object)
    }
    static class MountainBike extends Bicycle { // Key word extends means it takes everything (methods and fields) from Bycicle and adds more
        boolean turbo = false;
        
        void turbo(boolean turboSpeed) {
            turbo = turboSpeed;
        }                                          // Mountain bikes are fast - so they have an additional behaviour called turbo
    }
    
    public static void main(String[] args) {
        Bicycle A = new Bicycle();
        MountainBike B = new MountainBike();
        
        B.changeCadence(60);
        B.turbo(true);
        B.speedUp(5);
        B.changeGear(3);
        
        A.speedUp(10);
        A.applyBrakes(4);
        A.changeCadence(90);
        A.changeGear(4);                       // Calling all methods including turbo for B.
        
        System.out.println("Bike A's speed: " + A.speed +
                           ". Bike A's cadence: " + A.cadence +
                           ". Bike A's gear: " + A.gear);
        
        System.out.println("Bike B's speed: " + B.speed +
                           ". Bike B's cadence: " + B.cadence +
                           ". Bike B's gear: " + B.gear +
                           ". Bike B's turbo: " + B.turbo);     // Everything outputs ocrrectly because of inheritance.
    }
}

/* Output:

Bike A's speed: 6. Bike A's cadence: 90. Bike A's gear: 4
Bike B's speed: 5. Bike B's cadence: 60. Bike B's gear: 3. Bike B's turbo: true

*/