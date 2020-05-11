package dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {

    public static void main(String[] args) {

        mostCommonWord("",new String[]{""});
    }


    public static String mostCommonWord(String paragraph, String[] banned) {


        paragraph="a, a, a, a, b,b,b,c, c";
        banned=new String[]{"a"};

        for (int i=0;i<banned.length;i++){
            paragraph=paragraph.replace(banned[i],"").trim();
        }

        paragraph= paragraph.replaceAll("\\W+"," ");
        paragraph=paragraph.replaceAll("^\\s+","");


        String arr[]=paragraph.split(" ");

        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(""))
                continue;
            if (!hashMap.containsKey(arr[i].toLowerCase())){
                hashMap.put(arr[i].toLowerCase(),1);
            }else {
                hashMap.put(arr[i].toLowerCase(),hashMap.get(arr[i].toLowerCase())+1);
            }
        }

        int max=0;
        String res="";
        for (Map.Entry<String,Integer> map:hashMap.entrySet()){
       if(max<map.getValue()){
           max=map.getValue();
           res=map.getKey();
       }
        }

        System.out.println(hashMap);
        System.out.println(res);

       return res;


    }
}
