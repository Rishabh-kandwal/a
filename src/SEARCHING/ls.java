package SEARCHING;

public class ls 
{
	public static void main(String[] args) {
		System.out.println(new ls().liner(new int[]{10,11,22,33,44,55,76,87,98,100},33));
	}
	int liner(int a[],int s) 
	{
		int i=0;
		for(int j:a) 
		{
			
			if(j==s) 
			{
				return i;
			}
			i++;
		}
		return i;
	}
}
