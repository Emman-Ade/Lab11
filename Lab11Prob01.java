/**
 * File: Lab11Prob01 
 * Class: CSCI 1302 
 * Author: Emmanuel Adeniyi and Corey Brown
 *  * Created on: December 1, 2023
 * Last modified: December 1, 2023 
 * Description: Creating a recurrence relation with a recurrence method
 */
public class Lab11Prob01 {
	public static long recursiveAbstract(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 3;
		}else if(n == 2) {
			return 4;
		}else {
			return recursiveAbstract(n - 3) * recursiveAbstract(n - 2) * recursiveAbstract(n - 1);
		}
	}
	public static void main(String[] args) {
		System.out.println(recursiveAbstract(3));
	}
}
