//ProblemSolving(c)
//phoneNumberArray.java
/*This program will ask the user to fill in an array of 10 people and their phone
* numbers, it will then ask th user to supply a name, if found in the array the
* program will output the phone number of the requested person*/
package week2;
import javax.swing.JOptionPane;

public class phoneNumberArray {
    public static void main(String[] args) {
        String input;
        String[] names = new String[10];
        String[] phoneNumbers = new String[10];

        for(int i = 0; i<names.length; i++)
        {
            input = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
            names[i] = input;

            input = JOptionPane.showInputDialog("Please enter the phone number of " +
                    "person " + (i+1));
            phoneNumbers[i] = input;
        }

        input = JOptionPane.showInputDialog("Whose phone number do you seek?");
        linearSearch(input, names, phoneNumbers);
        System.exit(0);
    }
    private static void linearSearch(String a,String[] names, String[] numbers){
        int i;
        String answer = "";

        for(i = 0; i < names.length; i++)
        {
            if(a.equals(names[i]))
                answer = numbers[i];
        }

        if(!answer.equals(""))
            JOptionPane.showMessageDialog(null,
                    "The phone number is " + answer,
                    "Phone Number",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "The person " + a + " does not exist in the array",
                    "Phone Number",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
