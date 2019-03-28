
public class Frage {

	
private int nummer;
private int kategorie;
private int schwierigkeitsgrad; //1 leicht, 2 mittel, 3 schwer
private String frage;

private String antwortA;
private String antwortB;
private String antwortC;
private String antwortD;

private Character korrekteAntwort;

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

public Frage(int nummer, int kategorie, int schwierigkeitsgrad, String frage, String a, String b, String c, String d, Character korrekteAntwort) {
	super();
	this.nummer = nummer;
	this.kategorie = kategorie;
	this.frage = frage;
	this.antwortA = a;
	this.antwortB = b;
	this.antwortC = c;
	this.antwortD = d;
	this.korrekteAntwort = korrekteAntwort;
	this.schwierigkeitsgrad = schwierigkeitsgrad;
}




public int getSchwierigkeitsgrad() {
	return schwierigkeitsgrad;
}



private void setSchwierigkeitsgrad(int schwierigkeitsgrad) {
	this.schwierigkeitsgrad = schwierigkeitsgrad;
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



public String getAntwortA() {
	return antwortA;
}




private void setAntwortA(String antwortA) {
	this.antwortA = antwortA;
}




public String getAntwortB() {
	return antwortB;
}




private void setAntwortB(String antwortB) {
	this.antwortB = antwortB;
}




public String getAntwortC() {
	return antwortC;
}




private void setAntwortC(String antwortC) {
	this.antwortC = antwortC;
}




public String getAntwortD() {
	return antwortD;
}




private void setAntwortD(String antwortD) {
	this.antwortD = antwortD;
}




public Character getKorrekteAntwort() {
	return korrekteAntwort;
}

private void setKorrekteAntwort(Character korrekteAntwort) {
	this.korrekteAntwort = korrekteAntwort;
}





}
