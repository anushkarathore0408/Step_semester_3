import java.util.*;

public class Q1_W1
{
    static String playRound(String playerMove, String computerMove)
    {
        if(playerMove.equals(computerMove))
            return "Draw";

        else if((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                (playerMove.equals("scissors") && computerMove.equals("paper")))
            return "Player Wins";

        else
            return "Computer Wins";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"rock", "paper", "scissors"};
        String[] player = new String[5];
        String[] computer = new String[5];
        String[] result = new String[5];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter Player Move: ");
            player[i] = sc.next().toLowerCase();

            computer[i] = moves[r.nextInt(3)];

            result[i] = playRound(player[i], computer[i]);

            if(result[i].equals("Player Wins"))
                wins++;
            else if(result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("\nRound\tPlayer Move\tComputer Move\tResult");

        for(int i = 0; i < 5; i++)
        {
            System.out.println((i + 1) + "\t" + player[i] + "\t\t" + computer[i] + "\t\t" + result[i]);
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win % = " + winPercentage);
    }
}