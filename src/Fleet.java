import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fleet {
	private String name;
	public ArrayList<Starship> fleet;
	
	public Fleet(String nm){
		this.name = nm;
		fleet = new ArrayList<Starship>();
	}
	
	public String toString() {
		String outStr = "----------------------------\n" + this.name + "\n----------------------------";
		for(int i = 0; i < fleet.size(); ++i) {
			outStr += "\n" + fleet.get(i).toString();
		}
		return outStr;
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
		File dataDir = new File(dirName);
		String[] filenames = dataDir.list();
		String[] tokens;
		String lineIn;
		
		for(int i = 0; i < filenames.length; ++i) {
			System.out.println(filenames[i]);
			try {
				Scanner read = new Scanner(new File(dirName + "/" + filenames[i]));
				int n = 0;
				while(read.hasNextLine()) {
					lineIn = read.nextLine();
					tokens = lineIn.split(",");
					parseData(tokens, n);
					++n;
				}
				read.close();
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
	}
	
	private void parseData(String[] tokens, int state) {
		switch(state) {
			case 0:
				Starship tempShip = new Starship(tokens[0], tokens[1], tokens[2]);
				addStarship(tempShip);
				System.out.println("New Ship:\n" + tempShip);
				break;
			default:
				if(tokens.length == 4) {
					CrewMember newCrew = new CrewMember(tokens[0], tokens[1], tokens[2], tokens[3]);
					fleet.get(fleet.size() - 1).addCrewMember(newCrew);
					System.out.println("New Crew\n" + newCrew);
				}
				else if(tokens.length == 5){
					CrewMember newCrew = new CrewMember(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
					fleet.get(fleet.size()).addCrewMember(newCrew);
					System.out.println("New Crew" + newCrew);
				}	
				break;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
}
