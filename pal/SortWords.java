package main.pal;

public class SortWords {

	public static void main(String[] args) {
     String s="Words";
     
    
     System.out.println(s);
	 char[] c=new char[s.length()];
	 
	 
	 
	 for(int i=0;i<s.length();i++){
		 c[i]=s.charAt(i);
	 }
	 char temp;
	 
	 for(int i=0;i<c.length;i++){
		 for(int j=0;j<c.length;j++){
			 if(c[i]>c[j]){
				 temp=c[i];
				 c[i]=c[j];
				 c[j]=temp;
			 }
		 }
	 }
	 

	 String newS= String.valueOf(c);
	 System.out.println(newS);

	
	}
	
	

}
