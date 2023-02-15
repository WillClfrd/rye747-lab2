/**
 *This class represents CrewMember objects
 *each CrewMember object can be instantiated in one of two ways, with a name, a position, a rank, and a species being required, and an assignment being optional
 */
public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String species;
	private String assignment;
	
	/**
	 * Constructs a CrewMember object with a given name, position, rank, species, and assignment
	 * 
	 * @param nm the name to be assigned to the object
	 * @param pos the position to be assigned to the object
	 * @param rk the rank to be assigned to the object
	 * @param spe the species to be assigned to the object
	 * @param assign the assignment to be assigned to the object
	 */
	public CrewMember(String nm, String pos, String rk, String spe, String assign) {
		this.name = nm;
		this.position = pos;
		this.rank = rk;
		this.species = spe;
		this.assignment = assign;
	}
	
	/**
	 * Constructs a CrewMember object with a given name, position, rank, and species
	 * 
	 * @param nm the name to be assigned to the object
	 * @param pos the position to be assigned to the object
	 * @param rk the rank to be assigned to the object
	 * @param spe the species to be assigned to the object
	 */
	public CrewMember(String nm, String pos, String rk, String spe) {
		this.name = nm;
		this.position = pos;
		this.rank = rk;
		this.species = spe;
	}
	
	/**
	 * Returns a formatted string representation of the CrewMember class name, position, rank, and species attributes
	 * 
	 * @return the formatted string representation of the CrewMember class name, position, rank, and species attributes
	 */
	public String toString() {
		return " - " + this.name + " (" + this.rank + ") - " + this.position + "[" + this.species + "]\n";
	}
	
	/**
	 * Returns the CrewMember class name attribute
	 * 
	 * @return the string type name attribute for the CrewMember object
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the CrewMember class position attribute
	 * 
	 * @return the string type position attribute for the CrewMember object
	 */
	public String getPosition() {
		return this.position;
	}
	
	/**
	 * Returns the CrewMember class rank attribute
	 * 
	 * @return the string type rank attribute for the CrewMember object
	 */
	public String getRank() {
		return this.rank;
	}
	
	/**
	 * Returns the CrewMember class species attribute
	 * 
	 * @return the string type species attribute for the CrewMember object
	 */
	public String getSpecies() {
		return this.species;
	}
	
	/**
	 * Returns the CrewMember class assignment attribute
	 * 
	 * @return the string type assignment attribute for the CrewMember object
	 */
	public String getAssignment() {
		return this.assignment;
	}

	/**
	 * Changes the value of the CrewMember class name attribute to the value specified by newName 
	 * 
	 * @param newName the new value for the CrewMember object name attribute
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Changes the value of the CrewMember class position attribute to the value specified by newPos 
	 * 
	 * @param newPos the new value for the CrewMember object position attribute
	 */
	public void setPosition(String newPos) {
		this.position = newPos;
	}
	
	/**
	 * Changes the value of the CrewMember class rank attribute to the value specified by newRank 
	 * 
	 * @param newRank the new value for the CrewMember object rank attribute
	 */
	public void setRank(String newRank) {
		this.rank = newRank;
	}
	
	/**
	 * Changes the value of the CrewMember class species attribute to the value specified by newSpec 
	 * 
	 * @param newSpec the new value for the CrewMember object species attribute
	 */
	public void setSpecies(String newSpec) {
		this.species = newSpec;
	}
	
	/**
	 * Changes the value of the CrewMember class assignment attribute to the value specified by newAssign 
	 * 
	 * @param newAssign the new value for the CrewMember object assignment attribute
	 */
	public void setAssignment(String newAssign) {
		this.assignment = newAssign;
	}
}