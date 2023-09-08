// Filename: CGuitar.java
// Description: Class to encapsulate the properties of a Guitar
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CViolin extends CStringInst {
    // Member Variables


    // Constructors
    public CViolin() {
        strings(4);
        System.out.println("Guitar created.");
    }

    public CViolin(int strings) {
        strings(strings);
        System.out.println("Guitar created.");
    }

    // Accesor Functions


    // Member Functions
    public boolean playSingleString(int stringN, int pitch) { // plays a single string
        if (stringN > strings()) {
            //soundplayer(stringN, pitch); // this function would call a soundplayer function located in CStringInst
            return true;
        }
        else return false;
    }

    public boolean play(int pitch) { // plays all strings combined
        //soundplayer(0, pitch); // // this function would call a soundplayer function located in CStringInst
        return false;
    }

    public String get() {
        String word = "";
        if (!isTuned)
            word = "not ";
        return brand + " " + material + " Violin that is " + word + "tuned.";
    }
}