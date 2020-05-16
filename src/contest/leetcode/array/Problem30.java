package contest.leetcode.array;
//https://leetcode.com/problems/can-place-flowers/
public class Problem30 {
    public static void main(String[] args) {
        int flowerbed[]={0,0};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if (flowerbed.length==1){
            if (flowerbed[0]==0)
                count++;
        }

        if (flowerbed.length==2){
            if (flowerbed[0]==0 && flowerbed[1]==0 )
                count++;
        }

        for (int i=1;i<flowerbed.length-1;i++){

            if (flowerbed[i]==0 && flowerbed[i-1]==0 && i==1 ){
                count++;
                flowerbed[i-1]=1;
            }

            if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
               flowerbed[i]=1;
                count++;
                i++;
                if (i==flowerbed.length-2){
                    if (flowerbed[i]==0 && flowerbed[i+1]==0){
                        count++;
                    }
                }

            }else if (i==flowerbed.length-2){

               if (flowerbed[i]==0 && flowerbed[i+1]==0){
                   count++;
               }

            }
            else if (i==1){
                if (flowerbed[i]==0 && flowerbed[i-1]==0){
                    count++;
                }
            }

        }




        if (count>=n){
            return true;
        }else {
            return false;
        }
    }
}
