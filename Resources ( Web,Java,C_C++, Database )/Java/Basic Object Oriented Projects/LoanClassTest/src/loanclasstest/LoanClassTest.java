
package loanclasstest;

public class LoanClassTest {
    public static void main(String[] args) {
    
        Loan a = new Loan();
        
        System.out.println("the annual interest rate is: "+a.getAnnualInterestRate());
        a.setNumberOfYear(5);
        System.out.println("the number of year is: "+a.getNumberOfYear());
        System.out.println("the loan amount is: "+a.getLoanAmount());
        System.out.println("the monthly payment is: "+a.getMonthlyPayment());
        System.out.println("the total payment is: "+a.getTotalPayment());
        
        BMI b = new BMI("Trung Trinh", 19, 145, 66.93);
        System.out.println("Trung Trinh BMI score is: "+b.getBMI());
        System.out.println("Trung Trinh is: "+b.getStatus());
    }
    
}
