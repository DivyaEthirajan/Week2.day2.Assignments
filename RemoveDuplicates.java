package week3.day2;

import java.util.*; 

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java1 ";
		
		String strArray[] = text.split(" ");
		List<String> list1 = new ArrayList<String>();
	      Collections.addAll(list1, strArray);
	      Set<String> set = new LinkedHashSet<String>(list1);
	      StringBuilder sbf  =new StringBuilder();
	      for( String eachName:set)
	    	  {sbf.append(eachName); 
	    	  sbf.append(" ");}
	      System.out.print(sbf);
	      
	      
	      
	}
}
