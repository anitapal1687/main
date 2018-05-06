package main.pal;

public class ReducedString {

	public static void main(String[] args) {
		String s ="ABABBABC";
		String reducedString="";
		int c=0;
		StringBuffer sb= new StringBuffer(s);
		
		while(c<sb.length()-1){
			if(sb.charAt(c)==sb.charAt(c+1)){
				sb.delete(c, c+2);
				c=0;
			} else{
				c+=1;
			}

		}
		
		System.out.println(sb);
				

	}

}
