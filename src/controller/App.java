package controller;

import view.UserInterface;

import java.util.Objects;
import java.util.Scanner;

public class App {
    private UserInterface userInterface;
    private Scanner in = new Scanner(System.in);
    private String choice;

    public void run() {
        userInterface = new UserInterface(true);
        userInterface.showMenu();
        do {
            choice = in.nextLine();
        } while (!Objects.equals(choice, "1") && !Objects.equals(choice, "2") && !Objects.equals(choice, "3")
                && !Objects.equals(choice, "4") && !Objects.equals(choice, "5"));
        processChoice(choice);
    }

    private void processChoice(String choice) {
        System.out.println(choice);
        switch (choice) {
            case "1" -> showInsertMenu();
            case "2" -> showUpdateMenu();
            case "3" -> showSimpleQueryMenu();
            case "4" -> showComplexQueryMenu();
            case "5" -> showExit();
        }
    }

    private void showExit() {
    }

    private void showComplexQueryMenu() {
    }

    private void showSimpleQueryMenu() {
    }

    private void showUpdateMenu() {
    }

    private void showInsertMenu() {
        userInterface.showInsertsMenu();
    }
}
