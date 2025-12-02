public class Vererbungstester {
	public static void main(String[] args) {
		// Erzeuge für alles ein Objekt
		Dreieck dreieck = new Dreieck();
		Rechteck rechteck = new Rechteck();
		Quadrat quadrat = new Quadrat();
		
		// Für Kreis erzeuge Punkt
		Punkt punktFuerKreisWeilKnutHaltKnutIst = new Punkt(5,5);
		Kreis kreis = new Kreis(punktFuerKreisWeilKnutHaltKnutIst, 5);
		
		// Ausgabe aktueller Starnd
		System.out.println(dreieck.toString());
		System.out.println(rechteck.toString());
		System.out.println(quadrat.toString());
		
		// versetze jedes Objekt um x4 y5
		dreieck.versetzen(4, 5);
		rechteck.versetzen(4, 5);
		quadrat.versetzen(4, 5);
		kreis.versetzen(4, 5);
		
		// Ausgabe aktueller Starnd
		dreieck.toString();
		rechteck.toString();
		quadrat.toString();
		kreis.toString();
		
		
		/*
		 * Universelle quals Methode ergiebt keinen Sinn, da es sich um unterschiedliche formen handelt. ausser man will startpunkt vergleichen cuh
		 */
	}
}
