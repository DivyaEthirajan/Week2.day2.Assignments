package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,3,2,6,8,4,5};//1,2,3,4,6,7,8
		Arrays.sort(arr);
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++)
	list.add(arr[i]);
	System.out.println(list);
	 int sum=0;
	 for (int i=0;i<list.size();i++)
	 {
		 sum=sum+list.get(i);
	 }
	 System.out.println(sum);
	 int sum1=0;
	 for(int j=1;j<= list.get((list.size())-1);j++)
	 { sum1=sum1+j;
	 }
	 System.out.println(sum1);
	 System.out.println(sum1 - sum);
		
	 }

	
		
		
		
	}

	
		 
