package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	//Build a logic to find the given strings are anagram or not

	
		public static boolean anagramCheck(String str1, String str2) //creating a boolean with parametarized method
	    {
	        boolean status = true; // declaring boolean variable
	        String s1 = str1.replaceAll("", ""); // replacing the original value with blanks
	        String s2 = str2.replaceAll("", "");

	        if(s1.length() != s2.length()) // checking the length of the string comparing both the strings
	        {
	            status = false;
	        }else {
	            char[] array1 = s1.toLowerCase().toCharArray(); // storing the string to char array
	            char[] array2 = s2.toLowerCase().toCharArray();
	            Arrays.sort(array1); //sort the array1
	            Arrays.sort(array2);
	          
	            status = Arrays.equals(array1, array2); //comparing both the array strings with equals method of string
	        }
	        if(status) {
	            System.out.println(s1+ " and " + s2 + " are anagrams");  //printing if both the strings are same
	        }
	        else {
	            System.out.println(s1+ " and " + s2 + " are not anagrams"); //printing if both the strings are not same
	        }

	        return status;
	    }
		
		public static void main(String[] args) {
			Anagram ob=new Anagram(); //create object for Anagram Class
			ob.anagramCheck("stops", "potss"); //call the method with values
		}}
