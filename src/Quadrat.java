public class Quadrat extends Rechteck {
	// Konstruktoren
	public Quadrat() {
		super(new Punkt(0,0), 1, 1); // Erzeuge auf 0,0 ein quadrat mit 1/1
	}
	
	public Quadrat(Punkt startpunkt, int a) {
		super(startpunkt, a, a);
	}
}
