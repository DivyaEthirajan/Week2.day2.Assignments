package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,4,5,3,6,3,7,9,4};
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		
		System.out.println(list);


		
	Set<Integer> set = new HashSet<Integer>();
	for(int eachValue :list)
	{
		if(set.add(eachValue)==false)
	
		System.out.println(eachValue);
	}

}}
