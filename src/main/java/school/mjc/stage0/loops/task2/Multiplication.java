package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.println("");
        } else {
            int start = 0;
            int end = multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : 0;
            int step = multiplyByAndToInclusive > 0 ? 1 : -1;
            while (start != end + step) {
                System.out.println(start * multiplyByAndToInclusive);
                start += step;
            }
        }
    }
}
