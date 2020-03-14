
//https://mycode.prepbytes.com/coding/strings/LOVELETTER
package strings;

import java.util.Scanner;

public class Problem8 {


    public static void main(String[] args) {





        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

            String inputString = in.next();
            StringBuilder stringBuilder=new StringBuilder(inputString);
            if (!isPalindrome(inputString)){
               System.out.println( makePalindrone(stringBuilder));
            }else {
                System.out.println( 0);
            }

        }


    }

    private static int  makePalindrone(StringBuilder inputString) {

        int lowerBound=0,upperBound=inputString.length()-1;
        boolean flag=false;
        int action=0;
        while (lowerBound<upperBound)
        {
            char lower=inputString.charAt(lowerBound);
            char upper=inputString.charAt(upperBound);
            if(lower!=upper){

                if (upper>lower){
                    inputString.setCharAt(upperBound,lower);
                    int alphaDiff=upper-lower;
                    action=action+alphaDiff;

                }else {
                    inputString.setCharAt(lowerBound,upper);
                    int alphaDiff=lower-upper;
                    action=action+alphaDiff;
                }

            }
            lowerBound++;
            upperBound--;
        }

return action;

    }

    public static boolean isPalindrome(String inputString){

    int lowerBound=0,upperBound=inputString.length()-1;
    boolean flag=true;
    while (lowerBound<upperBound)
    {
        if(! (inputString.charAt(lowerBound++)==inputString.charAt(upperBound--))){
           flag=false;
            break;
        }
    }


        return flag;
    }


}
