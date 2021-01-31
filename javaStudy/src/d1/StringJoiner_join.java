package d1;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoiner_join {

	public static void main(String[] args)  {
		
		String animal = "dog,cat,bear,rabbit";
		String [] arr = animal.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		StringJoiner sj  = new StringJoiner("/", "start \t", "\tend");
		
		for (String string : arr) {
			sj.add(string);
		}
		
		System.out.println(sj.toString());
		
		System.out.println(String.join("-", arr));

	}
}
