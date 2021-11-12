package demo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("london");
		cities.add("Paris");
		cities.add("Newyork");
		cities.add("Tokyo");
		
		for (String t :cities) {
			System.out.println(t);
			
		}
		System.out.println("Item stored at index 1 =" +cities.get(1));
		System.out.println("index of paris =" + cities.indexOf("Tokyo"));
		System.out.println(":Total items stored in the list =" +cities.size());
	} 

}
