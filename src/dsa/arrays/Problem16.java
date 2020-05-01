package dsa.arrays;


import java.util.Scanner;

//  7 3 5 1 5 4 2 3 6 2  output: -1 5 -1 5 -1
//
public class Problem16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        int array[] = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            array[i] = scanner.nextInt();
        }
        logic(array);
    }

    private static void logic(int[] array) {

        int i = 0;
        for (; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    array[i] = array[j];
                    break;
                } else {
                    if (j == array.length - 1)
                        array[i] = -1;
                }
            }
        }

        array[i] = -1;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
