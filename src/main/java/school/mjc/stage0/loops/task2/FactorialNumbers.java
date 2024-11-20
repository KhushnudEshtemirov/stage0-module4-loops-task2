package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int p = 1;
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 0) {
                System.out.println(1);
            } else {
                p *= i;
                System.out.println(p);
            }
            i++;
        }
    }
}
