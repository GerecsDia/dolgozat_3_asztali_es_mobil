/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva: Gerecs Diána, 2024-02-27
 */

public class Koltseg {
    private Double szallitasi;
    private Double uzleti;
    private Double javitasi;

    public Koltseg(String szallitasi, String uzleti, String javitasi) {
        try {
            this.szallitasi = Double.parseDouble(szallitasi);
            this.uzleti = Double.parseDouble(uzleti);
            this.javitasi = Double.parseDouble(javitasi);
        } catch (NumberFormatException e) {
            System.err.println("Hiba a szám konvertálásakor: ");
            System.err.println(e.getMessage());

        }
    }

    public Double getSzallitasi() {
        return szallitasi;
    }

    public Double getUzleti() {
        return uzleti;
    }

    public Double getJavitasi() {
        return javitasi;
    }
}