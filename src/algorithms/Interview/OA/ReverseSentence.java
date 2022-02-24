package algorithms.Interview.OA;
/*
You are given an array of characters arr that consists of sequences of characters separated by space characters. Each space-delimited sequence of characters defines a word.

Implement a function reverseWords that reverses the order of the words in the array in the most efficient manner.

Explain your solution and analyze its time and space complexities.

input:  arr = [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
                'm', 'a', 'k', 'e', 's', '  ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]

output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ',
          'm', 'a', 'k', 'e', 's', '  ',
          'p', 'e', 'r', 'f', 'e', 'c', 't' ]


 */
public class ReverseSentence {
    static char[] reverseWords(char[] arr) {
        // your code goes here


        int n=arr.length-1;
        int front=0;
        int back=n;
        reverse(arr,front,back);
        int j=0;

        for (int i=0;i<=n;i++){
            if(i!=0 && arr[i]==' '){
                reverse(arr,j,i-1);
                j=i+1;
                // System.out.println(Arrays.toString(arr));
            }else if(i==n){
                reverse(arr,j,i);
            }



        }

 /*  for(char ch:arr)
      {
        System.out.print(ch);
      }*/

        return arr;



    }


    private static void reverse(char[] arr,int front,int back){
        while(front<back)
        {
            char temp = arr[back];
            arr[back] = arr[front];
            arr[front] = temp;
            front++;
            back--;
        }
    }

    public static void main(String[] args) {

    }

}
