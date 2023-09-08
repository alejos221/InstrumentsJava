// Filename: InstrumentsJava.java
// Description: The main entry point for the instruments objects
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class InstrumentsJava {
    public static void main(String args[]) {


        CInstrument[] myInstruments = new CInstrument[10];

        int lastInstIndex = 0;
        myInstruments[lastInstIndex] = new CElectricGuitar(8); // 8 strings instead of standard 6
        myInstruments[lastInstIndex].setInfo("Turam", "Wood", "Brown", 400.0, true);
        lastInstIndex++;

        myInstruments[lastInstIndex] = new CPiano(); // default number of keys (88)
        myInstruments[lastInstIndex].setInfo("Thomas Hankton", "Wood", "Black", 7400.0, false);
        lastInstIndex++;

        myInstruments[lastInstIndex] = new CDrum(14, 6); // 14" diameter, 6" depth
        myInstruments[lastInstIndex].setInfo("Yamaha", "Acrylic", "White/Orange", 180.0, true);
        lastInstIndex++;

        myInstruments[lastInstIndex] = new CTrumpet(4); // 4 valves
        myInstruments[lastInstIndex].setInfo("Jupiter", "Wood", "Brown", 400.0, true);
        lastInstIndex++;
        
        System.out.println("\nWelcome to Instruments Java!!!\n");


        System.out.println(myInstruments[0].get());
        //myInstruments[1].play(0)  // SOUNDPLAYER to be implemented
                                    // In this case it would strum all the cords/keys; play every cord/key audio at the same time.
                                    // These audio files would be stored in a separate folder according to their instrument.
        System.out.println(myInstruments[1].get());
        myInstruments[1].tuned(true);
        System.out.println(myInstruments[1].get());
        System.out.println(myInstruments[2].get());   
        System.out.println(myInstruments[3].get()); 
    }
}

