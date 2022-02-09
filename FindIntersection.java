package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int[] arr1 = {1,2,8,4,9,7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
			
		}
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			list1.add(arr1[i]);
		}
		
for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i));
			
		for(int j=0;j<list1.size();j++) {
			//System.out.println(list1.get(j));
			
		if(list.get(i)==list1.get(j))
		{
			System.out.println(list.get(i));
			break;//System.out.println(lst.get(j));
		}
		}
		}
	}}
	
		


