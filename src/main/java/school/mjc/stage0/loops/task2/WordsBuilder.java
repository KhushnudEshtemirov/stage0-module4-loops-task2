package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String s = "";
        int i = 0;
        while (i <= chars.length - 1) {
            s += chars[i];
            System.out.println(s);
            i++;
        }
    }
}
