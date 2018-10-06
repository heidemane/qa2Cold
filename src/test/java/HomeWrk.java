import org.junit.jupiter.api.Test;


public class HomeWrk {
            private String text = "Interest to pay for 10 years with ";

            @Test
            public void loanPercent() {
                interestToPay(20000,10);
                interestToPay(20000,8);
                interestToPay(20000,6);

            }

            private void interestToPay(Integer a, Integer b) {
                Integer  c = a * b / 100;

                System.out.println(text + b + "% of " + a + " is: " + c);

    }


}
