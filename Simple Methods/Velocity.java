class Constant {                                        // Creating a new class "Constant"
    int x;
}

public class Velocity {                                 // Public class same as file name
    public static void main(String[] args) {            // Main function
        Constant Displacement = new Constant();         // Declaring new objects with class "Constant"
        Constant changeInTime = new Constant();
        Constant Vel = new Constant();
        
        Displacement.x = 20;                            // Change Initalizing Variables
        changeInTime.x = 4;                             // Change these values to meet your needs
        Vel.x = Displacement.x/changeInTime.x;          // Initialized according to the formula for velocity
        
        System.out.println("The Displacement of the object is: " + Displacement.x);     
        System.out.println("The Change in Time is: " + changeInTime.x);                 // Outputting the Results
        System.out.println("The velocity of the object is: " + Vel.x);
    }
}
