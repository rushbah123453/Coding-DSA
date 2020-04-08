//Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a3b5c4d1a2”.
// If you use Hashmap you wont get the keys in same order as that of printed
//If you use Treemap you wont get the keys in same order as that of input , it will be sorted
//You can also Use Frequency or ascii array a[256]
package companyCodingQuestion.recommended.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountStringOccurenes {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputString=scanner.next();

        printStringOccurrences(inputString);
    }

    private static void printStringOccurrences(String inputString) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (hashMap.containsKey(inputString.charAt(i))) {
                hashMap.put(inputString.charAt(i), hashMap.get(inputString.charAt(i)) + 1);
            } else {
                hashMap.put(inputString.charAt(i), 1);
            }
        }

        System.out.print(hashMap);
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            Character character = entry.getKey();
            Integer count = entry.getValue();
            System.out.print(character + "" + count);
        }

    }
}
