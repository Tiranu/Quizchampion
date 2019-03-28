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
	
	
	/*
	 * Die Methode informatikFuellen füllt die Kategorie "Informatik" mit Fragen. Jede Frage wird einzeln als Frageobjekt an die Arraylist der Kategorie übergeben.
	 */
	
	private void informatikFuellen(int kategorieZahl)
	{
		int i = 1;
		String kategorie = "Informatik";
		
		if (fragenliste.containsKey(kategorie))
		{
		ArrayList<Frage> liste = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		liste.add(new Frage(i,kategorieZahl, 1, "Wieviele Bit hat ein Byte?", "2", "4", "8", "1024", 'c'));
		i++;
		
		liste.add(new Frage(i,kategorieZahl, 2 ,"Wann wurde die Firma Microsoft gegründet?", "2", "4", "8", "1024", 'c'));
		i++;
		
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
}
