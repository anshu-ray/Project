import java.util.Arrays;
import java.util.Scanner;

public class Tournament {
    private String Tour_name;
    private int Year;
    private Team[] teams=new Team[10];
    private int teamcounter;

    public Tournament() {
        teamcounter=0;
    }

    public Tournament(String tour_name) {
        Tour_name = tour_name;
    }

    public Tournament(int year) {
        Year = year;
    }

    public String getTour_name() {
        return Tour_name;
    }

    public void setTour_name(String tour_name) {
        Tour_name = tour_name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void addTeam(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Team name and CEO name :");
        teams[teamcounter]=new Team();
        teams[teamcounter].setTeam_name(sc.next());
        teams[teamcounter].setCEO(sc.next());
        System.out.println("Enter number of players :");
        int nop=sc.nextInt();
        for(int i=1; i<=nop;i++){
            teams[teamcounter].addPlayer();
        }
        teamcounter++;
    }
    public void displayTournament(){
        System.out.println("Tournament name :"+ getTour_name());
        System.out.println("Year :"+getYear());
        for(int i=0;i<teamcounter;i++){
            teams[i].displayTeam();
        }
    }


}
