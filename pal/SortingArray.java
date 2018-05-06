package main.pal;

public class SortingArray {

	public static void main(String[] args) {
		int[] arrays={8,24,3,20,1,17};
		int temp;
		
		for(int i=0;i<arrays.length;i++){
			for(int j=0;j<arrays.length;j++){
				if(arrays[i]>arrays[j]){
					temp=arrays[i];
					arrays[i]=arrays[j];
					arrays[j]=temp;
			}
			}
		}
		
		
		for(int i=0;i<arrays.length;i++){
			System.out.println(arrays[i]);
		}
	
	}

}
