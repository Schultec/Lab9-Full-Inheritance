package lab9.cscd211classes.players;

public class BaseballPlayer extends Player{
    protected double batAvg;
    public BaseballPlayer(String name, String position, int salary, String ssn, double batAvg){
        super(name, position, salary, ssn);
        this.batAvg = batAvg;
    }

    @Override
    public String toString(){
        return super.toString() + " Batting Avg: " + this.batAvg;
    }

    public BaseballPlayer clone() throws CloneNotSupportedException {
        return (BaseballPlayer) super.clone();
    }
}
