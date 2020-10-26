package week4.execiseb;

public class TestPhysicsCalculator {
    public static void main(String[] args) {
        System.out.println("Calling the static method energyFromMass() " +
                "to determine the amount of energy\n that is equivalent " +
                "to a mass of 1.3 nano-grams\n\nEnergy equivalent to a mass of 1.3 nano-grams is "
                + PhysicsCalculator.energyFromMass(1.3E-9) + " Joules" +
                "\n\nCalling static method energyFromFrequency() to determine the " +
                "amount of energy\nthat is equivalent to a frequency of 345.87 teraHertz" +
                "\n\nEnergy equivalent to 345.87 teraHertz is " +
                PhysicsCalculator.energyFromFrequency(345.87E12) + " Joules\n\n" +
                "Calling static method coulombForce() to determine the force that exists\n" +
                "between two electrical charges whose values are 4.58 microCoulombs and\n" +
                "-38.56 microCoulombs. The charges were separated by a distance of 0.528 metres" +
                "\n\nForce between the two charges is " + PhysicsCalculator.coulombForce(4.58E-6,-38.56E-6,0.528) +
                " Newtons");
    }
}
