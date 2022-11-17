package lab9.cscd211classes;

import java.util.*;
import lab9.cscd211interfaces.*;
import lab9.cscd211classes.players.*;

/**
 * The Team class that defines the information about a team.
 */
public class Team implements Taxable, Payroll, Comparable<Team>
{
   
   protected String city;
   protected String teamName;
   protected int payroll;
   protected ArrayList<Player> players;

   public Team(String city, String teamName, int payroll, ArrayList<Player> players) throws CloneNotSupportedException{
      this.city = city;
      this.teamName = teamName;
      this.payroll = payroll;
      this.players = players;
   }
   public String getCity() {
      return city;
   }

   public String getTeamName() {
      return teamName;
   }

   public int getPayroll() {
      return payroll;
   }

   public ArrayList<Player> getPlayers() {
      return players;
   }
}// end class