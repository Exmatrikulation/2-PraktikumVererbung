public class Dreieck extends GeometrischeForm{
	// Attribute
	private Punkt b;
	private Punkt c;
	
	// Konstruktoren
	public Dreieck() {
		super (); // Rufe super Konstruktor auf um Punkt in 0/0 zu erzeugen
		b = new Punkt(1,0);
		c = new Punkt(0,1);
	}
	
	public Dreieck(Punkt a, Punkt b, Punkt c) {
		super(a);
		this.b = b;
		this.c = c;
	}
	
	// Methoden
	public String toString() {
		return "Dreieck: \na:"+super.getStartpunkt().toString() + "\nb:"+b.toString()+"\nc:"+c.toString();
	}
	
	// Zusatz
	public Punkt getB() {
		return this.b;
	}
	
	public Punkt getC() {
		return this.c;
	}
	
}
