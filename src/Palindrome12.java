
public class Palindrome12 {

	public static void main(String[] args) {
		
		String str="madam";
		String reverse="";
		
		System.out.println(str.length());
	
		for (int i = str.length()-1; i >= 0; i--) 
		{
			 reverse=reverse+str.charAt(i);
			
			 //System.out.println(reverse);
		}

		System.out.println(reverse);
		if(str.equals(reverse))
			
			System.out.println("given string is palindrome");
		else
			System.out.println("given string is not  palindrome");
	}

}
