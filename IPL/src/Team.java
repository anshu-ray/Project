import java.util.Arrays;
import java.util.Scanner;
public class Team {
    private String Team_name;
    private String CEO;
    private Player[] players = new Player[20];
    private int playercounter;

    public Team() {
        playercounter = 0;
    }

    public Team(String CEO, String Team_name) {
        this.CEO = CEO;
        this.Team_name = Team_name;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getTeam_name() {
        return Team_name;
    }

    public void setTeam_name(String team_name) {
        Team_name = team_name;
    }

    public void addPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 : For Batsman || 2 : For Bowler || 3 : For Wkt_keeper");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                players[playercounter] = new Batsman();
                players[playercounter].read();
                break;
            case 2:
                players[playercounter] = new Bowler();
                players[playercounter].read();
                break;
            case 3:
                players[playercounter] = new WKT_Keeper();
                players[playercounter].read();
                break;
        }
        playercounter++;
    }

    public void displayTeam() {
        System.out.println("Team name : " + Team_name);
        System.out.println("CEO : " + CEO);
        for (int i = 0; i < playercounter; i++) {
            System.out.println(players[i].toString());

        }
    }
}
