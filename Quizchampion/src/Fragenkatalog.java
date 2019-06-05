import java.util.ArrayList;
import java.util.HashMap;

public class Fragenkatalog {

	
	HashMap<String,HashMap<Integer, ArrayList<Frage>>> fragenliste = new HashMap<String, HashMap<Integer, ArrayList<Frage>>>();
	ArrayList<String> kategorien = new ArrayList<String>();
	
/*
 * Konstruktor für den Fragenkatalog. Füllen der zentralen HashMap fragenliste und Aufruf der einzelnen Methoden zum füllen der KategorieHM
 */
	
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
	
/*
 * Methode fügt zum Hilfsarray kategorien alle vorhandenen Kategorien hinzu	
 */
	public  void kategorienFuellen()
	{
		kategorien.add("Informatik");
		kategorien.add("Sport");
		kategorien.add("Games");
		kategorien.add("Rund um die Welt");	
		kategorien.add("Mathematik");	
		kategorien.add("Musik");	
		kategorien.add("Im Labor");	
		kategorien.add("Religion");	
		kategorien.add("In der Natur");	
		kategorien.add("Geschichte");	
		
	}
	
	
	/*
	 * Die Methode informatikFuellen füllt die Kategorie "Informatik" mit Fragen. Jede Frage wird einzeln als Frageobjekt an die Arraylist der Kategorie übergeben.
	 */
	
	public void informatikFuellen(int kategorieZahl)
	{
		int i = 1;
		String kategorie = "Informatik";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i,kategorie, 1, "Wieviele Bit hat ein Byte?", "2", "4", "8", "1024", 'c'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,kategorie, 2 ,"Wann wurde die Firma Microsoft gegründet?", "2", "4", "8", "1024", 'c'));
		i++;
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		
		
		//Fragen des Schwierigkeitsgrad 3
				
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
/*
 * Fragen zum Thema Religion	
 */
	
	public void religionFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Religion";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wann etwa wurde Jesus geboren?", " Jahr 0", "Jahr 33 v.Chr.", "7 v.Chr.", "713 n.Chr.", 'a'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie viele große Weltreligionen gibt es?","1", "2", "5", "13", 'a'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wer gehoert nicht zu den Evangelisten?", "Markus", "Lukas", "Johannes", "Jesus", 'b')) ;
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie nennen Muslime ihren Gott", "Allah", "Johega", "Jesus","Jahweh", 'a'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie lautet das erste Gebot?", "Du sollst neben mir keine anderen Goetter haben", "Du sollst nicht toeten", "Du sollst Sonntags in die Kirche", "Du sollst Vater und Mutter ehren", 'a'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie viele Sakramente gibt es??", "2", "5", "7","41", 'b'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Welcher diese Symbole gehört zum Judentum?", "Der Bücherstapel der 5 Heiligen Schriften", "7-armiger Leuchter", "Der gekreuzter Jesus","Die Hostie", 'a')) ;
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Was bedeutet Schalom?", "Frieden", "Hallo", "Danke Dir","Endlich Wochenende", 'b')) ;
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie heißt der wichtigster Pilgerort der Hindus?", "Samsara", "Benares", "Shiva","Moses", 'c'));
		i++;
		
		listeSchwierigkeit1.add(new Frage(i,"Religion",1,"Wie heißt der erste Sohn von Adam & Eva?", "Abel", "Kain", "Jesus","Moses", 'b')) ;
		i++;
		
	
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Was bedeutet Koscher?", "Lecker", "Rein", "gesalbt","Gut gewürzt", 'b')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Auf welchem Berg starb Jesus am Kreuz?", "Golgatha", "Mount Everst", "Zugspitze","Jordan", 'b')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"In welchen Fluss wurde Jesus getauft?", "Donau", "Ganges", "Jordan","Nil", 'b')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Welcher Prophet wurde in eine Löwengrube geworfen?", "Markus", "Daniel", "Lukas","Barbara", 'b')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Der Mitglieder-Anzahl nach zu urteilen sind die drei größten Religionen Christentum, Islam und…..", "Judentum", "Buddismus", "Hindu","Shinto", 'b')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"In welche Religion wurden Kreuzzüge durchgeführt?", "Islam", "Christentum", "Judentum","Buddismus", 'a')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Der Führer der 'Umma' wird…..genannt", "Papst", "Buddha", "Kalif","Eisenhauer", 'c')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"In welcher Religion gibt es weder eine Gottheit noch einen heiligen?", "Islam", "Shinto", "Zen","Hinduismus", 'c')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Welches ist ein jüdisches Gebet, dass während des Trauerjahr gesprochen wird?", "Kaddisch", "Ratisch", "Ragnarók","Sheriz", 'c')) ;
		i++;
		
		listeSchwierigkeit2.add(new Frage(i,"Religion",2,"Welcher römischer Gott entspricht Zeus?", "Merkur", "Jupiter", "Saturn","Es gibt keinen Gott der Zeus entspricht", 'c')) ;
		i++;
		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Welche Form des Buddismus zeichnete sich durch harte Meditationsübungen aus und prägt die japanische Kultur?", "Zen", "Ren", "Nen","Chakra", 'b')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Wie hieß Abrahams Sohn?", "Ismail", "Gustav", "Memet","Ahmad", 'a')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Die Jüdischen Monatsnamen kamen aus….", "Sinai", "Babylon", "Damaskus","Jerusalem", 'c')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"In welchem Land ist Buddismus Staatsreligion?", "Bhutan", "Japan", "China","Indien", 'c')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"In der nordischen Mythologie wird das Paradies….genannt?", "Himmel", "Mitgard", "Walhall","Odins palast", 'b')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Wie gelangt man in den Himmel der Wikinger?", "tapfer gefallene Krieger", "Ehrenhafte Menschen", "Wohlhabende Männer","sündenfrei Menschen", 'b')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Helheim ist das Totenreich der….", "Römer", "Wikinger", "Samurai","Kapitalisten", 'b')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"Wie viele Namen hat der Gott des Qurans?", "1000", "99", "57","1", 'b')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"'Die Tinte des Gelehrten und das Blut des Märtyreres haben vor den Himmel den gleichen Wert', ist ein Zitat aus….", "Christlichen Erzählungen", "Islamischen erzählungen", "Jüdischen Erzählungen","keiner dieser Religionen", 'c')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"'Alles, was ihr bittet in eurem Gebet, glaubt nur, das ihr es empfangt, so wird es euch zuteil werden.', ein Zitat aus….", "Der Bibel", "Den Quran", "Der Tora","keiner dieser Schriften", 'c')) ;
		i++;
		
		listeSchwierigkeit3.add(new Frage(i,"Religion",1,"'Und Wir machten den Sohn der Maria und seine Mutter zu einem Zeichen und gaben ihnen Zuflucht auf einem Hügel mit einer grünen Talmulde und dem fließenden Wasser von Quellen.' Ein Zitat aus….", "Der Bibel", "Den Quran", "Der Tora","keiner dieser Schriften", 'c')) ;
		i++;
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	public void gamesFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Games";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welches Werkzeug gibt es in Minecraft nicht?", "Schaufel", "Spitzhacke", "Axt", "Hammer", 'd')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Warum wurde Electronic Arts für Battlefront 2 gehated?", "schlechtes Gameplay ", "unfaire Preise ", "Pay to win", "schlechte Grafik ", 'c')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Farbe hat Marios Mütze?", "blau", "rot", "grün", "weiß", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wie heißt der spielbare Character aus der Zelda Reihe?", "Link", "Zelda", "Spyro", "Ganondorf", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "In welches Pokemon entwickelt sich Pikatschu?", "Kaiju", "Pichu", "Kaichu", "Raichu", 'd')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Farbe hat Sonic?", "Gelb", "Rot", "Blau", "Grün", 'c')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Was ist das offiziel schlechteste Spiel der Welt?", "Fallout 76", "E-T", "Battlefront 2", "Fortnite", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wie heißen die Hauptfiguren aus GTA 5?", "Michael, Trevor, Franklin", "Michal, Frank, Travor", "Frank, Travor, Ron", "Franklin, Travor, Ron", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wo spielt Red Dead Redemtion", "Rusland", "China", "Europa", "Amerika", 'd')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Firma hat Assassin’s Creed entwickelt?", "Uplay", "EA", "Ubisoft", "Steam", 'c')); 
		i++; 
	
	
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Welche Nummer hat Hitman", "76", "47", "13", "69", 'b')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wie viele Japaner gibt es in Overwatch", "0", "1", "2", "3", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wie viele Rassen gibt es im von Anfang an in World of Warcraft", "8", "9", "10", "11", 'a')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Welche Titanen-Klasse gibt es nicht in Titanfall 2", "Ronin", "Monarc", "Scorch", "Freez", 'd')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wann erschien Pong?", "1989", "2003", "1972", "1982", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wie viele Far Cry Teile gibt es?", "10", "13", "9", "11", 'b')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wie heißt der Hauptcharakter aus God of War?", "Kratos", "Zeus", "Artemis", "Poseidon", 'a')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Wo spielt World of Warcraft?", "Wakanda", "Glorantha ", "Camelot", "Azeroth", 'd')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "In welchem Jahr spielt Fallout 4?", "2100", "2077", "2287", "2253", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Games", 2, "Welches Fähigkeitensystem nutzt Battlefront 1?", "Karten", "Skilltree", "Gibt keine", "Klassen spezifisch", 'a')); 
		i++; 

		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Welches Spiel gibt es NICHT für den PC?", "Horizon Zero Dawn", "Mass Effect 4", "Rainbow Six Siege", "Don’t Starve", 'b')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie viele Level hat Super Mario Bros? ", "32", "16", "12", "24", 'a')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie viele Downloads hat Clash of Clans?", "750 Millionen", "250 Millionen", "100 Millionen", "500 Millionen", 'd')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wer war die Vorgängerin von Peach?", "Pauline", "Daisy", "Niemand", "Rosalina", 'a')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Was passiert, wenn man in Don’t Starve stirbt?", "Man verliert", "Man wird zum Geist", "Man wird zurückgesetzt", "Man respawnt", 'b')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie viele Operator gibt es in Rainbow Six Siege?", "45", "48", "46", "44", 'c')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie viele UNO Karten gibt es in einem Deck?", "45", "56", "32", "56", 'd')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie viele Pokemon gibt es in der ersten Generation?", "130", "150", "151", "101", 'c')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie heißt der Hauptcharakter aus Titanfall 2?", "Jackson Briggs", "Jack Cooper", "Jason Copper", "Jeff from the Overwatch Team", 'b')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Games", 3, "Wie heißt der neuste Held in For Honor?", "Sakura", "Hitoga", "Kanbatsu", "Rei", 'a')); 
		i++; 

		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	
	public void inDerNaturFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "In der Natur";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i, "In der Natur", 1,  "Welche Form haben Bienenwaben?", "Sechseckig", "Viereckig", "Rund", "Dreieckig", 'a'));
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "In der Natur", 1,  "Was entdeckten Archäologen in einem über 9000 Jahre alten Grab auf Zypern?", "Hund", "Katze", "Kuh", "Ziege", 'b'));
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Farbe hat Marios Mütze?", "blau", "rot", "grün", "weiß", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wie heißt der spielbare Character aus der Zelda Reihe?", "Link", "Zelda", "Spyro", "Ganondorf", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "In welches Pokemon entwickelt sich Pikatschu?", "Kaiju", "Pichu", "Kaichu", "Raichu", 'd')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Farbe hat Sonic?", "Gelb", "Rot", "Blau", "Grün", 'c')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Was ist das offiziel schlechteste Spiel der Welt?", "Fallout 76", "E-T", "Battlefront 2", "Fortnite", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wie heißen die Hauptfiguren aus GTA 5?", "Michael, Trevor, Franklin", "Michal, Frank, Travor", "Frank, Travor, Ron", "Franklin, Travor, Ron", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Wo spielt Red Dead Redemtion", "Rusland", "China", "Europa", "Amerika", 'd')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Games", 1, "Welche Firma hat Assassin’s Creed entwickelt?", "Uplay", "EA", "Ubisoft", "Steam", 'c')); 
		i++; 
	
	
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie viele Zähne hat ein Hai im Laufe seines Lebens?", "Bis zu 20.000", "Bis zu 25.000", "Bis zu 30.000", "Mehr als 35.000", 'c'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie hoch ist der höchste Baum der Welt?", "119.56m", "117.75m", "115.72m", "121.87m", 'c'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie groß ist der Durchmesser des dicksten Baumes der Welt?", "13.81m", "19.3m", "22.06m", "14.05m", 'd'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie groß wurde der größte Mensch der Welt?", "272cm", "246,6cm", "258cm", "278,2cm", 'a'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie viele Blütenblätter hat eine Apfelblüte?", "3", "5", "9", "13", 'b'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie orientiert sich ein Regenwurm?", "Lichtsinneszellen", "Facettenaugen", "Augen", "Tasthaare", 'a')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie viele Äpfel braucht man um einen Liter Apfelsaft zu machen?", "250g", "1,5kg", "12,5kg", "32kg", 'b'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Ein Apfel hat:", "Einen Kern", "Sieben Kerne", "Zehn Kerne", "17 Kerne", 'c'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Welches Säugetier legt Eier?", "Degu", "Seekuh", "Schnabeltier", "Krokodil", 'c'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Welches Tier schläft die meiste Zeit?", "Koala", "Faultier", "Alligator", "Nashorn", 'a'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Was frisst die Königskobra?", "Schlangen", "Eidechsen", "Insekten", "Frösche", 'a'));
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "In der Natur", 2,  "Wie lange Dauert der Winterschlaf eines Igels?", "3-4 Monate", "5-6 Monate", "2 Monate", "1 Monat", 'b'));
		i++; 
		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie viele Wildbienenarten gibt es?", "5.000-15.000", "20.000-25.000", "90.000-100.000", "15.000-20.000", 'b')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie viel Liter Methan produziert eine Kuh täglich?", "90-150", "10-20", "200-300", "300-360", 'c'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie stark sind Ameisen?", "Sie können das 50-60fache ihres Gewichts tragen", "Sie sind sehr schwach, doch in der Menge schaffen sie viel", "Ameisen können bis zu 80x ihr eigenes Gewicht tragen ", "Sie können das doppelte ihres eigenen Gewichts tragen", 'a'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie alt wird ein Grashüpfer durchschnittlich?", "1-2 Jahre", "3 Jahre", "4 Monate", "10 Monate", 'c'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wer hat die größten Ohren?", "Indischer Elefant", "Afrikanischer Elefant", "Mammut", "Alle haben gleich große Ohren", 'b'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wieviel Prozent des Planeten sind mit Wasser bedeckt?", "ca. 71%", "ca. 59 %", "ca. 62%", "ca. 74%", 'a'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie viele Mäusearten gibt es?", "55", "124 ", "40", "250", 'c'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie viele Keime sind auf einer ungewaschenen Hand?", "2,3 Millionen", "100 Millionen", "30 Millionen", "10 Millionen", 'd'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Welche Blume ist kein Korbblüter?", "Tulpe", "Aster", "Kornblume", "Rose", 'a')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Aus wie vielen Chromosomen besteht das Erbgut?", "26", "32", "46", "54", 'c'));
		i++; 

		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Was für Tiere sind Meerkatzen?", "Affen", "Fische", "Vögel", "Fische", 'a'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Welche Käferart hat das höchste Gewicht?", "Goliathkäfer", "Ölkäfer", "Mistkäfer", "Hirschkäfer", 'a'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Woraus wird der Farbstoff Sepia gewonnen?", "Tintenfisch", "Walurin", "Kot von Elefanten", "Käfer", 'a'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Wie viele Zähne haben Schäferhunde?", "42", "40", "38", "44", 'a'));
		i++;
		listeSchwierigkeit3.add(new Frage(i, "In der Natur", 3,  "Welches ist der größte Seevogel?", "Albertros", "Pinguin", "Möwe", "Seeadler", 'a'));
		i++;
		
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	
	public void sportFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Sport";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i,"Sport", 1,"Aus welcher Sportart stammen die Begriffe Eagle, Birdie und Bogey?", "Vom Springreiten", "Aus dem Golfsport", "Vom Fallschirmspringen", "Vom Tennis", 'b'));
		i++; 
		listeSchwierigkeit1.add(new Frage(i,"Sport",1, "Welcher Schwimmstil gilt als der schnellste der folgenden vier?", " Kraulschwimmen", " Rückenschwimmen", " Brustschwimmen", "Butterfly", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i,"Sport",1, "Warum zieht der Schiedsrichter beim Fußball die Rote Karte?", " Um das Ende des Spiels auch optisch zu signalisieren", " Um einem Spieler einen Platzverweis zu erteilen", " Um das Auswechseln eines Spielers anzukündigen", " Um den Start des Spiels auch optisch zu signalisieren", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i,"Sport",1, "Die höchste Auszeichnung bei den Bundesjugendspielen ist die…", " Ehrenurkunde", " Siegerurkunde", " Teilnahmeurkunde", " Gewinnerurkunde", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i,"Sport",1, "Wozu dient eine Slackline?", "Zum daran Hochklettern", "Zum abseilen", " Zum Balancieren", " Zur Sicherung beim Bergsteigen", 'c')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i,"Sport",1, "Wenn es nicht für die Gold- oder Silbermedaille gereicht hat, bekommt ein Sportler üblicherweise die…", " Bronzemedaille", " Messingmedaille", " Kupfermedaille", " Stahlmedaille", 'a')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Sport", 1,  "Auf welcher Unterlage spielt man Curling?", "Eis", "Holz", "Stein", "Granit", 'a'));
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Sport", 1,  "Aus welcher spanischen Stadt kommen die Fusballvereine FC und Betis?", "Madrid", "Sevilla", "Barcelona", "Almeria", 'b')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Sport", 1,  "In welchem Land fand die Fusball WM 1994 statt", "1998", "2002", "1994", "2004", 'c')); 
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Sport", 1,  "In welcher deutschen Stadt gründete sich der deutsche Fusballbund?", "Berlin", "Frankfurt", "Leipzig", "Hamburg", 'c'));
		i++; 
		listeSchwierigkeit1.add(new Frage(i, "Sport", 1,  "Welche dieser Figuren kommen nicht in einem traditionellem Schachspiel vor?", "Turm", "König", "Schütze", "Bauer", 'c')); 
		i++; 
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i,"Sport",2," Wie viele Löcher umfasst eine Golfrunde?", " 12", " 16", " 18", "21", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i,"Sport",2, "Hammerwurf gehört zu den Rasenkraftsportarten. Schätze, was der Hammer wiegt, der von männlichen Athleten geworfen wird!", " Etwa 1,6 Kilogramm", " Etwa 7,2 Kilogramm", " Etwa 19,4 Kilogramm", " Etwa 10,8 Kilogramm", 'b')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i,"Sport",2," Was verteilen Kunstturner in ihren Händen, um einen besseren Griff an der Turnstange zu haben?", " Magnesiumcarbonat", " Natriumchlorid (Kochsalz)", " Olivenöl", " Mehl", 'a')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i,"Sport",2," Was benötigt man zum Bouldern?", " Einen Fluss", " Einen Baum", " Eine Felswand", " Ein Pferd", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i,"Sport",2," Welche Karte kann der Schiedsrichter beim Hockey nicht ziehen?", " Die rote Karte ", " Die gelbe Karte ", " Die grüne Karte", " Die orange Karte", 'd')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i,"Sport",2," Die Bahnen im Schwimmbad müssen nach internationalen Bestimmungen für Wettkämpfe … lang sein.", " 20 Meter oder 40 Meter", " 27,5 Meter oder 55 Meter", " 30 Meter oder 60 Meter", " 25 Meter oder 50 Meter", 'd')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Sport", 2,  "In welchem Monat wird traditionell der deutsche Fusball Herrenmeister gekürt?", "Juli", "Dezember", "April", "Mai", 'd')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Sport", 2,  "Was ist die längste Abfahrt im alpinen Skirennsport?", "Die Streif", "Lauberhorn-Abfahrt", "Kandahar-Abfahrt", "Saslong-Abfahrt", 'b')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Sport", 2,  "Welche Farbe hat das Heimtrikot von Juventus Turin?", "Gelb-Weiß", "Schwarz-Rot", "Schwarz-Weiß", "Rot-Grün", 'c')); 
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Sport", 2,  "Welche Fußballmannschaft kommt NICHT aus London?", "Arsenal", "Chelsea", "Swansea", "Fulham FC", 'c'));  
		i++; 
		listeSchwierigkeit2.add(new Frage(i, "Sport", 2,  "Wie ist der aktuelle Weltrekord im 100m Sprint der Herren?", "5,32s", "9,58s", "8,35s", "15,34s", 'b')); 
		i++; 
		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
		listeSchwierigkeit3.add(new Frage(i,"Sport",3," Welche Sportart verbirgt sich wohl hinter dem englischen Begriff Octopush?", " Wasserbasketball", " Unterwasserrugby", " Wasserhandball", " Unterwasserhockey", 'd'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i,"Sport",3," Welche der folgenden Disziplinen gehört nicht zum Zehnkampf?", " Stabhochsprung", " Diskuswerfen", " 800 Meter-Lauf ", " Kugelstoßen", 'c'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i,"Sport",3," Eine Form des Kanus nennt man…", " Alasker", "Mexicaner ", " Isländer", " Kanadier", 'd')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Sport", 3,  "Bei welchem Fußballverein war Jögi Löw nie Trainer?", "Fc Schaffenhausen", "Karlsruher SC", "Eintracht Frankfurt", "Bayern München", 'd'));
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Sport", 3,  "Wie hoch ist der Weltrekord der Frauen beim Weitsprung?", "6,52m", "7,52m", "8,95m", "5.56m", 'b'));  
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Sport", 3,  "Wie schwer ist eine Diskusscheibe im olympischen Wettkampf bei den Herren in kg ?", "1", "2", "3", "4", 'b')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Sport", 3,  "Wie viele Klimmzüge schaffte Stephen Hyland 2006 innerhalb einer Stunde?", "1009", "254", "735", "1267", 'a')); 
		i++; 
		listeSchwierigkeit3.add(new Frage(i, "Sport", 3,  "Wie hoch ist der Rekord der erzielten Punkte von einem Spieler in einem Basketballspiel?", "100", "65", "87", "122", 'a')); 
		i++; 
		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	public void chemieFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Chemie";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Welches der folgenden Teilchen ist NICHT geladen?", "Ion", "Elektron", "Neutron", "Proton", 'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Was sind Elemente?", "Feuer, Wasser, Erde, Luft", "mit chemischen Mitteln nicht weiter zerlegbare Teilchen", "zentrale Teilgebiete der Chemie", "elektrisch geladene Metalle", 'b'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Wenn ein Element 5 Elektronen hat, wie viele Protonen hat es?", "3", "doppelt so viele", "gar keine, denn es ist negativ geladen", "5", 'd'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Woraus bestehen Salze.", "Aus einem Kation und einem Anion", "Aus einem Proton und einem Elektron", "Aus einem Gas und einer Flüssigkeit", "Aus Meersand oder Bergsteinen", 'a'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Was verbrennt bei einer Kerze, um die Kerzenflamme aufrechtzuerhalten?", "Der Docht", "Das Wachs", "Die Luft um die Kerze herum", "Die im Docht gespeicherte Energie wird freigesetzt, nichts davon brennt.", 'b'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Welche der folgenden Summenformeln beschreibt eine Hydroxygruppe", "CH4", "-NH2", "-OH", "-NN-", 'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Was ist ein Polykondensat", "Eine Art Kunststoff", "Eine Entsalzungsanlage", "Eine Art Metall", "Eine Art Gas", 'a'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Woraus bestehen Proteine?", "", "Aus Fettsäuren", "Aus Eiweiß", "Aus Aminosäuren", 'd'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Wie lautet die Summenformel von Salzsäure?", "HCLNa2", "HCL", "HNa", "HBs", 'b'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Chemie", 1, "Was sind Orbitale", "Sternwarten", "Umlaufbahnen der Monde um ihre Planeten", "Aufenthaltsbereiche der Atome in einem Molekül", "Die Wellenfunktion eines Elektrons, die auch den wahrscheinlichen Aufenthaltsbereich desselben beschreibt", 'c'));
        i++;

	
	
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Wie nennt man eine Reaktion, bei der Energie freigesetzt wird?", "Endotherm", "Expeliotherm", "Exotherm", "Energetiär", 'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Welches der folgenden Metalle ist kein Element?", "Gold", "Silber", "Bronze", "Kupfer", 'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Das Gift einer Biene ist eine Säure. Um nach einem Bienenstich den Schmerz zu lindern", "hält man sich eine aufgeschnittene Zwiebel auf die Stichstelle.", "hält man sich eine aufgeschnittene Zitrone auf die Stichstelle.", "bedeckt man die Stichstelle mit Honig.", "benutzt man haushaltsübliches Backpulver.", 'd'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Was gibt die Ordnungszahl eines Elementes im Periodensystem an?", "Die Anzahl der Protonen im Kern", "Die Siedetemperatur", "Die Bindungswertigkeit", "Die Anzahl der Valenzelektronen", 'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Welches der folgenden Stoffe bezeichnet man auch als Trinkalkohol?", "Methanol", "Ethanol", "Propanol", "Butanol", 'b'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Welches der folgenden Stoffe existiert?", "Photanium", "Methen", "Ethen", "Methin", 'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Ab wann gilt ein Stoff als sauer?", "PH-Wert unter 7", "PH-Wert über sieben", "PH-Wert unter Null", "Wenn er ätzend ist.", 'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Was ist der Oberbegriff für gesättigte, acyclische Kohlenwasserstoffe?", "Alkane", "Alkene", "Alkine", "Alkone", 'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Warum sind Flourchlorkohlenwasserstoffe in Deutschland verboten?", "Weil sie für Mensch und Tier giftig sind.", "Weil sie für die Ozonschicht schädlich sind.", "Weil sie hochenzündlich sind.", "Flourchlorkohlenwasserstoffe sind in Deutschland nicht verboten.", 'b'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Chemie", 2, "Worin liegt die Polarität eines Moleküls begründet?", "In der Nähe zum Magnetfeld der Erde.", "In der Richtung des Stromflusses.", "In der Ausrichtung der Elementarmagneten.", "In der Elektronegativität der Bestandteile.", 'd'));
        i++;


		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Welches Elementsymbol hat Silber?", "Ag", "Si", "S", "Ber", 'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Was ist Plasma", "Die Flüssigkeit, die in Lavalampen verwendet wird.", "Plasma existiert nicht wirklich; Die Klingen der Lichtschwerter aus Star Wars™ bestehen daraus.", "Der vierte Aggregatzustand: Ionisiertes Gas", "Ein Gestein, das auf der Oberfläche des Uranus vorkommt", 'c'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Verbrennungen sind, chemisch betrachtet,", "Reaktionen, bei denen sich Kohlenstoff bildet.", "immer Reaktionen mit Sauerstoff.", "Reaktionen, bei denen Feuer entsteht.", "Explosionen.", 'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Welche dieser Säuren ist die chemische Bezeichnung für Ameisensäure?", "Antininsäure", "Curicansäure", "Tritinsäure", "Methansäure", 'd'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Wie lautet die Chemische Bezeichnung für Vitamin C?", "Phenolsäure", "Aceton", "Methylalkylat", "Ascorbinsäure", 'd'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Das Verfahren, ein Stoffgemisch durch die unterschiedliche Verteilung seiner Einzelbestandteile aufzutrennen, nennt man", "Chromosomie", "Chromatolyse", "Chromatografie", "Kalligrafie", 'c'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Wie nennt man das Aufspalten größerer Moleküle in kleinere durch hohe Temperaturen?", "Pyrolyse", "Thermomanie", "Thermospaltung", "Thermolyse", 'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Welche Farberscheinung wird beim Anstrahlen einer roten Tomate mit grünem Licht in einem vollkommen abgedunkelten Raum sichtbar?", "Die Tomate erscheint Gelb.", "Die Tomate erscheint Rot.", "Die Tomate erscheint Grün.", "Die Tomate reflektiert gar kein Licht und erscheint somit Schwarz.", 'd'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Welches der folgenden Säuren kann Gold zersetzen?", "Phosphorsäure", "Kieselsäure", "Königswasser", "Salzsäure", 'c'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Chemie", 3, "Wie viele Elemente enthält das Periodensystem der Elemente?", "73", "157", "389", "118", 'd'));
        i++;

		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	public void imLaborFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Im Labor";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Aus wie vielen Atomen besteht ein Wassermolekül?","1","2","3","4",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Welche Farbe hat Wasserstoff?","rot","blau","farblos","weiß",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Unter welchem Namen ist Diwasserstoffmonoxid auch bekannt?","Luft","Stickstoffoxid","Wasserstoff","Wasser",'d'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1, "Was entsteht bei der Knallgasreaktion?","Helium","Wasserstoff","Wasser","Sauerstoff",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Was ist Gips?","Silberoxid","Caliumpermanganat","Caliumsulfat","Magnesiumsulfid",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Wie kann Deuterium auch bezeichnet werden?","leichter Sauerstoff","schwerer Wasserstoff","Uran ","Magnesiumsulfid",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor ",1, "Was ist die chemische Formel von Schwefeltrioxid?","NaSO4","NaOH","SO3","HCl",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor ",1, "Unter welchem Namen ist Desoxyribonucleinsäure auch bekannt?","Wasser","RNA","DANN","DNS",'d'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor ",1, "Was berechnet man in der Stochastik?","Flächen","Schnittpunkte","Wahrscheinlichkeit","Keine der Antworten ist korrekt",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Im Labor ",1, "Was erhält man, wenn man zwei Primzahlen, die größer als 2 sind, addiert?","Eine gerade Zahl","Einen Bruch","Eine ungerade Zahl","Eine Sekundärzahl",'a'));
        i++;

        listeSchwierigkeit1.add(new Frage(i, "Im Labor",1,"Wie vielen Mililiter entspricht ein Deziliter?","10 000","1 000","100","10",'c'));
        i++;
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"In welcher Hauptgruppe steht Bismut?","3","4","5","6",'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"Welcher Buchstabe kommt nicht im Periodensystem vor?","W","J","Z","L",'b'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"In welchem Monat ist die Erde am weitesten von der Sonne entfernt?","Januar","Februar","Juni","Juli",'d'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"Welches Element wird auch Plubum genannt?","Blei","Rhodium","Copernicium","Gallium",'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor ",2, "Was enthält hartes Wasser?","Natrium","Chlor und Sauerstoff","Klumpen","Magnesium und Calcium",'d'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor ",2, "Was entspricht einem Hektar (ha)?","10.000 Quadratmeter","1000 Quadratmeter","1000 Meter","1000 Kilometer",'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"Wie lange braucht ein Lichtstrahl von der Erde zum Mond?","ca. 1 Stunde","ca. 1 Minute","ca. 1 Sekunde","ca. 0,1 Sekunden",'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Im Labor",2,"Wie viele Ecken hat ein Dodekagon?","9","12","15","30",'b'));
        i++;

		
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3," Welches der folgenden ist kein Element?","Röntgenium","Erbium","Americium","Xanthan",'d'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3," Auf welcher Skala wird Windgeschwindigkeit gemessen?"," Beaufort-Skala","Newton-Skala","Einstein-Skala","Bar-Skala",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wer entdeckte die Molekularstruktur der Desoxyribonukleinsäure?","Peter Silverman und John Smith","Gordon Olsen","Heinrich Schmidt und Konstantin Ribo","James Watson und Francis Crick",'d'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3," Wann erreichte das 1990 gestartete 'Humangenomprojekt' sein Ziel der Sequenzierung der gesamten menschlichen DNA?","1990","2003","2005","2009",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Was wird durch das Abbe-Limit beschränkt?","Lichtabsorbtion","Auflösung im Lichtmikroskop","Die Reaktionsgeschwindigkeit bei Raumtemperatur","Teilchendichte bei Raumtemeratur",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor ",3, "Nach wem wurde ein weltbekanntes deutsches Institut für Polar- und Meeresforschung benannt?","Alfred Wegener","Alfred Humboldt","Friedemann Schulz von Thun","Max Planck",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor ",3, "Newtons zweites Gesetz wird als 'F = m*a' beschrieben. Wofür steht das 'a' in der Gleichung?","Hektar","Beschleunigung","Ampere","Geschwindigkeit",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor ",3, "Nitropena ist ein brisanter Sprengstoff, wird jedoch auch als Medikament verwendet, Wofür?","Adrenalinausschüttung","Dopaminersatz","Zur Gefäßerweiterung","Keine der Antworten ist korrekt",'c'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wie schnell bewegt sich elektromagnetische Strahlung im Vakuum?","ca. 300 000 000 m/s","ca. 3 000 000 m/s","ca. 300 000 m/s","ca. 30 000 m/s",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wie viel sauerer ist ein Stoff mit dem pH wert 3 einem Stoff mit pH Wert 5?","100 Mal","10 Mal m/s","1,666 Mal","0,1 Mal",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Worunter ist Alpha-Methyphenethylamin auch bekannt?","Aspirin","Amphetamin","Arginin","Argon",'b'));
        i++;

		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}
	
	public void musikFuellen(int kategorieZahl)
	{ 
		int i = 1;
		String kategorie = "Musik";
		
		if (fragenliste.containsKey(kategorie))
		{
		HashMap<Integer, ArrayList<Frage>> hmFuerKategorie = fragenliste.get(kategorie); // lokale Variable Liste enthält die Arraylist für diese Kategorie
		
		//Fragen des Schwierigkeitsgrad 1
		
		ArrayList<Frage> listeSchwierigkeit1 = hmFuerKategorie.get(1);
		
		listeSchwierigkeit1.add(new Frage(i, "Musik",1,"In welchem Land findet das Musikfestival TomorrowWorld statt? ","Großbritanien","USA","Frankreich","Deutschland",'b')); 
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Musiker benutzen ein Gerät zur Vorgabe und Einhaltung des Taktes. Wie heißt es?","Metronom","Taktgeber","Takthalter","Metrom",'a')); 
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Wie viele Tasten haben die meisten heutzutage produzierten Klaviere?","80","88","90","100",'b'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Wie viele schwarze Tasten befinden sich auf einem Klavier zwischen zwei C-Noten?","3","4","5","6",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Welches Tier liefert sich in einem Kinderlied mit einem Kuckuck einen Wettstreit im Singen?","Pferd","Spatz","Specht","Esel",'d'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Welche Zeile folgt auf 'Amsel, Drossel, Fink und Star...' im berühmten Kinderlied 'Alle Vögel sind schon da'?","und die ganze Vogelschar","und die ganze Tierschar","Welch ein Singen, Musizieren, Pfeifen, Zwitschern, Tirilieren","Wie sie alle lustig sind, flink und froh sich regen",'a'));

        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Welchen Notenschlüssel verwendet man beim Cello vorwiegend?","Violienenschlüssel","Bassschlüssel","Celloschlüssel","Notensschlüssel",'b'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Wie viele Studio-Alben veröffentlichten ‚‚The Beatles''?","10","11","12","13",'c'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Welcher Hit beginnt mit den Zeilen ‚‚Gründlich durchgechekt steht sie da und wartet auf den Start: Alles klar.''?"," Major Tom (völlig losgelöst)","Völlig losgelöst","Major Tom","Tom",'a'));
        i++;
        
        listeSchwierigkeit1.add(new Frage(i, "Musik",1,"Wer landete mit dem Song ‚‚Vom selben Stern'' 2007 einen Hit?","Die Toten Hosen","Ich+Ich","Die Ärzte","Deichkind",'b'));
        i++;
		
		
		//Fragen des Schwierigkeitsgrad 2
		
		ArrayList<Frage> listeSchwierigkeit2 = hmFuerKategorie.get(2);
				
		listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welche deutsche Band veröffentlichte im Jahr 2012 das Album ‚‚Ballast der Republik''?","Die Toten Hosen","Ich+Ich","Die Ärzte","Deichkind",'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Wann wurden die Rolling Stones gegründet?","1960","1961","1962","1963",'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welches Musik-Genre wird den Bands ‚‚Helloween'', ‚‚Gamma Ray'' und ‚‚Rhapsody'' zugeschrieben?","Death Metal","Folk Metal","Gothic Metal","Power Metal",'d'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welche deutsche Sängerin hatte große Erfolge mit ‚‚Nur geträumt'', ‚‚Leuchtturm'' und ‚‚Irgendwie, Irgendwo, Irgendwann''?","Nena"," Sandra"," Nicole"," Lena",'a'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Auf den Hits welchen Musikers basiert das Musical 'Ich war noch niemals in New York?'","Roger Cicero","Jan Delay","Udo Jürgens","Udo Lindenberg",'c'));
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welcher berühmte Komponist schrieb die Filmmusiken zu unter anderem 'Star Wars', 'Schindlers Liste' oder 'Harry Potter'?","John Wiliams","Ramin Djawadi","Hans Zimmer","Howard Shore",'a')); 
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welches Musikalbum ist bis heute das meistverkaufte aller Zeiten?","A Night at the Opera - Queen","Abbey Road – The Beatles","Thriller - Michael Jackson","The Marshall Mathers LP - Eminem",'c')); 
        i++;
        
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"In welcher Stadt ist die Band 'The Beatles' beheimatet?","London","Cambridge","Oxford","Liverpool",'d')); 
        i++;

        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Welches Schicksal ereilte den Komponisten Ludwig van Beethoven?","Blindheit","Stummheit","Taubheit","Amputation",'c')); 
        i++;
		
        listeSchwierigkeit2.add(new Frage(i, "Musik",2,"Durch welchen Fernsehauftritt wurde die Band ABBA bekannt?","MTV","VIVA","Eurovision Song Contest","Interview bei BBC",'c')); 
        i++;
        
		//Fragen des Schwierigkeitsgrad 3
			
		ArrayList<Frage> listeSchwierigkeit3 = hmFuerKategorie.get(3);
		
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3," Welches der folgenden ist kein Element?","Röntgenium","Erbium","Americium","Xanthan",'d'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Auf welcher Skala wird Windgeschwindigkeit gemessen?"," Beaufort-Skala","Newton-Skala","Einstein-Skala","Bar-Skala",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wer entdeckte die Molekularstruktur der Desoxyribonukleinsäure?","Peter Silverman und John Smith","Gordon Olsen","Heinrich Schmidt und Konstantin Ribo","James Watson und Francis Crick",'d'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wann erreichte das 1990 gestartete 'Humangenomprojekt' sein Ziel der Sequenzierung der gesamten menschlichen DNA?","1990","2003","2005","2009",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Was wird durch das Abbe-Limit beschränkt?","Lichtabsorbtion","Auflösung im Lichtmikroskop","Die Reaktionsgeschwindigkeit bei Raumtemperatur","Teilchendichte bei Raumtemeratur",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3, "Nach wem wurde ein weltbekanntes deutsches Institut für Polar- und Meeresforschung benannt?","Alfred Wegener","Alfred Humboldt","Friedemann Schulz von Thun","Max Planck",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3, "Newtons zweites Gesetz wird als 'F = m*a' beschrieben. Wofür steht das 'a' in der Gleichung?","Hektar","Beschleunigung","Ampere","Geschwindigkeit",'b'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3, "Nitropena ist ein brisanter Sprengstoff, wird jedoch auch als Medikament verwendet, Wofür?","Adrenalinausschüttung","Dopaminersatz","Zur Gefäßerweiterung","Keine der Antworten ist korrekt",'c'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wie schnell bewegt sich elektromagnetische Strahlung im Vakuum?","ca. 300 000 000 m/s","ca. 3 000 000 m/s","ca. 300 000 m/s","ca. 30 000 m/s",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Wie viel sauerer ist ein Stoff mit dem pH wert 3 einem Stoff mit pH Wert 5?","100 Mal","10 Mal m/s","1,666 Mal","0,1 Mal",'a'));
        i++;
        
        listeSchwierigkeit3.add(new Frage(i, "Im Labor",3,"Worunter ist Alpha-Methyphenethylamin auch bekannt?","Aspirin","Amphetamin","Arginin","Argon",'b'));
        i++;

		
		}else {
			System.out.println("Kategorie nicht enthalten");
		}
	}


	/*
	 * Methode zur Ausgabe einer Frage aus einer bestimmten Kategorie und einer bestimmten Stufe
	 */
	
	public Frage zufaelligeFrageAusgebenMitStufe(String kategorie, int stufe)
	{
		Frage frage = this.fragenliste.get(kategorie).get(stufe).get((int) Math.round(Math.random()*this.fragenliste.get(kategorie).get(stufe).size()-1));
		
		return frage;
	}
}
