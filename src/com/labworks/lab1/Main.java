package com.labworks.lab1;


import com.labworks.lab1.view.InputUtility;
import com.labworks.lab1.view.NewspaperView;

public class Main {

    public static void main(String[] args) {
        NewspaperView view = new NewspaperView();
        InputUtility utility = new InputUtility(view);
        utility.inputIntValueWithScanner();

        /* NewspaperModel[] array = NewspaperModel.createArray(50);
        for (NewspaperModel newspapers : array) {
            System.out.println(newspapers);
        }
        System.out.println("=================");
        NewspaperModel.chooseNewspapersWithCurrentType("Справочник",array);
        System.out.println("=================");
        NewspaperModel.chooseNewspaperWithIssueEveryWeek(array);
        System.out.println("=================");
        NewspaperModel.chooseNewspaperWithCurrentCompanyNameAndCurrentPrice(array,"Аверс",400); */
    }

}
