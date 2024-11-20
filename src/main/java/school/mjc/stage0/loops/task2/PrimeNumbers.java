package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        while (printToInclusive > 1) {
            int k = 2;
            int i = 2;
            while (i <= printToInclusive / 2) {
                if (printToInclusive % i == 0) {
                    k++;
                }
                i++;
            }
            if (k == 2) {
                System.out.println(printToInclusive);
            }
            printToInclusive--;
        }
    }
}
