package main.pal;

public class Slice {

	public static void main(String[] args) {
		//please check later
		int a[]={4,2,2,5,1,5,8};
		int slice=(a[0]+a[1])/2;
		int difference=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				difference=(a[i]+a[j])/j;
				if(Math.abs(difference)<slice){
					slice=Math.abs(difference);
				}
			}
		}
		
		System.out.println(slice);

	}

}
