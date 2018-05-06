package main.pal;

public class CountDiv {

	public static void main(String[] args) {
		int start=6;
		int end=11;
		int divisible=2, count=0;
		
		for(int i=start;i<=end;i++) {
			if((i % divisible)==0) {
				count++;
			}
		}
	
		System.out.println("count "+count);

	}

}
