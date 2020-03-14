package strings;

import java.util.*;

public class Problem10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        Map<Character, Integer> hashMap = null;
        for (int j = 0; j < testCases; j++) {
            int testCasesString = in.nextInt();
            Integer count = 0;
            hashMap = new HashMap<>();
            for (int i = 0; i < testCasesString; i++) {

                String innerString = in.next();

                String inputString=removeDuplicates(innerString);
                for (int k = 0; k < inputString.length(); k++) {



                    hashMap.put(inputString.charAt(k), hashMap.get(inputString.charAt(k)) == null ? 1 : hashMap.get(inputString.charAt(k)) + 1);

                }


            }

         //   System.out.println(hashMap.entrySet());

            Iterator it = hashMap.entrySet().iterator();
            //  boolean flag=false;
            int countStar=0;
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if ((Integer) pair.getValue() == testCasesString) {
                countStar++;
                }

            }

            System.out.println(countStar);
        }

    }


    public static String removeDuplicates(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if(!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        return result;
    }

}
