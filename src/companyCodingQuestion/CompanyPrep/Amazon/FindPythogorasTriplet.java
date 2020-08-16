package companyCodingQuestion.CompanyPrep.Amazon;

import java.util.HashSet;
import java.util.Set;

public class FindPythogorasTriplet {

    public static void main(String[] args) {
        int a[]={1,1,1,1};
        System.out.println(findTripletsmethod1(a));
    }

    private static boolean findTripletsmethod1(int[] a) {
        Set<Integer> set=new HashSet<>();
        for (int x:a){
            set.add(x);
        }

        for (int i=0;i<a.length;i++){
            int triplets[]=findTriplet(a[i]);
            if(set.contains(triplets[0]) && set.contains(triplets[1]))  return true;
        }

        return false;
    }

    private static int[] findTriplet(int num) {
        int res[]=new int[2];
        if(num%2==0){
            int ans= (int) Math.pow(num/2,2);
            res[0]=ans-1;
            res[1]=ans+1;
            return res;
        }else {
            int ans= (int) Math.pow(num,2);
            ans/=2;
            res[0]=ans;
            res[1]=ans+1;
        }
        return res;
    }
}
