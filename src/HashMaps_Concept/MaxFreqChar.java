package HashMaps_Concept;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFreqChar {
    public static void main(String[] args) {
        System.out.println(MaxFreCharacter("abdcbbffbbdbc"));
    }

    private static char MaxFreCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            //If the key is not already in the hashmap, I will add a new key with value 1.
            //If the key already exists, I will update increase the value by 1 for that key.
            if (map.containsKey(str.charAt(i))) {
                int of = map.get(str.charAt(i));
                int nf = of + 1;
                map.put(str.charAt(i), nf);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
            System.out.println();
            ArrayList<Character> list = new ArrayList<>(map.keySet());
            // {a, b, c, d, e, f}
            char maxChar = ' ';   //b
            int maxFreq = 0;      //6
            for (char ch : list) {
                if (map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }
            return maxChar;
        }
    }