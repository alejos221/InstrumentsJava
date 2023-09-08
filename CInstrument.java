// Filename: CInstrument.java
// Description: Class to encapsulate the properties of a Instrument
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public abstract class CInstrument {
    // Member Variables
    protected double price;
    protected String color;
    protected String brand;
    protected String material;
    protected CMusicSheet musicSheet;
    protected boolean isTuned;

    // Constructors
    public CInstrument() {
        this.brand = "Unknown";
        this.material = "Unknown";        
        this.color = "Unknown";
        this.price = 0.0;
        this.musicSheet = new CMusicSheet();
        this.isTuned = false;
        System.out.println("Instrument created.");
    }

    // Accesor Functions
    public void brand(String val) {this.brand = val;}
    public void material(String val) {this.material = val;}
    public void color(String val) {this.color = val;}
    public void price(double val) {this.price = val;}
    public void setMusicSheet(String title, String composer, int tempo, int numPages, int beatsPerMeasure, int typeOfNote) {
        this.musicSheet.set(title, composer, tempo, numPages, beatsPerMeasure, typeOfNote);
    }
    public void tuned(boolean val) {this.isTuned = val;}

    public void setInfo(String b, String m, String c, double p, boolean t) {
        this.brand = b;
        this.material = m;
        this.color = c;
        if (price >= 0) this.price = p;
        this.isTuned = t;
    }

    // Member Functions
    public abstract boolean play(int pitch);
    public abstract String get();
}