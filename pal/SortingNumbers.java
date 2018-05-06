package main.pal;

public class SortingNumbers {

	public static void main(String[] args) {
		
		int a[] = {3,1,5,2,2,9,0};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int k=0;k<a.length;k++){
			if(a[i]< a[k]){
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		  }
		}
		
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
		

	}

}
