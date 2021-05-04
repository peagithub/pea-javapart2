package com.buzzfreeze.homworkjava2;

// 7.
public class homeworkstring2 {                  //7.1
	public static void main(String[] args) {
		String string1 = "You and Me";
		String string2 = "you and me";
			if (string1.equals(string2))
				System.out.println("equle");
			else 
				System.out.println("not equle");
			
		String string3 = "and";                  //7.2
		String myword = "we";
		 	System.out.println(string1.contains(string3));
		 	System.out.println(string1.contains(myword));
		 	
		int lengthString1 = string1.length(); 	//7.3
			System.out.println(lengthString1); 
		
		String newWord = string1.substring(4);  //7.4
			System.out.println(newWord);
		
		String newWord2 = string1.trim();  //7.5
			System.out.println(newWord2);
		
		String upperCase = string1.toUpperCase();  //7.6
			System.out.println(upperCase);
	}
	
}

class MethodChaining {  //7.7
	public static void main(String[] args) {
		String string2 = "you and me";
			System.out.println(setCapital(string2));
	}
	static String setCapital(String name) {
		return name.trim().toUpperCase() ;

		}
}

