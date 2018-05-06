package main.pal;

public class ReplaceDuplicateCharacter {

	public static void main(String[] args) {
		 String s="friendships";
		 
		 System.out.println("String with Duplicate Variables");
		 System.out.println(s);

		 for(int i=0;i<s.length();i++){
			 for(int j=i+1;j<s.length();j++){
				 if(s.charAt(i)==s.charAt(j)){
					 String replace= String.valueOf(s.charAt(i));
				  s=s.replaceAll(replace, "");					 
				 }
			 }
		 }
		
		 System.out.println("String without Duplicate Variables");
		 System.out.println(s);
		 
		
	}

}
