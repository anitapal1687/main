package main.pal;

public class DuplicateCharacters {
	public static void main(String[] args) {
		  String s="friendships";
			 
			 char[] temp= new char[10];
			 for(int i=0;i<s.length();i++){
				 for(int j=i+1;j<s.length();j++){
					 if(s.charAt(i)==s.charAt(j)){
						 temp[i]=s.charAt(i);
						 //System.out.println("Duplicate Character"+c[i]);
						 
					 }
				 }
			 }
			
			 System.out.println("Duplicate Variables");
			 for(int i=0;i<temp.length;i++){
				 System.out.print(temp[i]);
			 }
			
			
	}
}
