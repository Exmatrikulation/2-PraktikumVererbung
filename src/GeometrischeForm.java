public class GeometrischeForm {
	// Attribute
	private Punkt startpunkt;
	
	// Konstruktoren
	public GeometrischeForm() {
		// Erzeuge neuen Punkt im Koordinatenursprung
		this.startpunkt = new Punkt(); 
	}
	
	public GeometrischeForm(Punkt startpunkt) {
		this.startpunkt = startpunkt;
	}
	
	// Methoden
	public void versetzen(int xNeu, int yNeu) {
		this.startpunkt.versetzen(xNeu, yNeu);
	}
	
	public void verschieben(int dx, int dy) {
		this.startpunkt.verschieben(dx, dy);
	}
	
	public Punkt getStartpunkt() {
		return this.startpunkt;
	}
}
