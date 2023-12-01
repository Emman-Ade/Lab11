/**
 * File: Lab11Prob03
 * Class: CSCI 1302 
 * Author: Emmanuel Adeniyi and Corey Brown
 *  * Created on: December 1, 2023
 * Last modified: December 1, 2023 
 * Description: Creating a reverseString recursive method with an integer that keeps track of the current index
 */
public class Lab11Prob03 {
	public static String reverseString(String s, int n) {
		//problem 3
		if(n > 0) {
			return s.charAt(n) + reverseString(s,n-1);
		}else {
			return "" + s.charAt(0);
		}
	}

	//problem 2
	public static String reverseString(String s) {
		return reverseString(s,s.length() - 1);
		
	}
	public static void main(String[] args) {
		System.out.println(reverseString("Stop",3));
	}
}
