import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Fleet {
	private String name;
	ArrayList<Starship> fleet;
	
	public Fleet(String nm){
		this.name = nm;
		fleet = new ArrayList<Starship>();
	}
	
	public String toString() {
		return "hello";
	}
	
	public int getSizeOfFleet() {
		return fleet.size();
	}
	
	public void addStarship(Starship newShip) {
		fleet.add(newShip);
	}
	
	public void loadStarships(String dirName) throws FileNotFoundException {
		/*Take in a directory name
		 * scan directory for starship files
		 * 		these will just be files that contain starship information
		 * add a starship to the current fleet for every file found
		 * 		this will use the information in the found file to get the information for the starship object
		 * */
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
}
