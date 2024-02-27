/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva: Gerecs Diána, 2024-02-27
 */

import java.util.Scanner;

public class MainConsole {
    private String szallitasiktg = "";
    private String uzletiktg = "";
    private String javitasiktg = "";
    private Scanner scanner;

    public MainConsole() {
        scanner = new Scanner(System.in);
        drawHeader();
        startInput();
    }

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void startInput() {
        readInput();
        saveToFile();
    }

    private void readInput() {
        szallitasiktg = input("Szállítási költség: ");
        uzletiktg = input("Üzleti költség: ");
        javitasiktg = input("Javítási költség: ");
    }

    private void saveToFile() {
        Koltseg koltseg = new Koltseg(szallitasiktg, uzletiktg, javitasiktg);
        Filehandler filehandler = new Filehandler();
        filehandler.writeFile(koltseg);
    }

    private String input(String msg) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(msg);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        new MainConsole();
    }
}
