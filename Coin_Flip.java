public class Coin_Flip {
    public static void main(String[] args) {
        if(Math.random() > 0.5) {               // Math.random() generates random value between 0.0 and 1.0
            System.out.println("Tails");        // Heads is assigned to anything > 0.5
        }
        else {
            System.out.println("Heads");        // Anything < 0.5 is Tails
        }
    }
}
