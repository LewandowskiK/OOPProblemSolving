//ProblemSolving(c)
//studentGrades.java
/*This program will ask the user to input a valid mark for 5 students and
* output information based on the statistic*/
package week1;
import java.util.Scanner;

public class studentGrades {
    public static void main(String[] args) {
        int iteration =1, mark, totalMark = 0, maxMark = 0, minMark = 100, above70 = 0;
        int below40 = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter mark for student " + iteration + ": ");
            mark = input.nextInt();

            while (!validMark(mark))
            {
                System.out.print("Invalid! Please re-enter mark for student "
                        + iteration + ": ");
                mark = input.nextInt();
            }
            if(maxMark<mark)
                maxMark = mark;

            if(minMark>mark)
                minMark = mark;
            totalMark+=mark;

            if(mark > 70)
                above70++;

            if(mark < 40)
                below40++;

            System.out.println("\n\n\n");
            iteration++;
        }while(iteration<=5);

        System.out.println("\n============================\n\tProgram Results\n" +
                "============================\n\n\n" +
                "The average of the valid marks entered is " +
                String.format("%.2f",(float)totalMark/(float)5) +
                "\nThe largest valid mark entered is " + maxMark +
                "\nThe smallest valid mark entered is " + minMark +
                "\nThe percentage of valid marks that were at least 70 is " +
                above70 * 20 + "%" + "\nThe number of valid marks that were " +
                "below 40 is " + below40);
        System.exit(0);
    }
    private static boolean validMark(int a)
    {
        boolean valid = false;
        if(a>=0 && a<=100)
        {
            valid = true;
        }
        return valid;
    }
}
