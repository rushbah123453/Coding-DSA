package contest.practice.recurssion;

public class Problem1 {
    public static void main(String[] args) {
        int inputAray[]={1,2,3,4,5};
        printArray(inputAray,0);
    }

    private static void printArray(int[] inputAray, int position) {

        if (inputAray.length==position){
            return;
        }

        System.out.print(inputAray[position]+" ");

        printArray(inputAray,position+1);


    }
}
