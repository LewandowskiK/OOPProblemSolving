//ProblemSolving(b)
//checkOctet.java
/*This program will ask the user to input an octet and depending on the information
* submitted it will display a relevant comment*/
package week2;
import javax.swing.JOptionPane;

public class checkOctet {
    public static void main(String[] args) {
        String input;

        input = JOptionPane.showInputDialog("Please enter an octet value");

        if(isValidOctet(input))
            JOptionPane.showMessageDialog(null,
                    "You entered a valid octet",
                    "Octet Validation Result",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "You entered an invalid octet",
                    "Octet Validation Result",
                    JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static boolean isValidOctet(String a)
    {
        boolean valid = false;
        int i;

        if(a.length()<=3)
        {
            for(i = 0; i < a.length(); i++)
            {
                if(!Character.isDigit(a.charAt(i)))
                    break;
            }
            if(i == a.length()) {
                double octet = Double.parseDouble(a);
                if(octet<256)
                    valid = true;
            }
        }

        return valid;
    }
}
