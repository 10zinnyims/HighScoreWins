import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a score: ");
        String score = input.next();

        String[] scoreParts = score.split("[|:]");

        String homeTeam = scoreParts[0];
        int homeScore = Integer.parseInt(scoreParts[2]);
        String visitorTeam = scoreParts[1];
        int visitorScore = Integer.parseInt(scoreParts[3]);

/*        String winner;
        if (homeScore > visitorScore) {
            winner = homeTeam;
        } else {
            winner = visitorTeam;
        }
 */
        String winner = homeScore > visitorScore ? homeTeam : visitorTeam;

        System.out.println("Home team: " + homeTeam);
        System.out.println("home score: " + homeScore);
        System.out.println("Visitor team: " + visitorTeam);
        System.out.println("Visitor score: " + visitorScore);
        System.out.println("Winner: " + winner);
    }
}
