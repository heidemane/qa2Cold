import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanHomeWork {
    private double amountClientNeeds = 3000;
    private double amountToPay = 16200;

    @Test
    public void loanHomeWork() {

        double totalSumToPay;
        double sumFor10Years;
        double sumFor20Years;
        double sumFor30Years;

        sumFor10Years = (amountClientNeeds * (1 + 10 * 0.1));
        sumFor20Years = (amountClientNeeds * (1 + 10 * 0.08));
        sumFor30Years = (amountClientNeeds * (1 + 10 * 0.06));

        totalSumToPay = sumFor10Years + sumFor20Years + sumFor30Years;

        Assertions.assertEquals(amountToPay,totalSumToPay,"Calculations are wrong");


    }
}
