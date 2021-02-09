public class Data {                             // Name of the class is the name of the file.
    public static void main(String[] args){     // Main function    
        class DataOnly {                        // Creating a class with fields.
            int i;
            double d;
            boolean b;
        }
        DataOnly data = new DataOnly();        // Creating a new object with class "DataOnly"
        data.i = 56;                           // Initailzing those fields to a value.
        data.d = 75.235;
        data.b = true;
        
        System.out.println("Data's int value is: " + data.i);     // Outputting the results.
        System.out.println("Data's double value is: " + data.d);
        System.out.println("Data's boolean value is: " + data.b);
    }
}
