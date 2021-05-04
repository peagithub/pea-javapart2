package com.buzzfreeze.homworkjava2;

public class homworkarray { //8.1
	public static void main(String[] args) {
		String[] typefruit = {"Thai fruit1","Thai fruit2","Other fruit"};
		String[][] fruit = new String[3][];
		fruit[0] = new String[]  {"banana", "mango" ,"guava"};
		fruit[1] = new String[]  {"orange","mangosteen","lychee"};
		fruit[2] = new String[]  {"grape","lemon","apple"};
		String str = "" ;
		for (int i = 0 ; i < typefruit.length; i++) {
			str += typefruit[i] + ":" ;
			for (int j= 0 ; j < fruit[i].length; j++) {
				if(j>0) {
					str += "," ;
				}
				str += fruit[i][j];
			}
			str += "\n";
					}
		System.out.println(str);
		
	}
}


class myArray {  // 8.2
	public static void main(String[] args) {
		int[][]  myNumArray = { {3 ,4 , 5, 6},{7,8,9,10},{6,8,9,7}};
		int sum = 0 ;
		for (int i = 0 ; i < myNumArray.length ; i++){
				for (int j = 0 ; j < myNumArray[i].length ; j++){
					sum = myNumArray[0][3]+ myNumArray[1][3]+ myNumArray[2][3];
			}
				
		}
		System.out.println("Total of last element is"+"  " +sum);
	}
}
		


	
