package com.example.loancalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField AnnualInterestRate;

    @FXML
    private TextField NumOfYears;

    @FXML
    private TextField LoanAmount;

    @FXML
    private TextField MonthlyPayment;

    @FXML
    private TextField TotalPayment;

    @FXML
    private Button calculate;



    @FXML
    protected void calcButtonClick(){
        double interest=((Double.parseDouble(AnnualInterestRate.getText())) /100 )/12;
        double loan=Double.parseDouble(LoanAmount.getText());
        double numMonths=(Double.parseDouble(NumOfYears.getText()))*12;
        double power = (Math.pow((1+interest),numMonths));
        double monthlypayment = (loan * (interest * power))/ (power - 1);

        MonthlyPayment.setText(String.valueOf(monthlypayment));
        TotalPayment.setText((String.valueOf(monthlypayment*numMonths)));
    }

}