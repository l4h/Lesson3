package GeekBrains.Java2.Lesson3;

import java.util.*;

public class ArrayWords {

    private ArrayList<String> words = new ArrayList<>(20);
    private Set<String> uniqueWords = new HashSet<>();

    public ArrayWords(String[] strings) {
        words.addAll(Arrays.asList(strings));
    }

    public void getCountUnique() {
        uniqueWords.addAll(this.words);
        System.out.println("Count unique words:" + uniqueWords.size() + "\n" + uniqueWords);
    }

    public void countWords() {
        Map<String, Integer> countWords = new HashMap<>();
        for (String word : words) {
            countWords.compute(word, (a, b) -> b == null ? 1 : b + 1);
        }
        System.out.println("count words of collection:" + countWords);
    }
}


