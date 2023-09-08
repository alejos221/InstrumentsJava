// Filename: CTrumpet.java
// Description: Class to encapsulate the properties of a Trumpet
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CTrumpet extends CAirInst {
    // Member Variables


    // Constructors
    public CTrumpet() {
        valveHoles(3);
        System.out.println("Trumpet created.");
    }

    public CTrumpet(int valves) {
        if (valves == 3 || valves == 4)
            valveHoles(valves);
        System.out.println("Trumpet created.");
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
        return brand + " " + material + " Trumpet that is " + word + "tuned.";
    }
}