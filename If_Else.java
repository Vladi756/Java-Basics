public class If_Else {                  
    static int standardIfElse(int x) {              // Standard If Else Method.
        if(x < 15) 
            return x * 100;
        else                                        // Body of if-else statement.
            return x * 10;
    }                                              
    
    static int ternaryIfElse(int x) {               // Ternary If Else Metohd.
        return x < 15 ? x * 100 : x * 10;           // Ternary if- else is an operator, not a statement.
    }
    
    public static void main(String[] args) {        // Outputs for every pair of number is insane, both methods work.
        System.out.println(ternaryIfElse(9));
        System.out.println(standardIfElse(9));      // Generaly, the ternary operator is much more consice and takes up a lot less space.
        System.out.println(ternaryIfElse(20));      // Hoewver, the drawback to using it is the comprehension of the code, which is much better in
        System.out.println(standardIfElse(20));     // the standard if - else statement. (Code is more readable)
        System.out.println(ternaryIfElse(15));
        System.out.println(standardIfElse(15));      
    }
}
