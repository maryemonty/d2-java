package d2;

public class Main {

	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(50, 100);
		Rettangolo r2 = new Rettangolo(25, 50);
		
		System.out.println( r.stampaRettangolo());
		System.out.println( r2.stampaRettangolo());
		System.out.println( Rettangolo.stampaDueRettangoli(r, r2));
		
		Sim sim = new Sim("1234567890");
	    sim.stampaDati();
	}

}
