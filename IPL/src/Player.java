import java.util.Scanner;

abstract public class Player {
    private int pid;
    private String pname;


    public Player() {
    }

    public Player(String pname,int pid) {
        this.pname = pname;
        this.pid = pid;
    }



    public int getpid() {
        return pid;
    }

    public String getpname() {
        return pname;
    }

    public void setpid(int pid) {
        this.pid = pid;
    }

    public void setpname(String pname) {
        this.pname = pname;
    }
    public void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Pid and player name");
        setpid(sc.nextInt());
        setpname(sc.next());

    }

    @Override
    public String toString() {
        return "Player{" +
                "pname='" + pname + '\'' +
                ", pid=" + pid +
                '}';
    }
}