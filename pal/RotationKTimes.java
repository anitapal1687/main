package main.pal;

public class RotationKTimes {

	public static void main(String[] args) {
		//please check later
		int a[] = {3, 8, 9, 7, 6};
		int k=0;
		int temp;
		
		while(k<3){
			for(int j=1;j<a.length;j++){
			temp=a[j];
			a[a.length-1]=a[j-1];
			a[j-1]=temp;
			k++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
