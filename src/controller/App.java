package controller;

import view.UserInterface;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    private final UserInterface ui = new UserInterface();
    private final Scanner in = new Scanner(System.in);
    private final Inserts ins = new Inserts(in);

    public void run() {
        rootMenu();
    }

    private String getUserChoice(int numChoices) {
        String choice = "";

        // array of ints from 1 to numChoices inclusive
        int[] rangeInt = IntStream.rangeClosed(1, numChoices).toArray();

        // turn array of ints in array of strings
        String[] range = Arrays.stream(rangeInt).mapToObj(String::valueOf).toArray(String[]::new);

        do { choice = in.nextLine(); }
        while( !Arrays.asList(range).contains(choice));

        return choice;
    }

    private void rootMenu() {
        ui.showBanner();
        ui.showMenu("rootMenu.txt");
        String choice = getUserChoice(5);
        switch (choice) {
            case "1" -> insertMenu();
            case "2" -> updateMenu();
            case "3" -> simpleQueryMenu();
            case "4" -> complexQueryMenu();
            case "5" -> exit();
        }
    }

    private void exit() {
        ui.showExit();
        System.exit(0);
    }

    private void complexQueryMenu() { ui.showMenu("PesquisaComplexa.txt"); }

    private void simpleQueryMenu() { ui.showMenu("PesquisaSimples.txt"); }

    private void updateMenu() {
        ui.showMenu("Update.txt");
    }

    private void insertMenu() {
        ui.showMenu("Inserir.txt");

        String choice = getUserChoice(8);
        switch (choice) {
            case "1" -> ins.insertDriver();
            case "2" -> ins.insertDriverSchedule();
            case "3" -> ins.insertClient();
            case "4" -> ins.insertCarOwner();
            case "5" -> ins.insertCarType();
            case "6" -> ins.insertCar();
            case "7" -> ins.insertTrip();
            case "8" -> rootMenu();
        }
    }
}
