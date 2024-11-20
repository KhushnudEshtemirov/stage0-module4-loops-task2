package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int p = 1;
        int i = 1;
        while (i <= printToInclusive) {
            p *= i;
            System.out.println(p);
            i++;
        }
    }
}
