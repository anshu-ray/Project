import java.util.Scanner;

public class Batsman extends Player {
    private int runs;
    private int hundred;
    private int fifties;

    public Batsman() {

    }

    public Batsman(String pname, int pid, int hundred,int fifties,int runs) {
        super(pname, pid);
        this.hundred = hundred;
        this.fifties = fifties;
        this.runs = runs;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
    public void read()
    {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Runs  Hundreds  Fifties: ");
        setRuns(sc.nextInt());
        setFifties(sc.nextInt());
        setHundred(sc.nextInt());
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "runs=" + runs +
                ", hundred=" + hundred +
                ", fifties=" + fifties +
                '}';
    }
}