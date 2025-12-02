public class Rechteck extends GeometrischeForm{
	// Attribute
	private double breite;
	private double hoehe;
	
	// Konstruktoren
	public Rechteck() {
		super(); // Default Kontruktor
		this.breite = 2;
		this.hoehe = 1;
	}
	
	public Rechteck(Punkt startpunkt, double h, double b) {
		super(startpunkt);
		this.breite = b;
		this.hoehe = h;
	}
	
	public Rechteck(double xstart, double ystart, double h, double b) {
		this(new Punkt(xstart, ystart), h,b); // Rufe den anderen Konstruktor auf, der dem Startpunkt direkt unterstützt
	}
	
	// Methoden
	public double getHoehe() {
		return this.hoehe;
	}
	
	public double getBreite() {
		return this.breite;
	}
	
	public double berechneFlaeche() {
		return breite*hoehe;
	}
	
	public double berechneUmfang() {
		return 2*(breite + hoehe);
	}
	
	public String toString() {
		return "Rechteck:\nStartpunkt: "+super.getStartpunkt().toString() + "\nbreite: "+this.breite+"\nhöhe: "+this.hoehe;
	}
	
	public boolean equals(Rechteck r) {
		return(getStartpunkt().equals(r.getStartpunkt()) && hoehe == r.getHoehe() && breite == r.getBreite());
	}
	
}
