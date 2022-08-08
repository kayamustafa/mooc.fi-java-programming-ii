package application;

import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Chart {
    private int savingsAmount;
    private double interestRate;
    
    XYChart.Series savings;
    XYChart.Series savingsWithInterest;
    
    public Chart(int savingsAmount, double interestRate){
        this.savingsAmount = savingsAmount;
        this.interestRate = interestRate;
        savings = new XYChart.Series();
        savingsWithInterest = new XYChart.Series();
    }
    
    public Parent getView(){
        
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Money");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        
        
        savings.setName("Savings");
        
        savingsWithInterest.setName("Savings with interest");
        
        addDataToSavings(savingsAmount);
        addDataToInterest(savingsAmount, interestRate);
        
        lineChart.getData().add(savings);
        lineChart.getData().add(savingsWithInterest);
        
        return lineChart;
        
    }
    
    public void addDataToSavings(int savingsAmount){
        savings.getData().clear();
        int total = 0;
        for(int i = 0; i<=30; i++){
            savings.getData().add(new XYChart.Data(i, total)); 
            total += savingsAmount * 12;     
        }
    }
    
    public void addDataToInterest(int savingsAmount, double interestRate){
        savingsWithInterest.getData().clear();
        double interest = 0;
        double totalWithoutInterest = 0;
        for(int i = 0; i<=30; i++){
            savingsWithInterest.getData().add(new XYChart.Data(i, totalWithoutInterest + interest)); 
            totalWithoutInterest += savingsAmount * 12 + interest;
            interest = totalWithoutInterest * interestRate / 100;
        }
    }
    
}
