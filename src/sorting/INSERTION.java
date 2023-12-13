package sorting;

public class INSERTION 
{
	void InsertionSort(int a[]) 
	{
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=i+1;j>0 ;j--) 
			{
				if(a[j]<a[j-1]) 
				{
					swap(a,j,j-1);
				}
				else 
				{
					break;
				}
			}
			
		}
	}

	 private void swap(int[] a, int j, int i)
	 {
		 int t=a[j];
		 a[j]=a[i];
		 a[i]=t;
		 
	 }

	void  disp(int[] a)
	{

		for(int j=0;j<a.length;j++) 
		{
			System.out.println(a[j]);
		}
		
	}
	 public static void main(String[] args)
	 {

			int a[]=new int[] {12,2,13,2,4,5,10};
			new INSERTION().InsertionSort(a);
			new INSERTION().disp(a);
	 }
	
}
