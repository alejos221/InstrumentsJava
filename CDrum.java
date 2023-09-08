// Filename: CDrum.java
// Description: Class to encapsulate the properties of a Drum
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CDrum extends CPercussionInst {
    // Member Variables
    private double diameter;
    private double depth;

    // Constructors
    public CDrum() {
        this.diameter(14.0);
        this.depth(6.0);
        System.out.println("Drum created.");
    }

    public CDrum(double diameter, double depth) {
        this.diameter(diameter);
        this.depth(depth);
        System.out.println("Drum created.");
    }

    // Accesor Functions
    public void diameter(double diameter) {if (diameter >= 0) this.diameter = diameter;}
    public void depth(double depth) {if (depth >= 0) this.depth = depth;}

    public double diameter() {return diameter;}
    public double depth() {return depth;}

    // Member Functions
    public boolean play(int pitch) { // plays a single hit
        //soundplayer(1, pitch); // this function would call a soundplayer function located in CPercussionInst
        return false;
    }

    public String get() {
        String word = "";
        if (!isTuned)
            word = "not ";
        return brand + " " + material + " Drum that is " + word + "tuned.";
    }
}