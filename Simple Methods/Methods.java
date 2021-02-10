class Number {                                          // User created class "Number".
    int i;
}

public class Methods {                                  // Main class is public so it can be seen by everyone.
    static void example(Number x){                      // User made function called example.
        x.i++;                                          // Takes "Number x" as argument, and increments it integer by one.
    }
    public static void main(String[] args) {            // Main function is public so everyone can see it.
        Number x = new Number();                        // Declaring 'x'.
        x.i = 15;                                       // Initializing 'x'.
        System.out.println("x.i = " + x.i);             // Result before method is run on 'x'.
        example(x);                                     // Calling method on 'x'.                                                                   
        System.out.println("x.i = " + x.i);             // Result after method is called on 'x'.
    }
}
