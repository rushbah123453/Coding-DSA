//https://mycode.prepbytes.com/problems/searching/MAXPROBS

package dsa.searching;

import java.util.Scanner;

public class Problem7 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a[] = new int[2];
        for (int i=0;i<2;i++) {

            a [i]=scanner.nextInt();

        }


        maximizeProblem(a[0],240-a[1]);



    }

    private static void maximizeProblem(int n, int k) {


if (n<=0){
    return;
}

int sum=5;
int flag=-1;
boolean flags=false;

for (int i=2;i<=n;i++){


    if (sum<=k && k>=(sum+(5*i))){
        sum+=(5*i);
    }else {
       flag=i-1;
       flags=true;
       break;
    }

}

if(sum>k || !flags) {
    System.out.println(n);
}else if(flags){
    System.out.println(flag);
}


    }


}



/*
*
*
* Simpler approach
*
*
int n, k;
	cin >> n >> k;
	int beg = 0, end = n;
	int ans = 0;
	while(beg <= end)
	{
		int mid = (beg+end)/2;
		int l = 5*(mid*(mid+1))/2;
		if(l + k <= 240)
		{
			ans = mid;
			beg = mid+1;
		}
		else
		{
			end = mid-1;
		}
	}
    cout<<ans<<'\n';
*
*
*
* */
