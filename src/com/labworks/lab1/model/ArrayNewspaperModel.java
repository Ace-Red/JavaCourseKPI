package com.labworks.lab1.model;

import java.util.Random;

public class ArrayNewspaperModel {
    private static NewspaperModel[] filteredNewspaper;
    private static final String[] NAME_ARR = new String[]{"Forbes", "OTTOBRE", "Вишиванка", "Megatour", "ВСЕ О РУКОДЕЛИИ", "Florium",
            "Sanwerk", "Vivienne", "Адеф-Украина", "Диана плюс"};
    private static final String[] TYPE_ARR = new String[]{"Газета", "Журнал", "Ежегодник", "Научный журнал", "Календари", "Литературный журнал", "Справочник", "Литература", "Библиографический указатель", "Реферативный сборник"};
    private static final String[] COMPANY_ARR = new String[]{"Грамота", "Ранок", "Освіта", "Генеза", "Академія", "Дух і Літера", "Аверс", "Країна Мрій", "Основи", "Дніпро"};
    private static final String[] FULL_NAME_ARR = new String[]{"Суворов Константин Иванович", "Сидоров Даниил Дмитриевич", "Крылов Ярослав Артёмович", "Васильев Савелий Георгиевич", "Петров Артём Евгеньевич", "Николаев Тимофей Дмитриевич", "Егоров Василий Львович", "Соколов Андрей Львович", "Степанов Максим Андреевич", "Иванов Тимофей Дамирович"};

    public NewspaperModel[] getArrayNewspaper() {
        return filteredNewspaper;
    }

    public void setArrayNewspaper(NewspaperModel[] arrayNewspaper) {
        ArrayNewspaperModel.filteredNewspaper = arrayNewspaper;
    }

    public NewspaperModel[] createArray(int count) {
        NewspaperModel[] array = new NewspaperModel[count];
        for (int i = 0; i < array.length; i++) {
            int randNameIndex = new Random().nextInt(NAME_ARR.length);
            int randTypeIndex = new Random().nextInt(TYPE_ARR.length);
            float randPrice = 70 + new Random().nextFloat() * (500 - 70);
            int randPeriod = 1 + (int) (new Random().nextFloat() * (14 - 1));
            int randCompanyIndex = new Random().nextInt(COMPANY_ARR.length);
            int randFullNameIndex = new Random().nextInt(FULL_NAME_ARR.length);
            NewspaperModel obj = new NewspaperModel(NAME_ARR[randNameIndex], TYPE_ARR[randTypeIndex], randPrice, randPeriod, COMPANY_ARR[randCompanyIndex], FULL_NAME_ARR[randFullNameIndex]);
            array[i] = obj;
        }
        return array;
    }

    public NewspaperModel[] chooseNewspapersWithCurrentType(String type, NewspaperModel[] array) {
        int counter = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getType().equals(type)) {
                counter += 1;
            }
        }
        NewspaperModel[] result = new NewspaperModel[counter];
        int indexResArr = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getType().equals(type) && indexResArr<=counter) {
                result[indexResArr] = newspapers;
                indexResArr+=1;
            }
        }
        return result;
    }

    public NewspaperModel[] chooseNewspaperWithIssueEveryWeek(NewspaperModel[] array) {
        int counter = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getPeriodicity() <= 7) {
                counter += 1;
            }
        }
        NewspaperModel[] result = new NewspaperModel[counter];
        int indexResArr = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getPeriodicity() <= 7 && indexResArr<=counter) {
                result[indexResArr] = newspapers;
                indexResArr+=1;
            }
        }
        return result;
    }

    public NewspaperModel[] chooseNewspaperWithCurrentCompanyNameAndCurrentPrice(NewspaperModel[] array, String company, float maxPrice) {
        int counter = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getCompany().equals(company) && newspapers.getPrice() <= maxPrice) {
                counter += 1;
            }
        }
        NewspaperModel[] result = new NewspaperModel[counter];
        int indexResArr = 0;
        for (NewspaperModel newspapers : array) {
            if (newspapers.getCompany().equals(company) && newspapers.getPrice() <= maxPrice && indexResArr<=counter) {
                result[indexResArr] = newspapers;
                indexResArr+=1;
            }
        }
        return result;
    }
}
