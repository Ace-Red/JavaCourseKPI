package com.labworks.lab1.view;

import com.labworks.lab1.model.ArrayNewspaperModel;

public class NewspaperView {
    public static final String INPUT_DATA = """
            Выберите один из вариантов:
            1) Отримати список видань для заданого виду;
            2) Отримати список видань, які виходять кожен тиждень;
            3) Отримати список видань вказаного видавництва і ціна яких менше вказаної;
            4) Выход;
            Введите число варианта:\s""";
    public static final String WRONG_INPUT_DATA =
            "Такого варианта не существует! Повторите еще раз! ";
    public static final String OUT_DATA = "Ваш список:\n";
    public static final String INPUT_TYPE = "Введите тип полиграфии: ";
    public static final String INPUT_COMPANY = "Введите название компании: ";
    public static final String INPUT_MAX_PRICE = "Введите максимальную стоимость: ";
    public void printMessage(String message) {
        System.out.print(message);
    }
    public void printMessageAndResult(String message, ArrayNewspaperModel[] value) {
        System.out.println(message);
        for (ArrayNewspaperModel arrayNewspaperModel : value) {
            System.out.println(arrayNewspaperModel);
        }
    }
}
