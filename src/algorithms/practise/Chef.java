package algorithms.practise;


import java.util.*;

public class Chef {
    public static void main(String[] args) {

        isChefCooking();
    }

    private static void isChefCooking() {
        String str[] = {"fat", "fib", "carb", "fat", "fib","fat", "fib","carb","carb","fat", "fib", "carb"};
        String duplicate[] = {"fat", "fib", "carb", "fat", "fib","fat", "fib","carb","carb","fat", "fib", "carb"};
        List<String> list = new ArrayList<String>(Arrays.asList(str));
        List<String> duplist = new ArrayList<String>(Arrays.asList(str));
        int size=list.size();
        System.out.println(list);
        int array[] = new int[str.length];
        Map<String, Integer> map = new HashMap<>();
        map.put("fat",0);
        map.put("fib",0);
        map.put("carb",0);

        int pointer=0;
        for (int i = 0; i < size; i++) {
            if (map.get(duplist.get(i)) >= 1) {
                if (list.size() >= 2) {
                    list.remove(duplist.get(i));
                 String value=list.remove(0);
                    map.put(value, map.get(value) - 1);
                    map.put(duplist.get(i), map.get(duplist.get(i)) - 1);
                    array[i] = 1;

                }
            } else {
                map.put(duplist.get(i), map.getOrDefault(duplist.get(i), 0) + 1);
                array[i] = 0;

            }
        }


        for (int x:array){
            System.out.print(x+" ");
        }


    }
}
