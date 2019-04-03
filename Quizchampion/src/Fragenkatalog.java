import java.util.ArrayList;
import java.util.HashMap;

public class Fragenkatalog {

	
	HashMap<String,HashMap<Integer, ArrayList<Frage>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Frage>>>();
	ArrayList<String> kategorien = new ArrayList<String>();
	
	
	public Fragenkatalog()
	{
		kategorienFuellen();
		for(int i = 0; i<kategorien.size();i++)
		{
			fragenliste.put(kategorien.get(i), new HashMap<Integer, ArrayList<Frage>>());
					
			for(int j = 1; j <= Hauptklasse.getAnzahlSchwierigkeitsgrade();j++)
			{
				fragenliste.get(kategorien.get(i)).put(j, new ArrayList<Frage>());
			}
			
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
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i,kategorieZahl, 1, "Wieviele Bit hat ein Byte?", "2", "4", "8", "1024", 'c'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,kategorieZahl, 2 ,"Wann wurde die Firma Microsoft gegründet?", "2", "4", "8", "1024", 'c'));
		i++;
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		
		
		//Fragen des Schwierigkeitsgrad 3
				
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	public Frage zufaelligeFrageAusgebenMitStufe(String kategorie, int stufe)
	{
		Frage frage = this.fragenliste.get(kategorie).get(stufe).get((int) Math.round(Math.random()*this.fragenliste.get(kategorie).get(stufe).size()-1));
		
		return frage;
	}
}
