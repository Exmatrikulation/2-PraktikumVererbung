public class Kreis extends GeometrischeForm {
	// Attribute
	private int radius;
	
	// Konstruktoren
	public Kreis(Punkt punkt, int radius) {
		super(punkt);
		this.radius = radius;
	}
	
	// Methoden
	public String toString() {
		return "Kreis:\nmittelpunkt: "+super.getStartpunkt().toString()+"\nradius: "+this.radius;
	}
	
	// Zusatz
	public double getRadius() {
		return this.radius;
	}
	public boolean equals(Kreis k) {
		return ((super.getStartpunkt().equals(k.getStartpunkt())) && radius == k.getRadius());
	}
}
