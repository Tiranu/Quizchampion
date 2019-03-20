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
		informatikFuellen(kategorien.indexOf("Informatik")+1);
		System.out.println(fragenliste);
	}
	
	
	private void kategorienFuellen()
	{
		kategorien.add("Informatik");
		kategorien.add("Universität");
		kategorien.add("Games");
		kategorien.add("Biologie");	
	}
	
	private void informatikFuellen(int kategorieZahl)
	{
		int i = 1;
		String kategorie = "Informatik";
		if (fragenliste.containsKey(kategorie))
		{
		ArrayList<Frage> liste = fragenliste.get(kategorie);
		liste.add(new Frage(i,kategorieZahl,"Wieviele Bit hat ein Byte", "2", "4", "8", "1024", "c"));
		i++;
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
}
