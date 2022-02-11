package com.labworks.lab1.view;

import java.util.Scanner;

public class InputUtility {
    private Scanner sc;
    private final NewspaperView view;

    public InputUtility(NewspaperView view) {
        this.sc = new Scanner(System.in);
        this.view = view;
    }

    public String[] inputIntValueWithScanner() {
        String[] chosenVariant;
        view.printMessage(NewspaperView.INPUT_DATA);
        while (true) {
            if (sc.hasNextInt()) {
                int variant = sc.nextInt();
                if (variant == 1) {
                    chosenVariant = new String[2];
                    chosenVariant[0] = "1";
                    view.printMessage(NewspaperView.INPUT_TYPE);
                    sc = new Scanner(System.in);
                    chosenVariant[1] = sc.nextLine();
                    return chosenVariant;
                } else if (variant == 2) {
                    chosenVariant = new String[1];
                    chosenVariant[0] = "2";
                    return chosenVariant;
                } else if (variant == 3) {
                    chosenVariant = new String[3];
                    chosenVariant[0] = "3";
                    view.printMessage(NewspaperView.INPUT_COMPANY);
                    chosenVariant[1] = sc.next();
                    view.printMessage(NewspaperView.INPUT_MAX_PRICE);
                    chosenVariant[2] = sc.next();
                    return chosenVariant;
                } else if (variant == 4) {
                    System.out.println("Система успешно завершена!");
                    System.exit(0);
                }
                else {
                    view.printMessage(NewspaperView.WRONG_INPUT_DATA +
                            NewspaperView.INPUT_DATA);
                    sc = new Scanner(System.in);
                }
            } else {
                view.printMessage(NewspaperView.WRONG_INPUT_DATA +
                        NewspaperView.INPUT_DATA);
                sc = new Scanner(System.in);
            }
        }
    }
}
