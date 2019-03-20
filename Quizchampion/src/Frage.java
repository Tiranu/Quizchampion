
public class Frage {

	
private int nummer;
private int kategorie;
private String frage;

private String antwortA;
private String antwortB;
private String antwortC;
private String antwortD;

private String korrekteAntwort;

/**
 * @param nummer
 * @param kategorie
 * @param frage
 * @param antwortA
 * @param antwortB
 * @param antwortC
 * @param antwortD
 * @param korrekteAntwort
 */

public Frage(int nummer, int kategorie, String frage, String a, String b, String c, String d, String korrekteAntwort) {
	super();
	this.nummer = nummer;
	this.kategorie = kategorie;
	this.frage = frage;
	this.antwortA = a;
	this.antwortB = b;
	this.antwortC = c;
	this.antwortD = d;
	this.korrekteAntwort = korrekteAntwort;
}




public int getNummer() {
	return nummer;
}

private void setNummer(int nummer) {
	this.nummer = nummer;
}

public int getKategorie() {
	return kategorie;
}

private void setKategorie(int kategorie) {
	this.kategorie = kategorie;
}

public String getFrage() {
	return frage;
}

private void setFrage(String frage) {
	this.frage = frage;
}

public String getA() {
	return antwortA;
}

private void setA(String a) {
	this.antwortA = a;
}

public String getB() {
	return antwortB;
}

private void setB(String b) {
	this.antwortB = b;
}

public String getC() {
	return antwortC;
}

private void setC(String c) {
	this.antwortC = c;
}

public String getD() {
	return antwortD;
}

private void setD(String d) {
	this.antwortD = d;
}

public String getKorrekteAntwort() {
	return korrekteAntwort;
}

private void setKorrekteAntwort(String korrekteAntwort) {
	this.korrekteAntwort = korrekteAntwort;
}





}
