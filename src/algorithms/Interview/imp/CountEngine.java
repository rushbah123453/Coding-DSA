
/*




Word Count Engine
Implement a document scanning function wordCountEngine, which receives a string document and returns a list of all unique words in it and their number of occurrences, sorted by the number of occurrences in a descending order. If two or more words have the same count, they should be sorted according to their order in the original sentence. Assume that all letters are in english alphabet. You function should be case-insensitive, so for instance, the words “Perfect” and “perfect” should be considered the same word.

The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.

Analyze the time and space complexities of your solution. Try to optimize for time while keeping a polynomial space complexity.

Examples:

input:  document = "Practice makes perfect. you'll only
                    get Perfect by practice. just practice!"

output: [ ["practice", "3"], ["perfect", "2"],
          ["makes", "1"], ["youll", "1"], ["only", "1"],
          ["get", "1"], ["by", "1"], ["just", "1"] ]
Important: please convert the occurrence integers in the output list to strings (e.g. "3" instead of 3). We ask this because in compiled languages such as C#, Java, C++, C etc., it’s not straightforward to create mixed-type arrays (as it is, for instance, in scripted languages like JavaScript, Python, Ruby etc.). The expected output will simply be an array of string arrays.

Constraints:

[time limit] 5000ms
[input] string document
[output] array.array.string


 */


package algorithms.Interview.imp;

import java.util.*;

class Solution {

  static String[][] wordCountEngine(String document) {
    // your code goes here
    
    String stringWithoutSC = document.replaceAll("[^\\w\\s]","");
    String[] strArray=stringWithoutSC.split(" ");
    for(String x:strArray)
    {
      System.out.println(x);
    }
          System.out.print("end");
    Map<String,Integer> map=new HashMap<>();
    List<String> list=new ArrayList<>();
    int max=0;
    for(String str:strArray)
    {
      if(str.length()==0)continue;
      if(map.containsKey(str.toLowerCase()))
      {
        map.put(str.toLowerCase(),map.get(str.toLowerCase())+1);
      }else{
        list.add(str.toLowerCase());
                map.put(str.toLowerCase(),1);
      }
      
      max=Math.max(max,map.get(str.toLowerCase()));
    }
    
    
    
    List<List<String>> resList=new ArrayList<>();
    for(int i=0;i<=max;i++)
    {
      resList.add(i,new ArrayList<>());
    }
    
    for(int i=0;i<list.size();i++)
    {
      int idx=map.get(list.get(i));
      resList.get(idx).add(list.get(i));
    }
    
    String[][] res=new String[list.size()][2];
    int row=0;
    for(int i=resList.size()-1;i>=0;i--)
    {
      
      for(String val:resList.get(i))
      {
        res[row][0]=val;
        res[row][1]=String.valueOf(map.get(val));
        row++;
      }
   
    }
    
    
    return res; 
    
  }

  public static void main(String[] args) {

  }

}




/*
r'[^\w\s]'
STR= "Practice makes perfect. you'll only
                    get Perfect by practice. just practice!"
  
Str,.regex() =   "Practice makes perfect youll only
                    get Perfect by practice just practice"
  
str.upperCase()= 
 
  str[]
  
  <String,Integer>
  
  PRACTICE: (2,idx)
  MAKES: 1
  PERFECT:2
  YOULL:1
  ONLY:1
  GET:1
  BY:1
  JUST:1
  
  PRACTICE: 2, 2
  MAKES: 1
  PERFECT:2 , 1
  YOULL:1
  ONLY:1
  GET:1
  BY:1
  JUST:1
  
  
  2: [PRACTICE,PERFECT]
  
  bucket sort [012]
  
    
    
   2: [practice,perfect] 
   1: [makes,get,only] 
    Maximum Heap 
    
    
    class Custom{
    
   
   String str;
   int count;
   int index
   
    }
    
 */   
  
