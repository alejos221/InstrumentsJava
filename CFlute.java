// Filename: CFlute.java
// Description: Class to encapsulate the properties of a Flute
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CFlute extends CAirInst {
    // Member Variables


    // Constructors
    public CFlute() {
        valveHoles(3);
        System.out.println("Flute created.");
    }

    public CFlute(int holes) {
        if (holes < 20)
            valveHoles(holes);
        System.out.println("Flute created.");
    }

    // Accesor Functions


    // Member Functions
    public boolean playSingleValve(int valveN, int pitch) { // plays a single valve/hole
        if (valveN > valveHoles()) {
            //soundplayer(valveN, pitch); // this function would call a soundplayer function located in CStringInst
            return true;
        }
        else return false;
    }

    public boolean play(int pitch) { // plays all valves combined
        //soundplayer(0, pitch); // // this function would call a soundplayer function located in CStringInst
        return false;
    }

    public String get() {
        String word = "";
        if (!isTuned)
            word = "not ";
        return brand + " " + material + " Flute that is " + word + "tuned.";
    }
}