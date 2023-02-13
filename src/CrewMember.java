
public class CrewMember {
	private String name;
	private String position;
	private String rank;
	private String species;
	private String assignment;
	
	public CrewMember(String nm, String pos, String rk, String spe, String assign) {
		
	}
	
	public CrewMember(String nm, String pos, String rk, String ape) {
		
	}
	
	public String toString() {
		return "hello";
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
