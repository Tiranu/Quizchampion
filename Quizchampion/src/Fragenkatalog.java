import java.util.ArrayList;
import java.util.HashMap;

public class Fragenkatalog {

	
	HashMap<String,ArrayList<Frage>> fragenliste = new HashMap<String, ArrayList<Frage>>();
	ArrayList<String> kategorien = new ArrayList<String>();
	
	
	public Fragenkatalog()
	{
		kategorienFuellen();
		for(int i = 0; i<kategorien.size();i++)
		{
			fragenliste.put(kategorien.get(i), new ArrayList<Frage>());
		}
		System.out.println(fragenliste);
	}
	
	
	private void kategorienFuellen()
	{
		kategorien.add("Informatik");
		kategorien.add("Universität");
		kategorien.add("Games");
		kategorien.add("Biologie");
		
	}
}
