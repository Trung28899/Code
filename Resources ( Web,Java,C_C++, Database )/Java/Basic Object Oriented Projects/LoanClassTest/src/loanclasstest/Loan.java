
package loanclasstest;

class Loan {
    private double annualInterestRate; 
    private int numberOfYear; 
    private double loanAmount; 
    private java.util.Date loanDate; 
    
    public Loan()
    {
        annualInterestRate = 2.5;
        numberOfYear = 1;
        loanAmount = 1000;
    }
    
    public Loan (double annualInterestRate, int numberOfYear, double loanAmount)
    {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYear = numberOfYear;
    this.loanAmount = loanAmount;
    }
    
    public double getAnnualInterestRate()
    {
    return annualInterestRate; 
    }
    
    public int getNumberOfYear()
    {
    return numberOfYear;
    }
    
    public double getLoanAmount()
    {
    return loanAmount; 
    }
    
    public java.util.Date getLoanDate()
    {
    return loanDate;
    }
    
    public void setAnnualInterestDate(double annualInterestRate)
    {
    this.annualInterestRate = annualInterestRate;
    }
    
    public void setNumberOfYear(int numberOfYear)
    {
    this.numberOfYear = numberOfYear; 
    }
    
    public void setLoanAmount(double loanAmount)
    {
    this.loanAmount = loanAmount; 
    }
    
   public double getMonthlyPayment()
   {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
    (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
    return monthlyPayment;
   }
   
   public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYear * 12;
    return totalPayment;
    }
   
}
