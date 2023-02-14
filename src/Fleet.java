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
		File dataDir = new File(dirName);
		String[] filenames = dataDir.list();
		String[] tokens;
		//Scanner read;
		String lineIn;
		
		for(int i = 0; i < filenames.length; ++i) {
			System.out.println(filenames[i]);
			try {
				Scanner read = new Scanner(new File(dirName + "/" + filenames[i]));
				while(read.hasNextLine()) {
					lineIn = read.nextLine();
					//System.out.println(lineIn);
					tokens = lineIn.split(",");
					parseData(tokens, i);
					for(int j = 0; j < tokens.length; ++j) {
						System.out.println(tokens[j]);
					}
					System.out.println("");
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
				break;
			default:
				if(tokens.length == 4) {
					CrewMember newCrew = new CrewMember(tokens[0], tokens[1], tokens[2], tokens[3]);
					fleet.get(fleet.size() - 1).addCrewMember(newCrew);
					System.out.println();
				}
				else if(tokens.length == 5){
					CrewMember newCrew = new CrewMember(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
					fleet.get(fleet.size()).addCrewMember(newCrew);
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
