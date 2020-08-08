package companyCodingQuestion.CompanyPrep.Amazon;

public class MinElementInRightRotatedArray {
    public static void main(String[] args) {
     int a[]={2,3,1,2,2,2,2};
     MinElementInRightRotatedArray rotatedArray=new MinElementInRightRotatedArray();
    int minElement= rotatedArray.findMinimum(a);
        System.out.println(minElement);
    }

    private int findMinimum(int[] a)
    {
        if(a.length<=0)
            return -1;
        int start=0;
        int end=a.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (a[mid]>a[end]){
                start=mid+1;
            }else {

                end=mid;
            }


        }
        return a[start];
    }

}
