package main.pal;

public class CodeilityProgram1 {
	  public static void main(String[] args) {
		  int a[]={2,1,5,-6,9};
		  int count=0;
		  
		  for(int i=0;i<a.length-1;i++){
			  for(int j=i+1;j<a.length;j++){
				  if((a[i]+a[j])%2==0){
					  count++;
				  }
			  }
		  }
		  System.out.println("count   : "+count);
	  }
}
