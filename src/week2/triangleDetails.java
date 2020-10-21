//ProblemSolving(a)
//triangleDetails.java
/*This program will ask the user to input the three sides of a triangle and output
* the area and the category of the triangle*/

package week2;
import javax.swing.JOptionPane;


public class triangleDetails {

    public static void main(String[] args) {
        String input;
        double sideA,sideB,sideC;
        int sameSides = 0;
        input = JOptionPane.showInputDialog("Please enter the length of the first " +
                "side of the triangle");
        sideA = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Please enter the length of the second " +
                "side of the triangle");
        sideB = Double.parseDouble(input);
        if(sideA == sideB)
            sameSides+=2;

        input = JOptionPane.showInputDialog("Please enter the length of the third " +
                "side of the triangle");
        sideC = Double.parseDouble(input);
        if(sideC == sideB || sideC == sideA) {
            if(sideA == sideC && sideA == sideB)
                sameSides++;
            else
                sameSides+=2;
        }
        triangleDetails(sameSides,sideA,sideB,sideC);

        System.exit(0);
    }
    private static void triangleDetails(int a, double sideA, double sideB, double sideC){
        double s = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        if(a==3)
            JOptionPane.showMessageDialog(null,
                    "The area of the triangle is " + String.format("%.3f",area) +
                    " squared units\nand it is an equilateral triangle",
                    "Triangle Details",
                    JOptionPane.INFORMATION_MESSAGE);
        else if(a==2)
            JOptionPane.showMessageDialog(null,
                    "The area of the triangle is " + String.format("%.3f",area) +
                            " squared units\nand it is an isosceles triangle",
                    "Triangle Details",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "The area of the triangle is " + String.format("%.3f",area) +
                            " squared units\nand it is a scalene triangle",
                    "Triangle Details",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
