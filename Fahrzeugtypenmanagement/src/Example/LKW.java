package Example;


public class LKW extends Typ {
double ladeflaeche;
int gaenge;

	public LKW(int leistung, String modellname, int gaenge, double ladeflaeche) {
		super(leistung, modellname);
		this.ladeflaeche = ladeflaeche;
		this.gaenge = gaenge;
		
		
	}
	public double ladeflaeche() {
		return ladeflaeche;
	}
	public void setLaderaum(double ladeflaeche) {
		this.ladeflaeche = ladeflaeche;
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
		System.out.println("Anzahl der Raeder: " + raeder);
	}
	
	public void currentSpeed() {
		
	}
	
	
	
}
