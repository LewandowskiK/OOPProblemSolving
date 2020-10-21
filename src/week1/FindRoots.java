//FindRoots.java
/*This simple program will ask the user to input the values a, b and c which are the
* coefficients of ax^2 + bx + c and display the roots of the quadratic*/

package week1;
import javax.swing.JOptionPane;

public class FindRoots {
    public static void main(String []args)
    {
        int a, b, c;
        String input;

        input = JOptionPane.showInputDialog("Please enter the coefficient a");
        a = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Please enter the coefficient b");
        b = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Please enter the coefficient c");
        c = Integer.parseInt(input);

        double determinant = b*b - 4*a*c;
        if(determinant > 0)
        {
            double root1, root2;

            root1 = ((b*-1) + Math.sqrt(determinant))/(2 * a);
            root2 = ((b*-1) - Math.sqrt(determinant))/(2 * a);

            JOptionPane.showMessageDialog(null,
                    "This quadratic equation has two different roots and their " +
                            "values are " +
                            String.format("%.3f",root1) + " and " +
                            String.format("%.3f",root2) + ".",
                    "Roots",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if(determinant == 0)
        {
            double root;
            root = ((b*-1) + Math.sqrt(determinant))/(2 * a);

            JOptionPane.showMessageDialog(null,
                    "This quadratic equation has two identical roots and" +
                            "their values are " + String.format("%.3f",root) +
                            " and " + String.format("%.3f",root) + ".",
                    "Roots",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            String root1, root2;
            determinant = determinant * -1;
            if (Math.sqrt(determinant) % 1 == 0)
            {
                root1 = (float)(b * -1)/(float)(2 * a) + " + " + (int) Math.sqrt(determinant) /(2 * a) + " i";
                root2 = (float)(b * -1)/(float)(2 * a) + " - " + (int) Math.sqrt(determinant) /(2 * a) + " i";

                JOptionPane.showMessageDialog(null,
                        "This quadratic equation has two complex conjugate " +
                                "roots and their values are "
                                + root1 + " and " + root2 + ".",
                        "Roots",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                root1 =(float)(b*-1)/(float)(2 * a) + " + sqrt(-" + (int) determinant + ")/" + 2 * a;
                root2 =(float)(b*-1)/(float)(2 * a) + " - sqrt(-" + (int) determinant + ")/" + 2 * a;

                JOptionPane.showMessageDialog(null,
                        "The roots coinciding with those values are " + root1 + " and " + root2 + ".",
                        "Roots",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}
