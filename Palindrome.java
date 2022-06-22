package week2.day1.assignments;

public class Palindrome {
	
	//Build a logic to find the given string is palindrome or not
	
	public static void Palin(String str) //declare method Palin with parameter as str
	{
		String rev ="";		//declare another string as rev
		for (int i=str.length()-1;i>=0;i--) {  //iterate over string in reverse order
		char charAt=str.charAt(i);	//convert string to character
		rev=rev+charAt; 	//add character into rev
		}
		System.out.println(str);	//print the original string
		System.out.println(rev);	//print the reversed string
		if(str.equalsIgnoreCase(rev))	//compare original string with reversed string using .equalsIgnoreCase method
			{
				System.out.println("it is a palindrome");	//if equals print as palindrome
				
			}
			else
			{
				System.out.println("it is not a palindrome");	//if not equal print as not a palindrome
			}
	}
		public static void main(String[] args) {
			Palindrome ob=new Palindrome(); //create object for palindrome class
			ob.Palin("madam"); //call the object with given value
		}
}
		
		
		
		
		
		
		
		
		
		

	
	
	
