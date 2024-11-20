package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1;
        int p = 1;
        while (multiplyByAndToInclusive >= i) {
            p *= i;
            System.out.println(p);
            i++;
        }
    }
}
