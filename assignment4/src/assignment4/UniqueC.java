package assignment4;


public class UniqueC {
		boolean uniqueCharacters(String str)
	    {
	        for (int i = 0; i < str.length(); i++)
	            for (int j = i + 1; j < str.length(); j++)
	                if (str.charAt(i) == str.charAt(j))
	                    return false; 
	        return true;
	    }
		class demo{
			
		}
	 
	    public static void main(String[] args)
	    {
	        UniqueC obj = new UniqueC ();
	        String input = "saranya@ineuron";
	 
	        if (obj.uniqueCharacters(input))
	            System.out.println("The String " + input + " has all unique characters");
	        else
	            System.out.println("The String " + input + " has duplicate characters");
	    }
	}
