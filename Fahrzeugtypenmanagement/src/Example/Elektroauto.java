package Example;

public class Elektroauto extends Auto implements Umweltschonend{

	int batterie;
	public Elektroauto(int leistung, String modellname, int gaenge, int batterie) {
		super(leistung, modellname, gaenge);
		this.batterie = batterie;
			}
	
	public int getBatterie() {
		return batterie;
	}

	public void setBatterie(int batterie) {
		this.batterie = batterie;
	}

	public void acclerate() {
	} {
		System.out.println("Beschleunigung;");
	}
	
	public void breaking() {
		System.out.println("Bremsen");
		
	}
	
	public void countOfWheels() {
		System.out.println("Anzahl der Räder");
	}
	
	public void currentSpeed() {
		
	}

	@Override
	public void oekonmoisch() {
	System.out.println("Umweltschonende Antriebsart");
	
		
	}

	

	
	
	
	

}
