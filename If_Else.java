public class If_Else {                  
    static int standardIfElse(int x) {              // Standard If Else Method
        if(x < 15) 
            return x * 100;
        else                                        // Body of if-else statement
            return x * 10;
    }                                              
    
    static int ternaryIfElse(int x) {               // Ternary If Else Metohd
        return x < 15 ? x * 100 : x * 10;           // Ternary if- else is an operator, not a statement
    }
    
    public static void main(String[] args) {
        System.out.println(ternaryIfElse(9));
        System.out.println(standardIfElse(9));
        System.out.println(ternaryIfElse(20));
        System.out.println(standardIfElse(20));
        System.out.println(ternaryIfElse(15));
        System.out.println(standardIfElse(15));     // Outputs for every pair of number is insane, both methods work 
    }
}