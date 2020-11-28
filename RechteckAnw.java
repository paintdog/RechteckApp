
/**
 * Beschreiben Sie hier die Klasse RechteckAnw.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RechteckAnw
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Rechteck rechteck;

    /**
     * Konstruktor für Objekte der Klasse RechteckAnw
     */
    public RechteckAnw()
    {
        // Instanzvariable initialisieren
        rechteck = new Rechteck(4, 6);
    }

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(4, 6);
        
        System.out.println("Seite a: " + rechteck.getA());
        System.out.println("Seite b: " + rechteck.getB());
        
        System.out.println("Flächeninhalt: " + rechteck.getFlaecheninhalt());
        System.out.println("Umfang: " + rechteck.getUmfang());
        System.out.println("Länge der Diagonalen: " + rechteck.getLaengeDiagonalen());
        System.out.println("Umkreisradius: " + rechteck.getUmkreisradius());
        System.out.println("Innenwinkel: " + rechteck.getInnenwinkel() + " °");
        if (rechteck.isQuadrat()) {
            System.out.println("Das Rechteck ist ein Quadrat!");
        } else {
            System.out.println("Das Rechteck ist kein Quadrat!");
        }
        System.out.println(rechteck);
        
        System.out.println("\n");
        Rechteck rechteck2 = new Rechteck(4);
        System.out.println(rechteck2);
        if (rechteck2.isQuadrat()) {
            System.out.println("Das Rechteck ist ein Quadrat!");
        } else {
            System.out.println("Das Rechteck ist kein Quadrat!");
        }
        
        
    }
}
