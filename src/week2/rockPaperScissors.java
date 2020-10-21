//ProblemSolving(e)
//rockPaperScissors.java
/*This program will allow the user to play a game of rock paper scissors against
* the computer*/
package week2;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class rockPaperScissors {
    JFrame window;
    JLabel gameLabel;
    JButton rockButton,paperButton,scissorsButton;
    String playerChoice;
    String computerChoice;
    int iteration = 1;

    public rockPaperScissors(){
        window = new JFrame("Rock,Paper,Scissors");

        window.setSize(300,100);

        FlowLayout flowLayout = new FlowLayout();
        window.setLayout(flowLayout);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameLabel = new JLabel("Game " + iteration + " - the computer has made its choice");
        window.add(gameLabel);

        rockButton = new JButton("Rock");
        window.add(rockButton);
        paperButton = new JButton("Paper");
        window.add(paperButton);
        scissorsButton = new JButton("Scissors");
        window.add(scissorsButton);

        ButtonEventHandler handler = new ButtonEventHandler();
        rockButton.addActionListener(handler);
        paperButton.addActionListener(handler);
        scissorsButton.addActionListener(handler);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        rockPaperScissors guiApp = new rockPaperScissors();
    }

    private class ButtonEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==rockButton)
                playerChoice = "rock";
            else if(e.getSource()==paperButton)
                playerChoice="paper";
            else
                playerChoice = "scissors";

            iteration++;
            gameLabel.setText("Game " + iteration + " - the computer has made its choice");
            computerChoice = computerChoice();
            calculateResult(playerChoice,computerChoice);
            window.repaint();
        }
    }
    private static String computerChoice(){
        int choice;
        String computerChoice;

        choice = (int)(Math.random()*3+1);

        if(choice==3)
            computerChoice = "scissors";
        else if(choice == 2)
            computerChoice = "paper";
        else
            computerChoice = "rock";
        return computerChoice;
    }
    private static void calculateResult(String player,String pc)
    {
        if((player.equals("rock")&&pc.equals("scissors"))||
                (player.equals("paper")&&pc.equals("rock")||
                        (player.equals("scissors")&&pc.equals("paper"))))
            JOptionPane.showMessageDialog(null,
                    "You won!",
                    "Results",
                    JOptionPane.INFORMATION_MESSAGE);
        else if((player.equals("scissors")&&pc.equals("rock"))||
                (player.equals("rock")&&pc.equals("paper")||
                        (player.equals("paper")&&pc.equals("scissors"))))
            JOptionPane.showMessageDialog(null,
                    "You lost!",
                    "Results",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "Its a draw!",
                    "Results",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
