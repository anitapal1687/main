package main.pal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;



public class DistinctNumbers {

	public static void main(String[] args) {
		Integer a[]={2,1,1,2,3,1};
	List list=Arrays.asList(a);
	TreeSet<Integer> set= new TreeSet<Integer>();
	for(int i=0;i<list.size();i++){
		set.add(a[i]);
	}
	
	
	
	int distinct = list.size()-set.size();
	
	System.out.println("distinct  "+distinct);
		
		

	}

}
