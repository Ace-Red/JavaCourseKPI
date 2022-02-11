package com.labworks.lab1.controller;


import com.labworks.lab1.model.ArrayNewspaperModel;
import com.labworks.lab1.model.NewspaperModel;
import com.labworks.lab1.view.InputUtility;
import com.labworks.lab1.view.NewspaperView;


public class NewspaperController {
    private final ArrayNewspaperModel model = new ArrayNewspaperModel();
    private final NewspaperView view = new NewspaperView();
    private final InputUtility utility = new InputUtility(view);
    private final NewspaperModel[] arrModel = model.createArray(10);

    public void program() {
        for (NewspaperModel newspaperModel : arrModel) {
            System.out.println(newspaperModel);
        }
        while (true) {
            String[] variant = utility.inputIntValueWithScanner();
            model.setArrayNewspaper(userChose(variant));
            view.printMessageAndResult(NewspaperView.OUT_DATA,model.getArrayNewspaper());
        }

    }

    public NewspaperModel[] userChose(String[] variant) {
        if (Integer.parseInt(variant[0]) == 1) {
            return model.chooseNewspapersWithCurrentType(variant[1], arrModel);
        } else if (Integer.parseInt(variant[0]) == 2) {
            return model.chooseNewspaperWithIssueEveryWeek(arrModel);
        } else {
            return model.chooseNewspaperWithCurrentCompanyNameAndCurrentPrice(arrModel, variant[1], Float.parseFloat(variant[2]));
        }

    }

}
