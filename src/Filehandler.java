/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva: Gerecs Diána, 2024-02-27
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    public void writeFile(Koltseg koltseg) {
        try {
            FileWriter fw = new FileWriter("adat.txt", true);
            fw.write(koltseg.getSzallitasi().toString() + ":");
            fw.write(koltseg.getUzleti().toString() + ":");
            fw.write(koltseg.getJavitasi().toString() + "\n");
            fw.close();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    private void handleIOException(IOException e) {
        System.err.println("Hiba történt a fájlírás során: ");
        System.err.println(e.getMessage());
    }
}

/*
 * Készíthetünk egy olyan osztályt,
 * amely kizárólag az adatok adatbázisba
 * történő írását kezeli.
 */
