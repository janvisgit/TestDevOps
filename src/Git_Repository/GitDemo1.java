package Git_Repository;

import org.testng.annotations.Test;

public class GitDemo1 {
	
	@Test
	public void reverse() 
	{
		String a = "Janvi";
		String rev="";
		
		for(int i = a.length()-1; i>=0; i--) 
		{
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
	}

}
