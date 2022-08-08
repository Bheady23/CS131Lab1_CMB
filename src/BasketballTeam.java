/**
 * This class inherits the abstract class SportsTeam and builds out its methods to represent the identifiers and stats of 
 * a basketball team.
 * @author Chris Burkhead
 * CS131 
 * Lab1
 * version 1.1
 * Summer 2022
 *
 */
	public class BasketballTeam extends SportsTeam{
		//instance variables
		private  int fieldGoals;
		private  int fieldGoalsAttempted;
		private  int freeThrows;
		private  int freeThrowsAttempted;
		/**
		 * empty argument constructor
		 */
		public BasketballTeam() {
			super();
			fieldGoals=0;
			fieldGoalsAttempted=0;
			freeThrows=0;
			freeThrowsAttempted=0;
		}//end empty argument constructor
		
		/**
		 * 
		 * @param teamName
		 * @param teamMascot
		 * @param headCoach
		 * @param fieldGoals
		 * @param fieldGoalsAttempted
		 * @param freeThrows
		 * @param freeThrowsAttempted
		 */
		public BasketballTeam(String teamName, String teamMascot, String headCoach, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
			super(teamName, teamMascot, headCoach);
			this.fieldGoals=fieldGoals;
			this.fieldGoalsAttempted=fieldGoalsAttempted;
			this.freeThrows=freeThrows;
			this.freeThrowsAttempted=freeThrowsAttempted;
		}//end preferred constructor
		
		
		/**
		 * 
		 * @return getter for FieldGoals
		 */
		public int getFieldGoals() {
			return fieldGoals;
		}//end getFieldGoals
		
		/**
		 * 
		 * @param setter for fieldGoals
		 */
		public void setFieldGoals(int fieldGoals) {
			this.fieldGoals = fieldGoals;
		}//end setFieldGoals

		/**
		 * 
		 * @return getter for FieldGoalsAttempted
		 */
		public int getFieldGoalsAttempted() {
			return fieldGoalsAttempted;
		}//end getFieldGoalsAttempted
		
		/**
		 * 
		 * @param setter for fieldGoalsAttempted
		 */
		public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
			this.fieldGoalsAttempted = fieldGoalsAttempted;
		}//end setFieldGoalsAttempted

		/**
		 * 
		 * @return getter for FreeThrows
		 */
		public int getFreeThrows() {
			return freeThrows;
		}//end getFreeThrows
		
		/**
		 * 
		 * @param setter for freeThrows
		 */
		public void setFreeThrows(int freeThrows) {
			this.freeThrows = freeThrows;
		}//end setFreeThrows
		
		/**
		 * 
		 * @return getter for FreeThrowsAttempted
		 */
		public int getFreeThrowsAttempted() {
			return freeThrowsAttempted;
		}//end getFreeThrowsAttempted
		
		/**
		 * 
		 * @param setter for freeThrowsAttempted
		 */
		public void setFreeThrowsAttempted(int freeThrowsAttempted) {
			this.freeThrowsAttempted = freeThrowsAttempted;
		}//end setFreeThrowsAttempted
		
		/**
		 * 
		 * @returns a double that represents the teams field goal percentage
		 */
		public double fieldGoalPercentage() {
			double fieldGoal=fieldGoals/fieldGoalsAttempted;
			return fieldGoal;
		}//end fieldGoalPercentage
		
		/**
		 * 
		 * @returns a double that represents the teams free throws percentage
		 */
		public double freeThrowPercentage() {
			double freeThrow=freeThrows/freeThrowsAttempted;
		return freeThrow;
		}//end freeThrowPercentage
		
		/**
		 * 
		 * @param wins
		 * @param losses
		 * @param fieldGoals
		 * @param fieldGoalsAttempted
		 * @param freeThrows
		 * @param freeThrowsAttempted
		 */
		public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
			super.wins=wins;
			super.losses=losses;
			this.fieldGoals=fieldGoals;
			this.fieldGoalsAttempted=fieldGoalsAttempted;
			this.freeThrows=freeThrows;
			this.freeThrowsAttempted=freeThrowsAttempted;
		}//end setStats
		
		/**
		 * @override method, overrides the empty getStats method setup in SportsTeam class, fills the array with the 
		 * basketballs teams win, field goal and free throw percentages
		 */
		@Override
		public double[] getStats() {
			double[] stats= {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
			return stats;
		}//end getStates
				
}//end class