/* Given the following two interfaces:

interface PremierLeaguePlayer {
    String getClub();
    String getPositionInPremierLeague();
}

interface ChampionsLeaguePlayer {
    void scoreGoal();
    String getPositionInChampionsLeague();
    boolean hasScoredInChampionsLeague();
}

you need to create a class called as SoccerPlayer.java and have members name, club,
positioninpremierleague, positioninchampionsleague, boolean variable scoredinchmapionsleague
and appropriate getter methods. and constructor to initialize the data members.

The SoccerPlayer class needs to implement the above two interfaces and its given methods.

Input Format: Read the player name, club, positioninpremierleague, positioninchampionsleague
              and true or false value to indicate whether he scored in champions league or not.

output format:
print all the entered details of the player and 
if the boolean value is true, then you print the following message:
"The player scored in the champions league"
or else
"The player didn't score in the Champions League."



Test case example:
-----------------------------
input=
Bukayo Saka
Arsenal
Left winger
Striker
true

output=
Name: Bukayo Saka
Premier League Club: Arsenal
Position in Premier League: Left winger
Position in Champions League: Striker
The player scored in the Champions League.

*/
// Start writing your code from here

import java.util.*;

class SoccerPlayer implements PremierLeaguePlayer, ChampionsLeaguePlayer {
    private String name, club, positionInPremierLeague, positionInChampionsLeague;
    private boolean scoredInChampionsLeague;

    // Getter methods
    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getPositionInPremierLeague() {
        return positionInPremierLeague;
    }

    public String getPositionInChampionsLeague() {
        return positionInChampionsLeague;
    }

    public boolean hasScoredInChampionsLeague() {
        return scoredInChampionsLeague;
    }

    // ScoreGoal

    public void scoreGoal() {
        scoredInChampionsLeague = true;
    }

    // Constructor
    SoccerPlayer(String name, String club, String positionInPremierLeague, String positionInChampionsLeague) {
        this.name = name;
        this.club = club;
        this.positionInPremierLeague = positionInPremierLeague;
        this.positionInChampionsLeague = positionInChampionsLeague;
    }
}

public class Solution_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String club = sc.nextLine();
        String positionInPL = sc.nextLine();
        String positionInCL = sc.nextLine();
        boolean scored = sc.nextBoolean();

        SoccerPlayer sp = new SoccerPlayer(name, club, positionInPL, positionInCL);
        if (scored)
            sp.scoreGoal();

        System.out.println("Name: " + sp.getName());
        System.out.println("Premier League Club: " + sp.getClub());
        System.out.println("Position in Premier League: " + sp.getPositionInPremierLeague());
        System.out.println("Position in Champions League: " + sp.getPositionInChampionsLeague());

        if (scored) {
            System.out.println("The player scored in the Champions League.");
        } else {
            System.out.println("The player didn't score in the Champions League.");

        }

    }
}
