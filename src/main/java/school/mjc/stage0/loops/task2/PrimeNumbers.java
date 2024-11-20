package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int j = 2;
        while (j <= printToInclusive) {
            int k = 2;
            int i = 2;
            while (i <= j / 2) {
                if (j % i == 0) {
                    k++;
                }
                i++;
            }
            if (k == 2) {
                System.out.println(j);
            }
            j++;
        }
    }
}
