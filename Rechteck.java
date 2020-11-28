
/**
 * Die Klasse modelliert ein Rechteck
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rechteck
{
    private int zA, zB;

    /**
     * Konstruktor für Objekte der Klasse Rechteck
     */
    public Rechteck(int pA, int pB) {
        // Instanzvariable initialisieren
        zA = pA;
        zB = pB;
    }
    
    public Rechteck(int pA) {
        zA = pA;
        zB = pA;
    }
    
    // Methoden - Anfragen und Aufträge
    public int getA() {
        return zA;
    }
    
    public void setA(int pA) {
        zA = pA;
    }
    
    public int getB() {
        return zB;
    }

    public void setB(int pB) {
        zB = pB;
    }
    
    public boolean isQuadrat() {
        return zA == zB;
    }
    
    public double getFlaecheninhalt() {
        return zA * zB;
    }
    
    public double getUmfang() {
        return 2 * (zA + zB);
    }
    
    public double getLaengeDiagonalen() {
        return Math.sqrt(zA * zA + Math.pow(zB, 2));
    }
    
    public double getUmkreisradius() {
        return 0.5 * getLaengeDiagonalen();
    }
    
    public int getInnenwinkel() {
        return 90;
    } 
    
    public String toString() {
        return String.valueOf(zA) + " * " + String.valueOf(zB);
    }    
}
