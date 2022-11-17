package lab9.cscd211classes.players;

public class FootballPlayer extends Player implements Cloneable{
    protected int jerseyNumber;
    protected int td;

    public FootballPlayer(String name, String position, int salary, String ssn, int jerseyNumber, int td){
        super(name, position, salary, ssn);
        this.jerseyNumber = jerseyNumber;
        this.td = td;
    }
    @Override
    public String toString(){
        return super.toString() +"\ttouchdowns: " + this.td + "\t" + this.jerseyNumber;
    }

    public FootballPlayer clone() throws CloneNotSupportedException{
        return (FootballPlayer) super.clone();
    }
}
