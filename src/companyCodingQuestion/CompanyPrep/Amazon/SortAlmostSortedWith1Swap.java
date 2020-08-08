package companyCodingQuestion.CompanyPrep.Amazon;

public class SortAlmostSortedWith1Swap {
    public static void main(String[] args) {
        int a[]={2,1};
        sortAlmostSortedArray(a);
        for (int x:a){
            System.out.print(x+" ");
        }
    }

    private static void sortAlmostSortedArray(int[] a) {
        if (a.length<=1)
            return;

        int start=0;
        int end=a.length-1;

        while (end>start && a[end-1]<a[end])
            end--;

        while (start<end && a[start]<a[start+1])
            start++;

        if (start!=end){
            swap(a,start,end);
        }
    }

    private static void swap(int[] a, int start, int end) {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
}
