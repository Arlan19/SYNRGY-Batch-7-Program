package ch1.pertemuan5;

import java.util.HashMap;

public class AnagramHashMap
{
	static void isAnagram(String mystr1, String mystr2)
	{
	
		String str1 = mystr1.replaceAll("\\s", "").toLowerCase();
		String str2 = mystr2.replaceAll("\\s", "").toLowerCase();
		
		boolean status = true;
		
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			
			for (int i = 0; i < str1.length(); i++)
			{
				char charAsKey = str1.charAt(i);
				
				int charCountAsValue = 0;
				

				if(map.containsKey(charAsKey))
				{
					charCountAsValue = map.get(charAsKey);
				}
				
				map.put(charAsKey, ++charCountAsValue);
				charAsKey = str2.charAt(i);
				charCountAsValue = 0;
				
				if(map.containsKey(charAsKey))
		        {
					charCountAsValue = map.get(charAsKey);
				}
		 
				map.put(charAsKey, --charCountAsValue);
			}
			
			
			for (int value : map.values())
			{
				if(value != 0)
				{
					status = false;
		        }
				
			}
			
			if(status)
		    {
				System.out.println(mystr1+" dan "+mystr2+" merupakan anagram");
		    }
		    else
		    {
		    	System.out.println(mystr1+" dan "+mystr2+" bukan merupakan anagram");
		    }
		        
		}
	}	

    public static void main(String[] args)
    { 
    	isAnagram("katak", "kodok");
        isAnagram("bisa", "bias"); 
    }
}