package main.pal;

import java.util.Arrays;

public class MinimumDifferenceArray {

	public static void main(String[] args) {
		int[] arrays={8,24,3,20,1,17};
		int difference=arrays[0]- arrays[1], prev_diff=0;
		int difference1=0, prev_diff1=0;
		
		for(int i=1;i<arrays.length-1;i++){
			for(int j=i+1;j<arrays.length;j++){
				if(Math.abs(arrays[i]-arrays[j])<Math.abs(difference)){
				difference=arrays[i]-arrays[j];
				}
				
			}
		}
		
		System.out.println("difference in distance     "+difference);
		
		System.out.println("-------------------");
		
		for(int i=0;i<arrays.length-1;i++){
			
				difference1=arrays[i]-arrays[i+1];
				if(difference1<prev_diff1){
					difference1=prev_diff1;
				}else {
					prev_diff1=difference1;	
				}
			
		}
		
		System.out.println("difference between 2 elements     "+difference1);
	}
}
