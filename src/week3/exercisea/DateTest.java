package week3.exercisea;

import javax.swing.JOptionPane;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        String output = "Calling the no-argument constructor...The first date is" +
                date1.toString();

        Date date2 = new Date(Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value",23)),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter a month value",4)),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter a year value",1913)));
        output += "Calling the multi-argument constructor...The second date is"
        + date2.toString() + "Calling the equals() method to check whether the date" +
                "objects are the same.\nThe result is that the dates are";

        if(date1.equals(date2))
            output += " the same";
        else
            output += " different";

        Date date3 = date2.copy();

       output += "\n\nCalling the copy() method to make a copy of the 2nd date object \n" +
               "and store it in a 3rd date object The value of the third date object is" + date3.toString();

        JOptionPane.showMessageDialog(null,output,
                "Date Test", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
