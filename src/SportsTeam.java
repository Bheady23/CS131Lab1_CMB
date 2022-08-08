/**
 * This is an abstract class that sets constants and two methods for classes that inherit it, one method is non-abstract 
 * and the other creates a double array. 
 * @author Chris Burkhead
 * CS131ON
 * Lab1
 * version 1.1
 * Summer 2011
 *
 */
public abstract class SportsTeam {
	//instance variables
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	/**
	 * empty argument constructor sets all strings to "" and ints to 0
	 */
	public SportsTeam() {
		teamName="";
		teamMascot="";
		headCoach="";
		wins=0;
		losses=0;
	}// end empty constructor
	
	/**
	 * 
	 * @param teamName
	 * @param teamMascot
	 * @param headCoach
	 */
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
	}// end preferred constructor
	
	/**
	 * 
	 * @return getWinPercentage
	 */
	public double getWinPercentage() {
		double WinPercent=wins/(wins+losses);
		return WinPercent;
	}//end getWinPercentage
	
	/**
	 * 
	 * @return empty method creates a double array getStats to be overridden in classes that inherit this class
	 */
	public abstract double[] getStats();	
	
}//end class
