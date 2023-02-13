import java.util.ArrayList;

public class Starship {
	private String name;
	private String registry;
	private String starshipClass;
	private ArrayList<CrewMember> Crew;
	
	public Starship (String nm, String reg, String cl){
		this.name = nm;
		this.registry = reg;
		this.starshipClass = cl;
		this.Crew = new ArrayList<CrewMember>();
	}
	
	public String toString() {
		return "Hello";
	}
	
	public void addCrewMember(CrewMember newCrew) {
		this.Crew.add(newCrew);
	}
	
	public int getNumberOfPersonnel() {
		return this.Crew.size();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRegistry() {
		return this.registry;
	}
	
	public String getStarshipClass() {
		return this.starshipClass;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setRegistry(String newReg) {
		this.registry = newReg;
	}
	
	public void setStarshipClass(String newSSC) {
		this.starshipClass = newSSC;
	}
}
