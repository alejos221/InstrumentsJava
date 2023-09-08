// Filename: CElectricGuitar.java
// Description: Class to encapsulate the properties of a ElectricGuitar
// Author: Boris Alarcon
// Date Last Modified: 12/14/2022
//

public class CElectricGuitar extends CGuitar {
    // Member Variables

    // Constructors
    public CElectricGuitar() {
        strings(6);
        System.out.println("Electric Guitar created.");
    }

    public CElectricGuitar(int strings) {
        strings(strings);
        System.out.println("Electric Guitar created.");
    }

    // Accesor Functions


    // Member Functions
    public String get() {
        String word = "";
        if (!isTuned)
            word = "not ";
        return brand + " " + material + " Electric Guitar that is " + word + "tuned.";
    }
}