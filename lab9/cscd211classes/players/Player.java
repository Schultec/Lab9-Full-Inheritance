package lab9.cscd211classes.players;

public abstract class Player implements Cloneable {
    protected String name;
    protected String position;
    protected int salary;
    protected String ssn;

    protected Player(String name, String position, int salary, String ssn) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.ssn = ssn;
    }

    public int getSalary(){
        return this.salary;
    }
    public String getPosition(){
        return this.position;
    }
    public String getName(){
        return this.name;
    }
    public String getSsn(){
        return this.ssn;
    }
    public String toString(){
        return this.name + " " + this.ssn + " " + this.salary + " " + this.position + " ";
    }
}
