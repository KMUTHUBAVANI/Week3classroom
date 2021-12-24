package week3.day2;
import java.util.*;
public class RemoveDuplicates 
{
    
	public static void main(String[] args) 
	{
		String Input="PayPal India";

      
		ArrayList<String> al = new ArrayList<String>();
      //storing String character in arraylist
		for(int i = 0; i < Input.length(); i++)
			{
				al.add(Character.toString(Input.charAt(i)));
			}
      // printing ArrayList
		System.out.println(al);//[H,e,l,l,o]
		
	}
}


