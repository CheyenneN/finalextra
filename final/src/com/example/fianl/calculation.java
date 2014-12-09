package com.example.fianl;

public class calculation {
	btnGo = new JButton("Go!");
    GridBagConstraints gbc_btnGo = new GridBagConstraints();
    gbc_btnGo.insets = new Insets(0, 0, 5, 0);
    gbc_btnGo.gridx = 3;
    gbc_btnGo.gridy = 6;
    contentPane.add(btnGo, gbc_btnGo);
    btnGo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {

            double totalGrossIncome = Double.parseDouble(textFieldTotalGrossIncome.getText());
           
            double totalMonthlyDebt = Double.parseDouble(textFieldTotalMonthlyDebt.getText());
           
            double mortgageInterestRate = Double.parseDouble(textFieldMortgageInterestRate.getText());
           
            double term = Double.parseDouble(textFieldTerm.getText());
           
            double payment = Double.parseDouble(textFieldPayment.getText());
           
            double housingPayment = (totalGrossIncome/12)*0.18;
            double other = ((totalGrossIncome/12)*0.36) - totalMonthlyDebt;
           
            double max;
            if (housingPayment > other){
                max = other;
            }
            else{
                max = housingPayment;
            }
           
            double amountOfMortgage = (max)*(1-Math.pow((1+(mortgageInterestRate/100)/12),(-(term*12/12)*12)))*(12/(mortgageInterestRate/100));
           
            DecimalFormat df = new DecimalFormat("#.##");
            String sHousingPayment = df.format(housingPayment);
            String sOther = df.format(other);
            String sMax = df.format(max);
            String sAmountOfMortgage = df.format(amountOfMortgage);
           
            txtHousingpayment.setText(sHousingPayment);
            textFieldOther.setText(sOther);
            textFieldMax.setText(sMax);
            textFieldAmountofMortgage.setText(sAmountOfMortgage);
        }
}
