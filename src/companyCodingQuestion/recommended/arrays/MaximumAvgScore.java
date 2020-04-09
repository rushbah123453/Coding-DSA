//https://www.geeksforgeeks.org/students-with-maximum-average-score-of-three-subjects/
package companyCodingQuestion.recommended.arrays;

import java.util.ArrayList;

public class MaximumAvgScore {

    public static void main(String[] args) {
        String[] file = { "Shrikanth", "20", "30",
                "10", "Ram", "100", "50", "10" };
        getStudentsList(file);
    }

    private static void getStudentsList(String[] file) {


        ArrayList<String> studentName=new ArrayList<>();

        int avgScore=0;
        int maxScore=Integer.MIN_VALUE;
        for (int i=0;i<file.length;i+=4){

            avgScore=((Integer.parseInt(file[i+1])+Integer.parseInt(file[i+2])+Integer.parseInt(file[i+3])))/3;

            if (avgScore>maxScore){
                maxScore=avgScore;
                studentName.clear();
                studentName.add(file[i]);
            }

            else if (avgScore==maxScore){
                studentName.add(file[i]);
            }

        }

        for (String name:studentName){
            System.out.print(name+" ");
        }

        System.out.println(maxScore);

    }

}
