package companyCodingQuestion.recommended.strings;

import java.util.*;

public class FormBiggestNumber {


    public static void main(String[] args) {

        Vector<String> arr=new Vector<>();
        arr.add("12");
        arr.add("34");
        arr.add("56");
        arr.add("78");
        arr.add("90");

        formBiggestNumber(arr);
    }

    private static void formBiggestNumber(Vector<String> arr) {


        String str[]={"12","34","56","78"};
        Collections.sort(Arrays.asList(str), new Comparator<String>() {
            @Override
            public int compare(String x, String y) {

                String xy=x+y;
                String yx=y+x;




                return xy.compareTo(yx)>0?-1:1;
            }
        });

        Iterator itr=Arrays.asList(str).iterator();

        while (itr.hasNext()){
            System.out.print(itr.next());
        }


    }
}
