import org.junit.jupiter.api.Test;


public class HomeWrk {
    private String text = "Interest to pay for 10 years";

    @Test
    public void calculateLoanPayment () {

        int loanAmount = 1000;
        int termInYears = 10;
        double interestRate = 0.1;
        double interestRate2 = 0.08;
        double interestRate3 = 0.06;

        double toPay1 = loanAmount * (1 + termInYears * interestRate);
        double toPay2 = loanAmount * (1 + termInYears * interestRate2);
        double toPay3 = loanAmount * (1 + termInYears * interestRate3);
        double toPayTotal = toPay1+toPay2+toPay3;

        System.out.println(text + toPay1);
        System.out.println(toPay2);
        System.out.println(toPay3);
        System.out.println("Tolal amount to pay" + " " + toPayTotal);
    }

}