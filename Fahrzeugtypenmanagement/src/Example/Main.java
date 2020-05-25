package Example;

public class Main {

	public static void main(String[] args) {
		
		Auto audi = new Auto(225, "Audi", 6);
		System.out.println("Modelname " + audi.getModellname() + "\nLeistung in PS: " + audi.getLeistung() + "\nGaenge: " + audi.getGaenge());
		audi.acclerate();
		audi.breaking();
		audi.countOfWheels(4);
		audi.currentSpeed();
		Fahrrad ktm = new Fahrrad( 2, "KTM", 21);
		System.out.println("Modellname " + ktm.getModellname() + "\nLeistung in PS: " + ktm.getLeistung() + "\nGaenge: " + ktm.getGaenge() );
		ktm.countOfWheels(2);
		LKW man = new LKW(600, "MAN", 8, 30);
		System.out.println("Modelname: " + man.getModellname() + "\nLeistung in PS: " + man.getLeistung() + "\nGaenge: " + man.getGaenge() + "\nLadevolumen: "  + man.ladeflaeche());
		man.countOfWheels(4);
		Flugzeug pegasus = new Flugzeug(220, "Pegasus:", 2);
		System.out.println("Modelname: " + pegasus.getModellname() + "\nLeistung in KN: " + pegasus.getLeistung());
		pegasus.countOfWheels(7);
		Elektroauto tesla = new Elektroauto(600, "Tesla", 1, 1);
		System.out.println("Modellname: " + tesla.getModellname() +  "\nLeistung in PS: " + tesla.getLeistung() + "\nGaenge: " + tesla.getGaenge() + "\nAkkuanzahl: " + tesla.getBatterie());
		tesla.countOfWheels(4);
		tesla.oekonmoisch();
	}
	
}