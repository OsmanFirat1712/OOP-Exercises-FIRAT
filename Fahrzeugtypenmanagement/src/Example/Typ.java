package Example;
public abstract class Typ {
	
	private int leistung;
	private String modellname;


	
	public Typ(int leistung, String modellname) {
		super();
		this.leistung = leistung;
		this.modellname = modellname;
	}

	
	public int getLeistung() {
		return leistung;
	}


	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}


	public String getModellname() {
		return modellname;
	}


	public void setModellname(String modellname) {
		this.modellname = modellname;
	}


	public void acclerate() {
		
	}
	
	public void breaking() {
		
	}
	
	public void countOfWheels() {
		
	}
	
	public void currentSpeed() {
		
	}
		

	

}