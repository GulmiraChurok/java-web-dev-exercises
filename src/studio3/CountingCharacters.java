package studio3;

import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.nextLine();
        word = word.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        //letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Integer> charGroup = new LinkedHashMap<>();
        //int counter = 0;
        for (char c : word.toCharArray()) {
            if (letters.contains(c)) {
                if (charGroup.containsKey(c)) {
                    // update the value by one+
                    int counter = charGroup.get(c);
                    counter++;
                    charGroup.put(c, counter);
                    //System.out.println(charGroup.get(c));
                } else {
                    charGroup.put(c, 1);
                }
                System.out.println(c);
            }
        }
        for (Map.Entry<Character, Integer> c : charGroup.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }
}

