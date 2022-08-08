
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

	public class NonPlayerCharacter extends GameCharacter {
		
		//instance variables
		private boolean active;
		private String intelligenceType;
	/**
	 * @empty argument constructor	
	 */
	public NonPlayerCharacter() {
		super();
		active=false;
		intelligenceType="AVERAGE";
	}//end empty argument constructor
	
	/**
	 * 
	 * @param id
	 * @param personality
	 * @param active
	 * @param intelligenceType
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super(id, personality);
		this.active=active;
		this.intelligenceType=intelligenceType;
	}//end preferred constructor
	/**
	 * 
	 * @return isActive boolean
	 */
	public boolean isActive() {
		return active;
	}//end isActive
	
	/**
	 * 
	 * @param setActive boolean
	 */
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	
	/**
	 * 
	 * @return getIntelligenceType
	 */
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getintelligenceType
	
	/**
	 * 
	 * @param setintelligenceType
	 */
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligence Type
	
	/**
	 * @string reportStructure, calls return of reportStructure method from GameCharacter class and adds to it
	 */
	public String reportStructure() {
		System.out.println(super.reportStructure());
		StringBuilder ab=new StringBuilder();
		ab.append("        Active: "+isActive()+"\n");
		ab.append("\n");
		ab.append("        Intelligence: "+getIntelligenceType()+"\n");
		ab.append("==================================\n");
			
	return ab.toString();
	}//end reportStructuremethod
		
	/**
	 * 
	 * @return introduce
	 */
	public static String introduce() {
		return "Hello my name is "+getUniqueID();
	}// end introduce method
	
	/**
	 * 
	 * @return exclaim method, returns with 1 of 5 random phrases
	 */
	public static String exclaim() {
		String[] phrase= {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random number = new Random();
		int i= number.nextInt(5);
		return phrase[i];
	}//end exclaim method
		

}//end class


