package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "PayPal India";
		char[] ch = name.toCharArray();
		System.out.println(ch);
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (Character character : ch) {
			if(charSet.contains(character)) {
				dupCharSet.add(character);
			}
			else
			{
			charSet.add(character);
			
		}
		}
			for (Character remove : dupCharSet) {
				if(charSet.contains(remove))
				{
					charSet.remove(remove);
				}
			}
			for (Character print : charSet) {
				if(Character.isLetter(print))
				System.out.println(print);
			}
				
			}

	}


