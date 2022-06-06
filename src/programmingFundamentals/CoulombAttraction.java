package programmingFundamentals;

public class CoulombAttraction {
    public static void main(String[] args) {
        // Constants
        final double COULOMBS_CONSTANT = 8.988E9;

        // Variables
        double magnetCharge = 14E-4;
        double wireCharge = 1.42;
        int distance = 3;

        // Step 2: Calculate the force
        double forceOfAttraction = (COULOMBS_CONSTANT * magnetCharge * wireCharge) / (distance);

        // Step 3: Display the result to the user
        System.out.println("The force of attraction is:" + forceOfAttraction);
    }
}