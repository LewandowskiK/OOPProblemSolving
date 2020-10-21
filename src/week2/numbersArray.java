//ProblemSolving(d)
//numbersArray.java
/*This program will populate a double array of size 8 with pre determined values, it
* then call on three user defined methods to display information on those numbers*/
package week2;
import javax.swing.JOptionPane;

public class numbersArray {
    public static void main(String[] args) {
        double[] numbers = new double[8];
        numbers[0] = 22.3;
        numbers[1] = 45.6;
        numbers[2] = 27.4;
        numbers[3] = 56.6;
        numbers[4] = 73.2;
        numbers[5] = 11.5;
        numbers[6] = 87.4;
        numbers[7] = 23.8;

        JOptionPane.showMessageDialog(null,
                "The largest value in the array is " +
                        String.format("%.1f",largest(numbers)) +
                "\nThe average value in the array is " +
                String.format("%.3f",average(numbers)) +
                "\nTge list of values above the average is " + aboveAverage(numbers),
                "Array Stats",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private static double largest(double[] a)
    {
        double largest = 0;

        for(double number : a)
            if (largest < number)
                largest = number;

        return  largest;
    }
    private static double average(double[] a)
    {
        double total = 0;
        for(double number : a)
            total += number;

        return total/a.length;
    }
    private static String aboveAverage(double[] a)
    {
        String aboveAverage = "";
        double average = average(a);

        for(double number : a)
            if(number > average)
                aboveAverage += number + " ";

        return aboveAverage;
    }
}
