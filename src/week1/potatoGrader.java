//ProblemSolving(b)
//potatoGrader.java
/*This program will ask the user to input basic information about their potato and
* then grade the potato based on the inputs*/

package week1;
import javax.swing.JOptionPane;

public class potatoGrader {
    public static void main(String[] args) {
        String inputAsString,
                title = "-----The Super-Duper Potato Grading Machine-----\n\n\n";
        double minDiameter, maxDiameter;

        inputAsString = JOptionPane.showInputDialog(title+ "Please enter the " +
                "condition of the potato (good or bad)");

        if(inputAsString.toLowerCase().equals("good"))
        {
            inputAsString = JOptionPane.showInputDialog(title + "Please enter the " +
                    "minimum diameter of the potato");
            minDiameter = Double.parseDouble(inputAsString);
            if(minDiameter <= 0)
                JOptionPane.showMessageDialog(null,
                        "The minimum diameter of the potato cannot be negative" +
                                " ... exiting the program now",
                        "Invalid Information",
                        JOptionPane.ERROR_MESSAGE);
            else
            {
                inputAsString = JOptionPane.showInputDialog(title + "Please enter " +
                        "the maximum diameter of the potato");
                maxDiameter = Double.parseDouble(inputAsString);
                if(maxDiameter<=0)
                    JOptionPane.showMessageDialog(null,
                            "The maximum diameter of the potato cannot be negative" +
                                    " ... exiting the program now",
                            "Invalid Information",
                            JOptionPane.ERROR_MESSAGE);
                else
                {
                    double averageDiameter = (maxDiameter+minDiameter)/2f;
                    if(averageDiameter<=24.99)
                        JOptionPane.showMessageDialog(null,
                                "The average diameter of the potato is " + averageDiameter +
                                "mm and so its grade is D",
                                "Potato Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    else if(averageDiameter>=25 && averageDiameter<=49.99)
                        JOptionPane.showMessageDialog(null,
                                "The average diameter of the potato is " + averageDiameter +
                                        "mm and so its grade is C",
                                "Potato Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    else if(averageDiameter>=50 && averageDiameter<=74.99)
                        JOptionPane.showMessageDialog(null,
                                "The average diameter of the potato is " + averageDiameter +
                                        "mm and so its grade is B",
                                "Potato Information",
                                JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,
                                "The average diameter of the potato is " + averageDiameter +
                                        "mm and so its grade is A",
                                "Potato Information",
                                JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else if(inputAsString.toLowerCase().equals("bad"))
        {
            JOptionPane.showMessageDialog(null,
                    "The condition of the potato is bad ... " +
                            "exiting program now",
                    "Bad Potato",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "You have entered an invalid potato condition ... " +
                            "exiting the program now",
                    "Invalid Information",
                    JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
