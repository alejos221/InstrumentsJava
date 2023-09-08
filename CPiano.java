// Filename: CPiano.java
// Description: Class to encapsulate the properties of a Piano
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CPiano extends CPercussionInst {
    // Member Variables
    private int keys;

    // Constructors
    public CPiano() {
        this.keys(88);
        System.out.println("Piano created.");
    }

    public CPiano(int keysN) {
        this.keys(keysN);
        System.out.println("Piano created.");
    }

    // Accesor Functions
    public void keys(int keysN) {if (keysN >= 0) keys = keysN;}

    public int keys() {return keys;}

    // Member Functions
    public boolean play(int keyN) { // plays a single key
        //soundplayer(keyN, 0); // this function would call a soundplayer function located in CPercussionInst
        return false;
    }

    public String get() {
        String word = "";
        if (!isTuned)
            word = "not ";
        return brand + " " + material + " Piano that is " + word + "tuned.";
    }
}