package stringobjects;


public class StringObjects {

    
    public static void main(String[] args) {
                String str="Java Programming";
		
		//length of the string
		System.out.println("length of the string: "+str.length());
		
		//first word of string
		System.out.println("first word of the string: "+str.substring(0, 4));
		
		//last word of string
		System.out.println("last word of the string: "+str.substring(5, 16));
        
		//substring from index 3 to 7
		System.out.println("substring from index 3 to 7: "+str.substring(3, 8));
		
		//replacing character m with t
		System.out.println("replaced string is: "+str.replace('m', 't'));
		
		//converting string to upperCase
		System.out.println("uppercase of the string: "+str.toUpperCase());
		
		//converting string to lowerCase
		System.out.println("lowercase of the string: "+str.toLowerCase());
		
		//first character of string
		System.out.println("first character of the string: "+str.charAt(0));
		
		//last character of string
		System.out.println("last character of the string: "+str.charAt(str.length()-1));
		
		//Check if the string contains a specific substring
		String substring="Programming";
		if(str.contains(substring)) 
			System.out.println("string contains '"+substring+"'");
	        else
		    System.out.println("string does not contains '"+substring+"'");
		
		
		//Trim leading and trailing whiteSpaces from a string
		String str1="     Hello World    ";
		System.out.println(str1);
		System.out.println("trimmed string: "+str1.trim());
		
		//Check if a string starts with a specific prefix
		String prefix="Java";
		System.out.println(str.startsWith(prefix));
		
		
		//Check if a string starts with a specific suffix
		String suffix="Programming";
		System.out.println(str.endsWith(suffix));	
		
		//concatenation of strings
		String str2="Welcome to";
		System.out.println(str2.concat(" "+str));
		
		//finding index of a character
		System.out.println(str.indexOf('P'));
		
		//index of 'a' from right to left
		System.out.println(str.lastIndexOf('a'));
		
		//index of 'a' from left to right
		System.out.println(str.indexOf('a'));
                
                //checking both strings are equal or not
                String str3="Java Programming";
                System.out.println(str.equals(str3));
    }
    
}
