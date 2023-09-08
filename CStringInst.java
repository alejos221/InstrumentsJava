// Filename: CStringInst.java
// Description: Class to encapsulate the properties of a StringInst
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public abstract class CStringInst extends CInstrument {
    // Member Variables
    protected int numStrings;

    // Constructors
    public CStringInst() {
        this.numStrings = 0;
        System.out.println("StringInstrument created.");
    }

    // Accesor Functions
    public void strings(int val) {if (val >= 0) this.numStrings = val;}

    public int strings() {return numStrings;}


    // Member Functions
    public abstract boolean playSingleString(int stringN, int pitch);
}