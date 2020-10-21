package week3.exerciseb;
import javax.swing.JOptionPane;

public class TestPoint {
    public static void main(String[] args) {

        Point point1 = new Point();

        String output = "The results of testing the point class are as follows: \n\n" +
                "Just called the Point() constructor - Value of the first Point object is" +
                point1.toString();

        Point point2 = new Point(Integer.parseInt(JOptionPane.showInputDialog("Please enter the x-value")),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the y-value")));

        output += "\n\nJust called the Point(int,int) constructor - Value of the second Point object is " +
                point2.toString() + "\n\nJust called the equals() method to check whether the position of the" +
                " Point objects\nhold the same value. The result is that the points are ";

        if(point1.equals(point2))
            output += "the same.";
        else
            output += "different.";

        Point point3 = new Point(-4,11);

        point2.setPoint(point3);

        output += "\n\nJust created a third Point object with values " + point3.toString() +
                "\n\nJust called the setPoint() method to set the value of the second Point\nto the value of " +
                "the third Point. The value of the second point is now " + point2.toString();

        point3.moveHorizontally(-5);

        output += "\n\nJust called the moveHorizontally() method to change the x-value of the third Point by\n" +
                "-5 units. The value of the third Point is now " + point3.toString();

        point1.moveVertically(6);

        output += "\n\nJust called the moveVertically() method to change the y-value of the first Point by\n" +
                "6 units. The value of the first Point is now " + point1.toString();

        JOptionPane.showMessageDialog(null,output,"Point Class Test Results",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
