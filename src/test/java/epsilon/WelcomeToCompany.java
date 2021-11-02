package epsilon;

public class WelcomeToCompany
{
	public static String expword(String s)
	{
		char[] arr=s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a' && arr[i]<='z' || arr[i]==' ')
			{
				sb.append(arr[i]);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) 
	{
		String s ="welcome to {company}";
		System.out.println(expword(s));
		

	}

}
