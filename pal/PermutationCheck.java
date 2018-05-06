package main.pal;

import java.util.Arrays;

public class PermutationCheck {

	public static void main(String[] args) {
		int[] a={1,8,3,4};
		int[] k={8,3,1,4};
		
		//Solution 1
		Arrays.sort(a);
		Arrays.sort(k);
		if(Arrays.equals(a, k)){
			System.out.println(1);
		} else{
			System.out.println(0);
		}
		
		
		

	}

}
