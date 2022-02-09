package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int i;
		int[] data={3,2,11,4,6,7};
		Arrays.sort(data);
		List<Integer> list = new ArrayList<Integer>();
		for (i=0;i<data.length;i++)
		{list.add(data[i]);
		
			
		}
		System.out.println(list);
		 System.out.println(list.get(i -2));
		
	}

}
