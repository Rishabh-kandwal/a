package sorting;


public class BUBBLE {

	public void bubbleD(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1-i;j++) 
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		new BUBBLE().Display(a);
	}
	public void bubbleA(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-i-1;j++) 
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				
			}
		}
		new BUBBLE().Display(a);
	}
	
	private void Display(int[] a)
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}	
		System.out.println();
	}

	public static void main(String[] args)
	{
		int a[]=new int[] {12,2,13,2,4,5,10};
		System.out.println("calling Descending order");
		new BUBBLE().bubbleA( a); 
//		System.out.println("calling descending order");
//		new BUBBLE().bubbleD( a); 

	}

}
