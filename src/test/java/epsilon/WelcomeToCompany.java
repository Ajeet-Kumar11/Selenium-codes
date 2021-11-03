package epsilon;

public class WelcomeToCompany
{
	public static String expword(String s)
	{
		char[] arr=s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z' || arr[i]==' ')
			{
				if(arr[i]==' ')
				{
					arr[i+1]=(char)(arr[i+1]-32);
				}
				sb.append(arr[i]);
			}
		}
		return sb.toString();	
	}

	public static void main(String[] args) 
	{
		String s ="Welcome to {Company}";
		System.out.println(expword(s));
		

	}

}
