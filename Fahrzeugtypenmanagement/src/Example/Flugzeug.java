package Example;

public class Flugzeug extends Typ {

	int flugelanzahl;
	public Flugzeug(int leistung, String modellname, int fluegelanzahl) {
		super(leistung, modellname);
		
	}
	public int getFlugelanzahl() {
		return flugelanzahl;
	}
	public void setFlugelanzahl(int flugelanzahl) {
		this.flugelanzahl = flugelanzahl;
	}
	public void acclerate() {
	} {
		System.out.println("Beschleunigung;");
	}
	
	public void brea() {
		System.out.println("Bremsen");
	}
	
	public void countOfWheels(int raeder) {
		System.out.println("Anzahl der Räder: " + raeder);
	}
	
	
	public void currentSpeed() {
		
	}
	

}
