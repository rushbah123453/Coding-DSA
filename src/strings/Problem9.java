//https://mycode.prepbytes.com/coding/strings/ROTATETWO
package strings;

import java.util.Scanner;

public class Problem9 {


    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);
        int testCases=in.nextInt();


        for (int j=0;j<testCases;j++) {

            String originalPassword = in.next();
            String fakePassword = in.next();

            String leftRotation=fakePassword.substring(2,fakePassword.length())+fakePassword.substring(0,2);
            String rightRotation=fakePassword.substring(fakePassword.length()-2,fakePassword.length())+fakePassword.substring(0,fakePassword.length()-2);
            if ((leftRotation.equals(originalPassword))|| (rightRotation.equals(originalPassword))){
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }



        }

    }

}
