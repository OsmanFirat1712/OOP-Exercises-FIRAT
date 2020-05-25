package Example;

public class Fahrrad extends Typ {

	int gaenge;
	public Fahrrad(int leistung, String modellname, int gaenge) {
		super(leistung, modellname);
	this.gaenge = gaenge;
	
	}

	public int getGaenge() {
		return gaenge;
	}

	public void setGaenge(int gaenge) {
		this.gaenge = gaenge;
	}

	public void acclerate() {
		System.out.println("Beschleunigung;");
		
	}
	
	public void breaking() {
		System.out.println("Bremsen");
	}
	
	public void countOfWheels(int raeder) {
		System.out.println("Anzahl der Räder: " + raeder);
	}
	
	public void currentSpeed() {
		
	}
	



}
