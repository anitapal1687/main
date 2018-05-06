package main.pal;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MostFrequentCharacter {

	public static void main(String[] args) {

     String s="anita pal is a junigleie and an idiot";
     
     HashMap<String,String> map=new HashMap<String,String>();
     
     for(int i=0;i<s.length();i++){
    	 int count=0;
    	 for(int j=0;j<s.length();j++){
    		 if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' '){
    			 map.put(String.valueOf(s.charAt(i)), String.valueOf(++count));
    		 }
    		 
    	 }
     }
     
     String s1= new String("abc");
     String s2= new String("abc1");
    
     
     int countString=0;
     String character="";
     for(Map.Entry<String, String> entry: map.entrySet()){
    	 if(Integer.parseInt(entry.getValue())>countString){
    		 countString=Integer.parseInt(entry.getValue());
    		 character=entry.getKey();
    	 }
     }
     
     System.out.println(character+"      "+ countString);

	}

	@Test
	public void unittest(){
		
	}
	    

}
