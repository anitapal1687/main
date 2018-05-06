package main.pal;

public class CombinationOfString {

	public static void main(String[] args) {
	//please check later
		String s="123456";
		
		while(s.length()>0){
			//combine();
		}
		
	}
	
	private void combine(int start, String s, int end){
		for(int i=start;i<end;i++){
			System.out.println(s.substring(start, end));
		}
	}

}
