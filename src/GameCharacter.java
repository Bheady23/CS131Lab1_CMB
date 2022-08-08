import java.util.*;

/**
 * This is the base GameCharacter object from which
 * all other characters will be derived. 
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */

public class GameCharacter {

	//instance variables - visibility is protected so subclasses can manipulate the data directly.
	protected static String uniqueID; //unique identifier assigned to each character object.
	protected String personality; //personality data type for the character.
		
	/**
	 *  The empty argument constructor generates an ID
	 *  by calling a static method from the GameUtilities class
	 */
	public GameCharacter() {
		
		Random r = new Random();
		r.setSeed(1000);
		int id = r.nextInt(1000);
		setUniqueID(Integer.toString(id));
		setPersonality("NEUTRAL");
			
	}//end empty-argument constructor
	
	/**
	 * This constructor allows the caller to pass in
	 * the uniqueID for the object.
	 * 
	 * @param uniqueID
	 */
	public GameCharacter(String uniqueID, String personality) {
		
		setUniqueID(uniqueID);
		setPersonality(personality);
		
	}//end full-argument constructor
	
	/**
	 * Returns the structure of the object in a specially
	 * formatted representation. This is the preferred
	 * method for printing out the object structure.
	 * @return
	 */
	public String reportStructure(){
		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("        UniqueID: "+getUniqueID()+"\n");
		sb.append("\n");
		sb.append("        Personality: "+getPersonality()+"\n");
		sb.append("==================================");
		
	return sb.toString();
		
	}//end reportStats

	/**
	 * Getter for uniqueID 
	 * @return  uniqueID
	 */
	public static String getUniqueID() {
		return uniqueID;
	}//end getUniqueID

	/**
	 * Setter for uniqueID
	 * @param name
	 */
	public void setUniqueID(String name) {
		this.uniqueID = name;
	}//end setUniqueID
	
	/**
	 *  Getter for personality
	 * @return
	 */
	public String getPersonality() {
		return personality;
	}//end getPersonality
	
	/**
	 * setter for personality
	 * @param personality
	 */
	public void setPersonality(String personality) {
		this.personality = personality;
	}//setPersonality

	/**
	 * Used for test purposes only using the toString
	 * format generated by Eclipse.
	 */
	@Override
	public String toString() {
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}//end toString

}//end class