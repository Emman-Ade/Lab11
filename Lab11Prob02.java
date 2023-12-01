/**
 * File: Lab11Prob02
 * Class: CSCI 1302 
 * Author: Emmanuel Adeniyi and Corey Brown
 *  * Created on: December 1, 2023
 * Last modified: December 1, 2023 
 * Description: Creating a reverseString recursive method
 */
public class Lab11Prob02 {
	public static String reverseString(String s) {
		if(s.length() == 1) {
			return s;
		}else {
			return reverseString(s.substring(1)) + s.charAt(0);
		}
	}
	public static void main(String[] args) {
		System.out.println(reverseString("Stop"));
	}
}
