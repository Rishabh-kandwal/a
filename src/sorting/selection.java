package sorting;

//import java.util.function.IntConsumer;

public class selection 
{
	int max(int a[],int r) 
	{
		int h=0,in=0;
		for(int i=0;i<=r;i++) 
		{
			if(a[i]>h)
			{
				h=a[i];
				in=i;
			}
		}
		return in;
	}
	void sort(int a[]) 
	{
		int r=a.length-1;
		for(int i=0;i<a.length;i++,r--) 
		{
			int h=max(a, r);
		//	swap(a ,h, r);
			int t=a[h];
			a[h]=a[r];
			a[r]=t;
			 
		}
		
	}
	
	void disp(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int a[]=new int[] {12,2,13,2,4,5,10};
		//System.out.println("calling Descending order");
		new  selection().sortD(a); 
		new  selection().disp(a);

	}

	
}