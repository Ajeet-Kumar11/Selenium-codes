package epsilon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharacter
{

	public static void main(String[] args) 
	{
		String s ="interview";
		char[] arr=s.toCharArray();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(Character c:arr)
		{
			Integer count=m.get(c);
			if(count==null) 
			{
				m.put(c, 1);
			}
			else
			{
				m.put(c, ++count);
			}
		}
		Set<Entry<Character,Integer>> st=m.entrySet();
		for(Entry<Character,Integer> entry:st)
		{
			if(entry.getValue()>1)
			{
				System.out.println("repeated characters are"+" "+entry.getKey());
			}
			
		}

	}

}
