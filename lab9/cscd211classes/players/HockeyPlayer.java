package lab9.cscd211classes.players;

public class HockeyPlayer extends Player implements Cloneable{
    protected int jerseyNumber;
    public HockeyPlayer(String name, String position, int salary, String ssn, int jerseyNumber){
        super(name, position, salary, ssn);
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "\tjersey number: " + this.jerseyNumber;
    }

    public HockeyPlayer clone() throws CloneNotSupportedException{
        return (HockeyPlayer) super.clone();
    }
}
