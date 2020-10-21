//ProblemSolving(d)
//countryNameAnalysis.java
/*This program will ask the user to input different countries and output various
* statistics about the inputs*/
package week1;
import javax.swing.JOptionPane;

public class countryNameAnalysis {
    public static void main(String[] args) {
        String input, shortestName = "", listE = "";
        int between10and15 = 0, startsWithN = 0, counter = 0, shortestNameInt = 100;



        do{
            input = JOptionPane.showInputDialog("Please enter a country " +
                    "name (x to exit)");
            if(input.equals("x"))
            {
                break;
            }

            if(input.length() >= 10 && input.length() <= 15)
                between10and15++;
            if(input.charAt(0)=='N')
                startsWithN++;
            if(shortestNameInt>input.length())
            {
                shortestNameInt = input.length();
                shortestName = input;
            }

            int numberEs = 0, i = 0;
            while(numberEs < 2 && i<input.length())
            {
                if(input.charAt(i)=='e'||input.charAt(i)=='E')
                    numberEs++;
                i++;
            }
            if(numberEs==2)
                listE += input + " ";
            counter++;
        }while(!input.equals("x"));

        if(counter == 0)
            JOptionPane.showMessageDialog(null,
                    "You entered no country names ... thanks " +
                            "for using the program",
                    "No Countries Entered",
                    JOptionPane.WARNING_MESSAGE);
        else
        {
            JOptionPane.showMessageDialog(null,
                    "--------Country Statistics--------\n\n" +
                            "Number of countries entered: " + counter +
                            "\nCountry with shortest name: " + shortestName +
                    "\n% of countries between 10 and 15 characters inclusive: " +
                    String.format("%.2f",((float)between10and15/(float)counter)*(float) 100) +
                    "%\nNumber of countries beginning with 'N': " + startsWithN +
                    "\nList of countries containing at least 2 'e'/'E' characters:" +
                    listE);
        }
        System.exit(0);
    }
}