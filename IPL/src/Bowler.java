import java.util.Scanner;

public class Bowler extends Batsman {
    private int overs;
    private int wickets;

    public Bowler() {
    }

    public Bowler(String pname, int pid, int hundred, int fifties, int runs, int overs, int wickets) {
        super(pname, pid, hundred, fifties, runs);
        this.overs = overs;
        this.wickets=wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public void read() {
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Overs  Wickets :");
        setOvers(sc.nextInt());
        setWickets(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "overs=" + overs +
                ", wickets=" + wickets +
                '}';
    }
}
