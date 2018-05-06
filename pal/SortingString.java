package main.pal;

public class SortingString {

	public static void main(String[] args) {
		
	String[] s={"f","r","q","a","c","h"};
	String temp="";
	
	for(int i=0;i<s.length;i++){
		for(int j=0;j<s.length;j++){
			if(s[i].compareTo(s[j])<0){
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	
	for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
	}

	}
}
