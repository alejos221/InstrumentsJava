// Filename: CMusicSheet.java
// Description: Class to encapsulate the properties of a MusicSheet
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CMusicSheet {
    final int MIN_VALUE = 0;
    final int MAX_VALUE = 255;

    // Member Variables
    private String title;
    private String composer;
    private int tempo;
    private int numPages;
    private int beatsPerMeasure;
    private int typeOfNote;

    // Constructors
    public CMusicSheet() {
        set("Unnamed", "Unknown", 0, 0, 0, 0);
        System.out.println("MusicSheet created.");
    }

    public CMusicSheet(String title, String composer, int tempo, int numPages, int beatsPerMeasure, int typeOfNote) {
        set(title, composer, tempo, numPages, beatsPerMeasure, typeOfNote);
        System.out.println("MusicSheet created.");
    }

    // Accesor Functions
    public void set(String title, String composer, int tempo, int numPages, int beatsPerMeasure, int typeOfNote) {
        this.title(title);
        this.composer(composer);
        this.bpm(tempo);
        this.pages(numPages);
        this.beats(beatsPerMeasure);
        this.noteType(typeOfNote);
    }
    public void title(String val) {title = val;}
    public void composer(String val) {composer = val;}
    public void bpm(int val) {
        if (val >= 0 && val <= 350) tempo = val;
    }
    public void pages(int val) {
        if (val >= 0) numPages = val;
    }
    public void beats(int val) {
        if (val >= 0) beatsPerMeasure = val;
    }
    public void noteType(int val) {
        if (val >= 0 && val <= 32) typeOfNote = val;
    }

    public String title() {return title;}
    public String composer() {return composer;}
    public int bpm() {return tempo;}
    public int pages() {return numPages;}
    public int beats() {return beatsPerMeasure;}
    public int noteType() {return typeOfNote;}
    // Member Functions

}