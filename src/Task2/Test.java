package Task2;

import java.util.HashMap;
import java.util.Map;

public class Test {

        public static void main(String[] args) {
            String[] words1 = {"code", "bug"};
            String[] words2 = {"man", "moon", "main"};
            String[] words3 = {"man", "moon", "good", "night"};

            System.out.println(pairs(words1)); // {"a": true, "b": true, "c": false}
            System.out.println(pairs(words2)); // {"a": false, "b": false, "c": false}
            System.out.println(pairs(words3)); // {"c": true}
        }

        public static Map<String, String> pairs (String[] words) {
            Map<String, String> map = new HashMap<>();


            for (String word : words) {
                map.put(Character.toString(word.charAt(0)) ,Character.toString(word.charAt(word.length()-1)));
            }
            return map;
        }
    }

