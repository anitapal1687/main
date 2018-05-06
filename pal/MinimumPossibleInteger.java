package main.pal;

import java.util.Arrays;

public class MinimumPossibleInteger {
	public static void main(String[] args) {
		int a[]= {1,3,6,4,1,2};
		Arrays.sort(a);
		int difference=0;
		
		for(int i=0;i<a.length-1;i++){
		   if( a[i]-a[i+1]<1){
			   difference=a[i]+1;
		   } else{
			   continue;
		   }
		}
		
		System.out.println(difference);
				
	}
}
