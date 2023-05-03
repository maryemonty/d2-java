package d2;

public class Rettangolo {
	
	int altezza;
	int larghezza;
	
	public Rettangolo(int altezza, int larghezza){
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	int perimetro() {
		return (2*altezza) + (2*larghezza);
	}
	
	int area() {
		return larghezza * altezza;
	}
	
	public String stampaRettangolo() {
		return perimetro() + " " + area();
	}
	
	public static String stampaDueRettangoli(Rettangolo r, Rettangolo r2) { 
		int sumP = r.perimetro() + r2.perimetro();
		int sumA = r.area() + r2.area();
		return sumP + " " + sumA;
	}
	
	
}
