package Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

        public static void main(String[] args) {
            String[] words1 = {"a", "b", "a", "c", "b"};
            String[] words2 = {"c", "b", "a"};
            String[] words3 = {"c", "c", "c", "c"};

            System.out.println(wordMultiple(words1)); // {"a": true, "b": true, "c": false}
            System.out.println(wordMultiple(words2)); // {"a": false, "b": false, "c": false}
            System.out.println(wordMultiple(words3)); // {"c": true}
        }

        public static Map<String, Boolean> wordMultiple(String[] words) {
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); //wordCount.getOrDefault(word, 0): Это выражение получает текущее количество вхождений строки word в wordCount. Если word уже есть в wordCount,
                // то get вернет текущее количество вхождений, в противном случае (если word еще не встречалось), вернется значение по умолчанию, которое в данном случае равно 0.

              //  + 1: Затем к полученному значению добавляется 1. Это увеличивает количество вхождений строки word на 1.

                //      wordCount.put(word, ...) затем обновляет карту (wordCount), устанавливая новое количество вхождений для строки word
            }

            Map<String, Boolean> result = new HashMap<>();


            for (String word : words) {
                result.put(word, wordCount.get(word) >= 2);
            }

            return result;
        }
    }


