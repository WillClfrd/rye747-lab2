//Program is working correctly add Javadoc comments and then submit
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
	
	public CrewMember(String nm, String pos, String rk, String spe) {
		this.name = nm;
		this.position = pos;
		this.rank = rk;
		this.species = spe;
	}
	
	public String toString() {
		return " - " + this.name + " (" + this.rank + ") - " + this.position + "[" + this.species + "]\n";
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public String getAssignment() {
		return this.assignment;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPosition(String newPos) {
		this.position = newPos;
	}
	
	public void setRank(String newRank) {
		this.rank = newRank;
	}
	
	public void setSpecies(String newSpec) {
		this.species = newSpec;
	}
	
	public void setAssignment(String newAssign) {
		this.assignment = newAssign;
	}
}
