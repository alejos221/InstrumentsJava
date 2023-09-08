// Filename: CAirInst.java
// Description: Class to encapsulate the properties of a AirInst
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public abstract class CAirInst extends CInstrument {
    // Member Variables
    protected int valveHoles;

    // Constructors
    public CAirInst() {
        this.valveHoles = 0;
        System.out.println("Air Instrument created.");
    }

    // Accesor Functions
    public void valveHoles(int val) {this.valveHoles = val;}

    public int valveHoles() {return valveHoles;}

    // Member Functions
    public abstract boolean playSingleValve(int valveN, int pitch);
}