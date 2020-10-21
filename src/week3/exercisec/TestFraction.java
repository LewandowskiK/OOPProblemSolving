package week3.exercisec;

import javax.swing.*;

public class TestFraction {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        String output = "The Results of testing the Fraction class are as follows\n\n" +
                "Just called the Fraction() constructor - The value of the first fraction" +
                " is " + fraction1.toString();

        Fraction fraction2 = new Fraction(Integer.parseInt(JOptionPane.showInputDialog("Please enter the numerator of the fraction",3)),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the denominator of the fraction",7)));

        output += "\n\nJust called the Fraction(int,int) constructor - value of the second fraction " +
                "is " + fraction2.toString() + "\n\nJust called the equals() method to check whether" +
                " the Fraction objects \nhold the same value. The result is that they are ";
        if(fraction1.equals(fraction2))
            output += "equal in value";
        else
            output += "different in value";

        Fraction fraction3 = new Fraction(13,-28);

        fraction2 = fraction3.copy();

        output += "\n\nJust created a third fraction with values (13,-28)\n\n" +
                "Just used the copy() method to change the state of the second fraction\n" +
                "to that of the third fraction. The value of the second fraction is now " +
                fraction2.toString() + "\n\nJust called the add() method to add the first " +
                "and second fractions\nThe value of " + fraction3.toString() + " and " +
                fraction2.toString() + " is " + fraction2.add(fraction3).toString() + "\n\n" +
                "Just called the subtract() method to subtract the third fraction from the" +
                "second one\nThe value of " + fraction3.toString() + " and " +
                fraction2.toString() + " is " + fraction2.subtract(fraction3).toString() + "\n\n" +
                "Just called the multiply() method to multiply the third fraction by the " +
                "second one\nThe value of " + fraction3.toString() + " and " +
                fraction2.toString() + " is " + fraction3.multiply(fraction2).toString() + "\n\n" +
                "Just called the divide method to divide the second fraction by the third " +
                "one\nThe value of " + fraction3.toString() + " and " +
                fraction2.toString() + " is " + fraction2.divide(fraction3).toString();

        JOptionPane.showMessageDialog(null,output,
                "Fraction Test Results",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
