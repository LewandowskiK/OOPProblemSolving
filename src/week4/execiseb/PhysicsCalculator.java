package week4.execiseb;

public class PhysicsCalculator {
    public static int SPEED_OF_LIGHT = 299792458;
    public static double PLANCK_CONSTANT = 6.62607004E-34;
    public static double PERMITTIVITY_OF_VACUUM = 8.8542E-12;

    private PhysicsCalculator(){

    }

    public static double energyFromMass(double mass){
        return mass*SPEED_OF_LIGHT*SPEED_OF_LIGHT;
    }

    public static double energyFromFrequency(double frequency){
        return frequency*PLANCK_CONSTANT;
    }

    public static double coulombForce(double charge1, double charge2, double distance){
        return (charge1*charge2)/(4*Math.PI*PERMITTIVITY_OF_VACUUM*distance*distance);
    }
}
