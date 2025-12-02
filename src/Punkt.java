public class Punkt {
	// Attribute
	private double x;
	private double y;
	
	// Konstruktoren
	public Punkt() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punkt(double xWert, double yWert) {
		this.x = xWert;
		this.y = yWert;
	}
	
	// Methoden
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "Punkt liegt auf ("+x+"/"+y+")";
	}
	
	public void verschieben(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void versetzen(double xNeu, double yNeu) {
		this.x = xNeu;
		this.y = yNeu;
	}
	
	public boolean equals(Punkt p) {
		return ((x == p.getX()) && (y == p.getY()));
	}
}
